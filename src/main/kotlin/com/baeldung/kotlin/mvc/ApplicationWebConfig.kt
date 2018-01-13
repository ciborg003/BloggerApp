package com.baeldung.kotlin.mvc

import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.thymeleaf.spring4.SpringTemplateEngine
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver
import org.thymeleaf.spring4.view.ThymeleafViewResolver
import org.thymeleaf.templatemode.TemplateMode
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver


@Configuration
class ApplicationWebConfig : WebMvcConfigurerAdapter(), ApplicationContextAware {

        private var applicationContext: ApplicationContext? = null

    override fun setApplicationContext(applicationContext: ApplicationContext?) {
        this.applicationContext = applicationContext
    }

    @Bean
    fun templateResolver(): ClassLoaderTemplateResolver {
        val resolver = ClassLoaderTemplateResolver()
                .apply { prefix = "templates/" }
                .apply { suffix = ".html" }
                .apply { isCacheable = false }
                .apply { templateMode = TemplateMode.HTML }
                .apply { characterEncoding = "UTF-8" }

        return resolver;
    }

    @Bean
    fun templateEngine(): SpringTemplateEngine {
        return SpringTemplateEngine()
                .apply { setTemplateResolver(templateResolver()) }
    }

    @Bean
    fun viewResolver(): ThymeleafViewResolver{
        return ThymeleafViewResolver()
                .apply { templateEngine = templateEngine() }
                .apply { characterEncoding = "UTF-8" };
    }

    override fun addViewControllers(registry: ViewControllerRegistry?) {
        if (registry != null) {
            registry.addViewController("/").setViewName("index")
        };
    }
}
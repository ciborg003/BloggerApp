package com.baeldung.kotlin.web

import com.baeldung.kotlin.mvc.ApplicationWebConfig
import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.context.support.ReloadableResourceBundleMessageSource
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer
import java.util.*

/**
 *Created by Ilya Pavlovsky on 12/23/2017 8:20 PM
 */

@EnableWebMvc
open class WebConfig: AbstractAnnotationConfigDispatcherServletInitializer {

    constructor() : super()

//    @Bean
//    fun messageSource(): MessageSource {
//        val msgSource = ReloadableResourceBundleMessageSource()
//        msgSource.setBasename("classpath:validation")
//        msgSource.setDefaultEncoding("UTF-8")
//
//        return msgSource
//    }

    override fun getServletMappings(): Array<String> {
        return Array<String>(1) {"/"}
    }

    override fun getServletConfigClasses(): Array<Class<*>> {
        return Array<Class<*>>(1) {ApplicationWebConfig::class.java}
    }

    override fun getRootConfigClasses(): Array<Class<*>>? {
        return null;
    }

}
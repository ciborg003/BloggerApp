//package com.baeldung.kotlin.security
//
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
//import org.springframework.security.config.annotation.web.builders.HttpSecurity
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
//import org.springframework.security.core.userdetails.UserDetailsService
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
//import org.springframework.security.crypto.password.PasswordEncoder
//
//@Configuration
//@EnableWebSecurity
//class WebSecurityConfig: WebSecurityConfigurerAdapter() {
//
//    @Autowired
//    lateinit var userDetailService: UserDetailsService
//
//    @Bean
//    fun passwordEncoder(): PasswordEncoder {
//        val encoder = BCryptPasswordEncoder()
//        return encoder
//    }
//
//    override fun configure(http: HttpSecurity?) {
////        super.configure(http)
//        if (http != null) {
//            http.csrf().disable()
//
//            http
//                    .exceptionHandling().accessDeniedPage("/access-denied")
//                    .and()
//                    .authorizeRequests()
//                    .antMatchers("","/resources/**","/login","/sign-up").permitAll()
//                    .antMatchers("/room/**").hasRole("USER")
//                    .anyRequest().authenticated()
//                    .and()
//                    .formLogin().loginPage("/login")
//                    .and()
//                    .logout()
//
//
//        }
//
//        @Autowired
//        @Throws(Exception::class)
//        fun configureGlobal(auth: AuthenticationManagerBuilder) {
//            auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder())
//        }
//    }
//}
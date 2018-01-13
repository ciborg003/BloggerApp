package com.baeldung.kotlin

//import com.baeldung.kotlin.dao.UserRepository
import com.baeldung.kotlin.model.User
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 *Created by Ilya Pavlovsky on 12/22/2017 10:08 PM
 */

@SpringBootApplication
open class BlogApplication{
}

fun main(args: Array<String>) {
    SpringApplication.run(BlogApplication::class.java, *args)
}
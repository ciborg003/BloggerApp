package com.baeldung.kotlin.controller

import com.baeldung.kotlin.model.User
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 *Created by Ilya Pavlovsky on 12/22/2017 10:27 PM
 */

@Controller
@RequestMapping("/")
class BlogController{
    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun doIndexGet(model: Model): String {
        return "welcome";
    }

    @GetMapping(value = "/profile")
    fun getProfile(model: Model): String{
        return "profile"
    }
}
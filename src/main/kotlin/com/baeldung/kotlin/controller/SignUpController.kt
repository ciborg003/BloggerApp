package com.baeldung.kotlin.controller

import com.baeldung.kotlin.dao.RoleRepository
import com.baeldung.kotlin.model.User
import com.baeldung.kotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/sign-up")
class SignUpController {

    @Autowired
    lateinit var userService: UserService
    @Autowired
    lateinit var roleRepository: RoleRepository

    @GetMapping("")
    fun signUp(model: Model): String{
        val user = User(role = roleRepository.findByRole("User"))
        model.addAttribute("user", user)
        return "sign-up"
    }

    @PostMapping(value = ["/register"])
    fun register(@ModelAttribute user: User): String{
        println("User:")
        println(user.login)
        println(user.password)
        println(user.lastname)
        println(user.firstname)
        return "redirect:/"
    }
}
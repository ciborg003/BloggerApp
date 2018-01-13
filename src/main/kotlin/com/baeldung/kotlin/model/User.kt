package com.baeldung.kotlin.model

import java.util.*
import javax.persistence.*

//@Entity
//@Table
data class User(
//class User(
//        @Id
//        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = -1,
        var login: String = "",
        var password: String = "",
        var firstName: String = "",
        var lastName: String = "",
        var email: String = "",
        val dob: Date = Date(System.currentTimeMillis())) {

}
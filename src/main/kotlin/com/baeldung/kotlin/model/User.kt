package com.baeldung.kotlin.model

import java.util.*
import javax.persistence.*

@Entity
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = -1,
        var login: String = "",
        var password: String = "",
        var firstname: String = "",
        var lastname: String = "",
        var email: String = "",
        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "id")
        var role: Role){}
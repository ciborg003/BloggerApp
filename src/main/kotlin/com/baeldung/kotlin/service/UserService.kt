package com.baeldung.kotlin.service

import com.baeldung.kotlin.model.User

interface UserService{
    fun signUp(user: User);
}
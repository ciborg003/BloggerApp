package com.baeldung.kotlin.dao

import com.baeldung.kotlin.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: CrudRepository<User, Long> {
    fun findByEmail(email: String): User;
    fun findById(id: Long): User;
    fun findByLogin(login: String): User;
}
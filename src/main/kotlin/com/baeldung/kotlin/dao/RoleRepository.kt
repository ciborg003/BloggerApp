package com.baeldung.kotlin.dao

import com.baeldung.kotlin.model.Role
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository: CrudRepository<Role, Long>{
    fun findByRole(role: String): Role
}
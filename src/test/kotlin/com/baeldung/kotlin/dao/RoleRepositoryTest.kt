package com.baeldung.kotlin.dao

import com.baeldung.kotlin.model.Role
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class RoleRepositoryTest(){

    @Autowired
    lateinit var roleRepository: RoleRepository

    @Test
    fun testFindByRole(){
        var role = roleRepository.findByRole("User");
        print("------------------------------")
        print(role)
        print(role)
        print(role)
        print(role)
        print(role)
        print(role)
        print("------------------------------")
        Assert.assertEquals(1, role.id)
    }
}
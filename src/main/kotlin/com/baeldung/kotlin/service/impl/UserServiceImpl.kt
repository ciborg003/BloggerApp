package com.baeldung.kotlin.service.impl

//import com.baeldung.kotlin.dao.UserRepository
import com.baeldung.kotlin.model.User
import com.baeldung.kotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl: UserService {

//    @Autowired
//    lateinit var userRepository: UserRepository
//
    override fun signUp(user: User) {
//        userRepository.save(user)
    }
}
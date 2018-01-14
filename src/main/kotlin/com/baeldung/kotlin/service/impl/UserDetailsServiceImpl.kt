package com.baeldung.kotlin.service.impl

import com.baeldung.kotlin.dao.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
open class UserDetailsServiceImpl(): UserDetailsService {

    @Autowired
    lateinit var userRepositiry: UserRepository;

    @Transactional(readOnly = true)
    override fun loadUserByUsername(login: String?): UserDetails {
        var user = userRepositiry.findByLogin(login!!)

        var grantedAuthority = HashSet<GrantedAuthority>();
        grantedAuthority.add(SimpleGrantedAuthority(user.role.role))

        return org.springframework.security.core.userdetails.User(user.login, user.password, grantedAuthority)
    }

}
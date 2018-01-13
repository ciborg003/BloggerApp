//package com.baeldung.kotlin.validation
//
////import com.baeldung.kotlin.dao.UserRepository
//import com.baeldung.kotlin.model.User
//import org.apache.commons.validator.EmailValidator
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.stereotype.Component
//import org.springframework.validation.Errors
//import org.springframework.validation.ValidationUtils
//import org.springframework.validation.Validator
//
//@Component
//class UserValidator: Validator {
//
////    @Autowired
////    lateinit var userRepository: UserRepository
//
//    val emailValidator: EmailValidator = EmailValidator.getInstance()
//
//    override fun validate(p0: Any?, p1: Errors?) {
//        val user = p0 as User
//
//        ValidationUtils.rejectIfEmptyOrWhitespace(p1, "login", "NotEmpty.user.userName")
//        ValidationUtils.rejectIfEmptyOrWhitespace(p1, "password", "NotEmpty.user.password")
//        ValidationUtils.rejectIfEmptyOrWhitespace(p1, "firstName", "NotEmpty.user.firstName")
//        ValidationUtils.rejectIfEmptyOrWhitespace(p1, "lastName", "NotEmpty.user.lastName")
//
//        if (this.emailValidator.isValid(user.email)){
//            if (p1 != null) {
//                p1.rejectValue("email", "Pattern.user.email")
//            }
//        } else if (user.id == -1L) {
////            val dbUser = userRepository.findOne(user.id)
//            if (user != null){
//                if (p1 != null) {
//                    p1.rejectValue("email", "Duplicate.user.email")
//                }
//            }
//        }
//
//        if (p1 != null) {
//            if (!p1.hasFieldErrors("userName")) {
////                val dbUser = userRepository.findOne(1L)
////                if (dbUser != null) {
//                    // Username is not available.
////                    p1.rejectValue("userName", "Duplicate.appUserForm.userName")
////                }
//            }
//        }
//    }
//
//    override fun supports(p0: Class<*>?): Boolean {
//        return p0 == User::class
//    }
//}
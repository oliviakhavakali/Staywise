package com.olivia.staywise.repository

import com.olivia.staywise.data.UserDao2
import com.olivia.staywise.model.User


class UserRepository(private  val userDao: UserDao2) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}
package com.olivia.staywise.repository

import com.olivia.staywise.data.UserDao2
import com.olivia.staywise.model.Users


class UserRepository(private  val userDao: UserDao2) {
    suspend fun registerUser(user: Users) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): Users? {
        return userDao.loginUser(email, password)
    }
}
package com.olivia.guardmart.repository

import com.olivia.guardmart.data.UserDao
import com.olivia.guardmart.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}
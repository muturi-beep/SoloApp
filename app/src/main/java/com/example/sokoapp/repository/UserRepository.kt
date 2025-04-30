package com.example.sokoapp.repository


import com.example.sokoapp.data.UserDao
import com.example.sokoapp.model.User



//communicates directly with D/B with help of DAO(frontend) with help AuthViewModel
class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}
package com.learn.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learn.di.UserRegistrationComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val userRepository = UserRepository()
//        val emailService = EmailService()
//
//        val userRegistrationService = UserRegistrationService(userRepository, emailService)

        val userRegistrationService = DaggerUserRegistrationComponent.builder().build().getUserRegistrationService()
        userRegistrationService.registerUser("jaia@gmail.com","JAHJDJKD")
    }
}
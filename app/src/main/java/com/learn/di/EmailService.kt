package com.learn.di

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {

    val msg:String = "TAG"
    fun emailUser(email:String,password:String){
        Log.d(msg,"User Emailed")
    }

}
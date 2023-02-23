package com.learn.di

import android.nfc.Tag
import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {

    val msg:String = "TAG :"
    fun saveUser(email:String,password:String){
        Log.d(msg,"User Saved")
    }

}
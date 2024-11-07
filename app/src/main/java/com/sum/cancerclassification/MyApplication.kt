package com.sum.cancerclassification

import android.app.Application
import android.util.Log
import com.google.firebase.FirebaseApp

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
        Log.d("MyApplication", "Firebase initialized: ${FirebaseApp.getInstance() != null}")
    }
}
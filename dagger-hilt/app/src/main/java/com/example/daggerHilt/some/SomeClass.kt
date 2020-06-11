package com.example.daggerHilt.some

import android.util.Log
import javax.inject.Inject

class SomeClass @Inject constructor() {
    fun doSomething() {
        Log.i("[BK]", "Do something")
    }
}
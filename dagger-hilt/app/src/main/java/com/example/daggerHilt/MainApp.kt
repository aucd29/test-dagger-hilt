package com.example.daggerHilt

import android.app.Application
import android.util.Log
import com.example.daggerHilt.some.SomeClass
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MainApp : Application() {
    @Inject
    lateinit var someClass: SomeClass

    override fun onCreate() {
        super.onCreate()

        Log.w("[BK]", "======= HILT TEST APP ======")
        someClass.doSomething()
    }
}
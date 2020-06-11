package com.example.di.moduel

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
object FooModule {
    @Provides
    fun providerFoo() =
        Foo()
}

class Foo {
    fun helloFoo() {
        Log.w("[BK]", "hello foo")
    }
}
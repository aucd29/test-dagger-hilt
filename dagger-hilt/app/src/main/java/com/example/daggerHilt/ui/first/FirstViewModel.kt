package com.example.daggerHilt.ui.first

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.daggerHilt.some.Event
import com.example.daggerHilt.some.SomeClass
import com.example.di.moduel.Foo
import javax.inject.Inject

class FirstViewModel @ViewModelInject constructor(
    private val foo: Foo,
    private val some: SomeClass,
    var eventComposition: Event
) : ViewModel() {
    fun hello() {
        Log.w("[BK]", "vm hello")
        foo.helloFoo()
        some.doSomething()

        eventComposition.send(1)

        Log.w("[BK]", "====")
    }
}
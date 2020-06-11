package com.example.daggerHilt.ui.second

import android.util.Log
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.daggerHilt.some.Event
import com.example.daggerHilt.some.SomeClass
import javax.inject.Inject

class SecondViewModel @ViewModelInject constructor(
    @Assisted val savedStateHandle: SavedStateHandle,
    private val some: SomeClass,
    var eventComposition: Event
) : ViewModel() {
    val stateData: LiveData<String> =
        savedStateHandle.getLiveData("key")

    fun second() {
        some.doSomething()

        eventComposition.send(2)
        savedStateHandle.set("key", "value")

        Log.w("[BK]", "====")
    }
}
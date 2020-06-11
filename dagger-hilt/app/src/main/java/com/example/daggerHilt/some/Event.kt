package com.example.daggerHilt.some

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class Event @Inject constructor() {
    private val _event = MutableLiveData<Int>()

    val event: LiveData<Int> = _event

    fun send(event: Int) {
        _event.value = event
    }
}

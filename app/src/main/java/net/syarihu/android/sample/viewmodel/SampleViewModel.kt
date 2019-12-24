package net.syarihu.android.sample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SampleViewModel : ViewModel() {
    val hello: LiveData<String> = MutableLiveData<String>().apply {
        value = "Hello"
    }

    fun clear() {
    }
}
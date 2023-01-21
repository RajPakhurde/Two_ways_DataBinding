package com.example.twoway_databinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    val name =  MutableLiveData<String>()

    init {
         name.value = "Frank"
    }

}
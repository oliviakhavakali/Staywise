package com.olivia.staywise.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.olivia.staywise.model.Booked
import com.olivia.staywise.repository.BookedRepository
import kotlinx.coroutines.launch


class BookedViewModel(private val repository: BookedRepository) : ViewModel(){
    fun enterBookings(booked: Booked){
        viewModelScope.launch {
            repository.enterbookings(booked)
        }
    }
}


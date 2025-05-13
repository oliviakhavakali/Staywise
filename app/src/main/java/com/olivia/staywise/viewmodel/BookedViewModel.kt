package com.olivia.staywise.viewmodel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.olivia.staywise.model.Booked
import com.olivia.staywise.model.User
import com.olivia.staywise.repository.BookedRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

import kotlinx.coroutines.launch

class BookedViewModel(private val repository: BookedRepository) : ViewModel() {
    private val _selectedbooked = MutableStateFlow<Booked?>(null)
    val selectedContent: StateFlow<Booked?> = _selectedbooked.asStateFlow()

    fun insert(booked: Booked) = viewModelScope.launch {
        repository.insert(booked)
    }
}
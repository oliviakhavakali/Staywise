package com.olivia.staywise.repository

import com.olivia.staywise.data.BookedDao
import com.olivia.staywise.model.Booked


class BookedRepository(private val bookedDao: BookedDao){
    suspend fun enterbookings(booked: Booked){
        bookedDao.enterbooking(booked)
    }
}
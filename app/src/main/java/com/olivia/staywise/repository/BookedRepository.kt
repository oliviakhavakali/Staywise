package com.olivia.staywise.repository

import android.content.Context
import com.olivia.staywise.data.BookedDatabase
import com.olivia.staywise.model.Booked

class BookedRepository(context: Context) {
    private val bookedDao = BookedDatabase.getDatabase(context).bookedDao()

    suspend fun insert(booked: Booked) {
        bookedDao.insertBooked(booked)
    }
}
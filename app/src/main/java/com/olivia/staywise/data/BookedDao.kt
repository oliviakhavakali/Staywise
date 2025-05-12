package com.olivia.staywise.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.olivia.staywise.model.Booked

@Dao
interface BookedDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBooked(booked: Booked)

    @Query("SELECT * FROM Booking")
    fun getAllBooked(): LiveData<List<Booked>>
}
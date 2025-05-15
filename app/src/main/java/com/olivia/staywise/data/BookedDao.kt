package com.olivia.staywise.data



import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.olivia.staywise.model.Booked

@Dao
interface BookedDao {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun enterbooking(booked: Booked)

    @Query("SELECT * FROM booking")
    suspend fun getAllRequest(): List<Booked>
}
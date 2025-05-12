package com.olivia.staywise.model



import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Booking")
data class Booked(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val Guestname: String,
    val numberofguest: Double,
    val HotelName: String,
    val checkindate : Double,
    val checkoutdate : Double,

)
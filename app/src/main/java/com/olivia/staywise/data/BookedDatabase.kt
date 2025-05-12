package com.olivia.staywise.data


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.olivia.staywise.model.Booked
import com.olivia.staywise.model.User

@Database(entities = [Booked::class, User::class], version = 3, exportSchema = false)
abstract class BookedDatabase : RoomDatabase() {

    abstract fun bookedDao(): BookedDao

    companion object {
        @Volatile
        private var INSTANCE: BookedDatabase? = null

        fun getDatabase(context: Context): BookedDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BookedDatabase::class.java,
                    "booked_database"
                )
                    .fallbackToDestructiveMigration() // Optional: helpful during development
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
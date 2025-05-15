package com.olivia.staywise.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.olivia.staywise.model.Booked


@Database(entities = [Booked::class], version = 2, exportSchema = false)
abstract class BookedDatabase: RoomDatabase() {
    abstract fun BookedDao(): BookedDao

    companion object {
        @Volatile
        private var INSTANCE: com.olivia.staywise.data.BookedDatabase? = null

        fun getDatabase(context: Context): com.olivia.staywise.data.BookedDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    com.olivia.staywise.data.BookedDatabase::class.java,
                    "booked_database"
                )
                    .fallbackToDestructiveMigration() // DANGEROUS IN PRODUCTION, OK FOR NOW
                    .build()
                INSTANCE = instance
                instance

            }
        }
    }

}
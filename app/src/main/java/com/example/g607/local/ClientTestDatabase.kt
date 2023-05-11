package com.example.g607.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ClientTest::class], version = 1)
abstract class ClientTestDatabase : RoomDatabase() {
    abstract fun clientTestDao(): ClientTestDao

    companion object{

        @Volatile
        private var INSTANCE : ClientTestDatabase? = null
        fun getDataBase(context: Context): ClientTestDatabase {
            if(INSTANCE == null)
            {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        ClientTestDatabase::class.java, "ClientTest")
                        .build()
                }
            }
            return INSTANCE!!
        }

    }
}
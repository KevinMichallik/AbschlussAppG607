package com.example.g607.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface ClientTestDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertClientTest(clientTest: ClientTest)

}
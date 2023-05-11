package com.example.g607.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "client_test_table")
data class ClientTest(
    @PrimaryKey(autoGenerate = true) val clientTestId: Int,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "kennzeichen") val kennzeichen: String?,
    @ColumnInfo(name = "vin") val vin: String?,
    @ColumnInfo(name = "fahrzeugart") val fahrzeugart: String?,
    @ColumnInfo(name = "test_a") val testA: Boolean?,
    @ColumnInfo(name = "test_b") val testB: Boolean?,
    @ColumnInfo(name = "test_c") val testC: Boolean?,
    @ColumnInfo(name = "test_d") val testD: Boolean?,
    @ColumnInfo(name = "test_e") val testE: Boolean?,
    @ColumnInfo(name = "test_f") val testF: Boolean?,
    @ColumnInfo(name = "bemerkungen") val bemerkungen: String?,
)
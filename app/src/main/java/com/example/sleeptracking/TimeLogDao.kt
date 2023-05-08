package com.example.sleeptracking

/**
 * @author CaptShiva007
 *
 *@author Admin
 */
import androidx.room.Dao
import androidx.room.Insert

@Dao
interface TimeLogDao {
    @Insert
    suspend fun insert(timeLog: TimeLog)

}
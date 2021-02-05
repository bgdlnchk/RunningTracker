package com.androiddevs.runningappyt.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * from running_table ORDER by timestamp DESC")
    fun getAllRunsSortedByDay(): LiveData<List<Run>>

    @Query("SELECT * from running_table ORDER by timeInMillis DESC")
    fun getAllRunsSortedByTimeInMillis(): LiveData<List<Run>>

    @Query("SELECT * from running_table ORDER by caloriesBurned DESC")
    fun getAllRunsSortedByCaloriesBurned(): LiveData<List<Run>>

    @Query("SELECT * from running_table ORDER by averageSpeed DESC")
    fun getAllRunsSortedByAvgSpeed(): LiveData<List<Run>>

    @Query("SELECT * from running_table ORDER by distanceInMeters DESC")
    fun getAllRunsSortedByDistance(): LiveData<List<Run>>

    @Query("Select SUM(timeInMillis) from running_table")
    fun getTotalTimeInMillis(): LiveData<Long>

    @Query("Select SUM(caloriesBurned) from running_table")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("Select SUM(distanceInMeters) from running_table")
    fun getTotalDistanceInMeters(): LiveData<Int>

    @Query("Select SUM(averageSpeed) from running_table")
    fun getTotalAverageSpeed(): LiveData<Float>
}










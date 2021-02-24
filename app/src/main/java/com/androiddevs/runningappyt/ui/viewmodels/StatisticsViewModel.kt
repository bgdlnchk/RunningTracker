package com.androiddevs.runningappyt.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.androiddevs.runningappyt.repositories.MainRepository

class StatisticsViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel() {

    val totalTimeRun = mainRepository.getTotalTimeInMillis()
    val totalDistance = mainRepository.getTotalDistance()
    val totalCaloriesBurned = mainRepository.getAllRunsSortedByCaloriesBurned()
    val totalAvgSpeed = mainRepository.getAverageSpeed()

    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()
}
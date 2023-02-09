package com.example.android.myapplication.beestatistics

import androidx.lifecycle.ViewModel
import com.example.android.myapplication.database.BeeDatabaseDao

class BeeStatisticsViewModel(
    private val groupKey: Long,
    dataSource: BeeDatabaseDao): ViewModel() {


    val database = dataSource

    fun getCountBadPop(index: Int): Int{
        val count: Int? = database.getAllBadPopulationBee(groupKey, index)
        return if(count==null){
            0
        } else{
            count
        }
    }
}
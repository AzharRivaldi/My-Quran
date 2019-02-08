package com.azhar.myquran.Modules.Database

import com.azhar.myquran.Entities.Models.Quran

interface DatabaseInput{
    fun getAllData()
    fun updateData(data: Quran)
    fun getDataById(id: Int)
    fun getDataBySurahId(id: Int)
}

interface DatabaseOutput{
    fun successGetAllData(list: List<Quran>)
    fun successUpdateData()
    fun successGetDataById(data: Quran)
    fun successGetDataBySurahId(list: List<Quran>)
}

interface DatabaseInterface{
    fun getAllData()
    fun updateData(data: Quran)
    fun getDataById(id: Int)
    fun getDataBySurahId(id: Int)
}

interface DatabaseView{
    fun successGetDataBySurahId(list: List<Quran>)

}

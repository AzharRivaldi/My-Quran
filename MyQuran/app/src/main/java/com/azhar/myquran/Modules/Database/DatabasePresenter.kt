package com.azhar.myquran.Modules.Database

import com.azhar.myquran.Entities.Models.Quran

class DatabasePresenter (var interactor: DatabaseHelper,
                         var view: DatabaseView): DatabaseInterface, DatabaseOutput {

    init {
        interactor.output = this
    }

    override fun successGetAllData(list: List<Quran>) {
    }

    override fun successUpdateData() {
    }

    override fun successGetDataById(data: Quran) {
    }

    override fun successGetDataBySurahId(list: List<Quran>) {
        view.successGetDataBySurahId(list)
    }

    override fun getAllData() {
    }

    override fun updateData(data: Quran) {
//        interactor.updateData(data)
    }

    override fun getDataById(id: Int) {
    }

    override fun getDataBySurahId(id: Int) {
        interactor.getDataBySurahId(id)
    }
}
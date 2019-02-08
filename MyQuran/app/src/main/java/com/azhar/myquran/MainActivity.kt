package com.azhar.myquran

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.azhar.myquran.Modules.Database.DatabaseHelper
import com.azhar.myquran.Modules.ImportFromFile.Literation
import com.azhar.myquran.Modules.ImportFromFile.LiterationInteractor

class MainActivity : AppCompatActivity(), Literation {

    val interactor = LiterationInteractor(this, this)
    val databaseHelper = DatabaseHelper(this)

    override fun successInputDatabase() {
        openNextActivity()
    }

    override fun failedInputDatabase() {
        databaseHelper.clearTable()
        interactor.setData()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (databaseHelper.isDataAvailable()){
            openNextActivity()
        }else{
            databaseHelper.clearTable()
            interactor.setData()
        }
    }

    fun openNextActivity(){
        val intent = Intent(this, ListSurahActivity::class.java)
        startActivity(intent)
        finish()
    }
}

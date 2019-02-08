package com.azhar.myquran.ViewHolders

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.View
import com.azhar.myquran.Entities.Models.SurahModel
import com.azhar.myquran.ListVerseActivity
import kotlinx.android.synthetic.main.list_surah.view.*

class SurahViewHolder (itemView: View): RecyclerView.ViewHolder(itemView)  {

    fun onBind(context: Context, model: SurahModel) = with(itemView){

        text_title_surah.text = "${model.idSurah}. " + model.nameSurah.substringBefore("(")
        text_translate.text = "(" + model.nameSurah.substringAfterLast("(")

        rootView.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, ListVerseActivity::class.java)
            intent.putExtra("surahTitle", model.nameSurah)
            intent.putExtra("surahId", model.idSurah)
            intent.putExtra("verseId", 1)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        })

    }
}
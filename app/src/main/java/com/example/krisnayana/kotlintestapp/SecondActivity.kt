package com.example.krisnayana.kotlintestapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {


    private lateinit var tvName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //nameTextView.text = name
       val detail = intent.getStringExtra("description")
        // detailTextView.text = detail



            verticalLayout {
                padding = dip(16)
                tvName = textView {}.lparams(matchParent, wrapContent)


            }


        val name = getIntent().getStringExtra("nama")
        tvName?.text = name

    }
}

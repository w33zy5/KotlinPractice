package com.example.krisnayana.kotlintestapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity()  {
    private var name: String? = ""
    private var detail: String? = ""
    lateinit var nameTextView: TextView
    lateinit var detailTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        name = intent.getStringExtra("name")
        //nameTextView.text = name
        detail = intent.getStringExtra("description")
       // detailTextView.text = detail

        UI {
            verticalLayout {
                padding = dip(16)
                nameTextView = textView()

                padding = dip(16)
                detailTextView = textView()
            }.view()
    }
}}
package com.example.krisnayana.kotlintestapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list.*
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {
    private lateinit var tvName: TextView
    private lateinit var tvImage: ImageView
    private lateinit var tvDetail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val deskripsi = getIntent().getStringExtra("detail")
        val gambar = getIntent().getIntExtra("gambar",0)
        val name = getIntent().getStringExtra("nama")

        verticalLayout {
            padding = dip(16)
            tvName = textView {}.lparams(matchParent, wrapContent)

            padding = dip(16)
            tvImage = imageView{}.lparams(400, 400)

            padding = dip(16)
            tvDetail = textView {}.lparams(matchParent, wrapContent)
        }

        Log.e("Test Name : ", name)
        Log.e("Test Deskripsi : ", deskripsi)
        tvDetail?.text = deskripsi
        tvImage?.setImageResource(gambar)
        tvName?.text = name
    }
}

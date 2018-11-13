package com.example.krisnayana.kotlintestapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
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
            padding = dip(20)
            tvImage = imageView{}.lparams(200, 200){gravity = Gravity.CENTER}

            tvName = textView {
                textSize = 18f
            }.lparams(wrapContent, wrapContent){gravity = Gravity.CENTER; bottomMargin = 25}

            tvDetail = textView {}.lparams(matchParent, wrapContent)
        }

        /*Log.e("Test Name : ", name)
        Log.e("Test Deskripsi : ", deskripsi)*/
        tvDetail?.text = deskripsi
        tvImage?.setImageResource(gambar)
        tvName?.text = name
    }
}

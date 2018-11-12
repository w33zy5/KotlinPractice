package com.example.krisnayana.kotlintestapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
/*import android.support.v7.widget.LinearLayoutManager*/
import android.support.v7.widget.RecyclerView
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.ctx
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    private var items: MutableList<Item> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        val list = findViewById<RecyclerView>(R.id.club_list)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = RecyclerViewAdapter(this, items){
            Log.e("error", it.name)

            val gambar = it.image
            val nama = it.name
            val deskripsi = it.description
            startActivity<SecondActivity>(
                    "nama" to nama,
                    "detail" to deskripsi,
                    "gambar" to gambar
            )

            val intent = Intent(ctx, SecondActivity::class.java)
            //intent.putExtra("nam")
        }
    }

    private  fun initData(){
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_image)
        val description = resources.getStringArray(R.array.club_desc)
        items.clear()
        for(i in name.indices){
            items.add(Item(
                    name=name[i],
                    image=image.getResourceId(i, 0),
                    description = description[i]))
        }

        image.recycle()
    }
}
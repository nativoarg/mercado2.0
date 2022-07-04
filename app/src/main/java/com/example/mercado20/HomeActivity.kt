package com.example.mercado20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    lateinit var buttonList: Button
    lateinit var buttonAdd: Button
    lateinit var buttonRemove: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        buttonList.setOnClickListener {
            startActivity(Intent(this, AllProductActivity::class.java))
        }
        buttonRemove.setOnClickListener {
            startActivity(Intent(this, RemoveProductActivity::class.java))
        }
        buttonAdd.setOnClickListener {
            startActivity(Intent(this, AddProductActivity::class.java))
        }
    }

    fun init() {
        buttonAdd = findViewById(R.id.bt_add)
        buttonList = findViewById(R.id.bt_entry)
        buttonRemove = findViewById(R.id.bt_remove)
    }
}
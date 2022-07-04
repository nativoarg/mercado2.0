package com.example.mercado20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RemoveProductActivity : AppCompatActivity() {

    lateinit var buttonRemoveitem: Button
    lateinit var buttonBackToMain: Button
    lateinit var editTextRemoveItem: EditText
    val employee = Employee()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remove_product)

        init()

        buttonBackToMain.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        buttonRemoveitem.setOnClickListener {
            employee.delProduct(editTextRemoveItem.text.toString())
        }
    }

    fun init() {
        buttonBackToMain = findViewById(R.id.bt_back_to_main_from_remove)
        buttonRemoveitem = findViewById(R.id.bt_item_remove)
        editTextRemoveItem = findViewById(R.id.et_item_remove)
    }
}
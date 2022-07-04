package com.example.mercado20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AddProductActivity : AppCompatActivity() {

    lateinit var enterItemNameText: EditText
    lateinit var enterExpDateText: EditText
    lateinit var enterPriceText: EditText
    lateinit var enterDiscountText: EditText
    lateinit var enterWeightText: EditText
    lateinit var buttonAddItem: Button
    lateinit var buttonBackToMain: Button
    var employee = Employee()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)

        init()

        buttonBackToMain.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        buttonAddItem.setOnClickListener {
            employee.addProduct(
                enterItemNameText.text.toString(),
                enterExpDateText.text.toString(),
                enterPriceText.text.toString().toDouble(),
                enterDiscountText.text.toString().toDouble(),
                false, //A resolver//
                enterWeightText.text.toString(),
                "NOPE" //A resolver//
            )
        }
    }

    fun init() {
        buttonBackToMain = findViewById(R.id.bt_back_to_main_from_add)
        buttonAddItem = findViewById(R.id.bt_item_add)
        enterItemNameText = findViewById(R.id.et_enter_item_name)
        enterExpDateText = findViewById(R.id.et_enter_exp_date)
        enterPriceText = findViewById(R.id.et_enter_price)
        enterDiscountText = findViewById(R.id.et_enter_discount)
        enterWeightText = findViewById(R.id.et_enter_weight)
    }
}
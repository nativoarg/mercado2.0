package com.example.mercado20

data class ModelProduct(

    val name: String,
    val expDate: String,
    val price: Double,
    val priceDiscount: Double,
    val discountStatus: Boolean,
    val weight: String,
    val image: String
)

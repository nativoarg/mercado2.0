package com.example.mercado20

class Employee() {

    fun delProduct(name: String) {
        Storage.delProduct(name)
    }

    fun addProduct(
        name: String,
        expDate: String,
        price: Double,
        priceDiscount: Double,
        discountStatus: Boolean,
        weight: String,
        image: String
    ) {
        Storage.addProduct(name, expDate, price, priceDiscount, discountStatus, weight, image)
    }

    fun getAllStock(): MutableList<ModelProduct> {
        return Storage.getAllStock()
    }
}
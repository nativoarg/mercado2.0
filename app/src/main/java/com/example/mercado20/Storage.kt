package com.example.mercado20

object Storage {
    private val allStock = mutableListOf<ModelProduct>(
        ModelProduct("arroz", "05/23", 120.00, 0.0, false, "1kg","https://jumboargentina.vteximg.com.br/arquivos/ids/637989-1000-1000/Arroz-Dos-Hermanos-Pairboil-1-Kg-1-869767.jpg?v=637544430793970000"),
        ModelProduct("arroz", "05/23", 120.00, 0.0, false, "1kg","https://jumboargentina.vteximg.com.br/arquivos/ids/637989-1000-1000/Arroz-Dos-Hermanos-Pairboil-1-Kg-1-869767.jpg?v=637544430793970000"),
        ModelProduct("arroz", "05/23", 120.00, 0.0, false, "1kg","https://jumboargentina.vteximg.com.br/arquivos/ids/637989-1000-1000/Arroz-Dos-Hermanos-Pairboil-1-Kg-1-869767.jpg?v=637544430793970000"),
        ModelProduct("arroz", "06/23", 120.00, 0.0, false, "1kg","https://jumboargentina.vteximg.com.br/arquivos/ids/637989-1000-1000/Arroz-Dos-Hermanos-Pairboil-1-Kg-1-869767.jpg?v=637544430793970000"),
        ModelProduct("fideo", "06/23", 200.00, 0.0, false, "900gr","https://jumboargentina.vteximg.com.br/arquivos/ids/601818-1000-1000/Fideos-Spaghetti-Matarazzo-500-Gr-1-40854.jpg?v=637352619965770000"),
        ModelProduct("fideo", "06/23", 200.00, 0.0, false, "900gr","https://jumboargentina.vteximg.com.br/arquivos/ids/601818-1000-1000/Fideos-Spaghetti-Matarazzo-500-Gr-1-40854.jpg?v=637352619965770000"),
        ModelProduct("fideo", "06/23", 200.00, 0.0, false, "900gr","https://jumboargentina.vteximg.com.br/arquivos/ids/601818-1000-1000/Fideos-Spaghetti-Matarazzo-500-Gr-1-40854.jpg?v=637352619965770000"),
        ModelProduct("fideo", "09/23", 200.00, 0.0, false, "900gr","https://jumboargentina.vteximg.com.br/arquivos/ids/601818-1000-1000/Fideos-Spaghetti-Matarazzo-500-Gr-1-40854.jpg?v=637352619965770000"),
        ModelProduct("fideo", "05/23", 200.00, 0.0, false, "900gr","https://jumboargentina.vteximg.com.br/arquivos/ids/601818-1000-1000/Fideos-Spaghetti-Matarazzo-500-Gr-1-40854.jpg?v=637352619965770000"),
        ModelProduct("fideo", "05/23", 200.00, 0.0, false, "900gr","https://jumboargentina.vteximg.com.br/arquivos/ids/601818-1000-1000/Fideos-Spaghetti-Matarazzo-500-Gr-1-40854.jpg?v=637352619965770000"),
        ModelProduct("polenta", "09/23", 150.00, 0.0, false, "500gr","https://jumboargentina.vteximg.com.br/arquivos/ids/581390-1000-1000/Harina-De-Maiz-Presto-Pronta-500-Gr-1-41146.jpg?v=637226034481100000"),
        ModelProduct("polenta", "09/23", 150.00, 0.0, false, "500gr","https://jumboargentina.vteximg.com.br/arquivos/ids/581390-1000-1000/Harina-De-Maiz-Presto-Pronta-500-Gr-1-41146.jpg?v=637226034481100000"),
        ModelProduct("polenta", "05/23", 150.00, 0.0, false, "500gr","https://jumboargentina.vteximg.com.br/arquivos/ids/581390-1000-1000/Harina-De-Maiz-Presto-Pronta-500-Gr-1-41146.jpg?v=637226034481100000"),
        ModelProduct("polenta", "09/23", 150.00, 0.0, false, "500gr","https://jumboargentina.vteximg.com.br/arquivos/ids/581390-1000-1000/Harina-De-Maiz-Presto-Pronta-500-Gr-1-41146.jpg?v=637226034481100000"),
        ModelProduct("polenta", "05/23", 150.00, 0.0, false, "500gr","https://jumboargentina.vteximg.com.br/arquivos/ids/581390-1000-1000/Harina-De-Maiz-Presto-Pronta-500-Gr-1-41146.jpg?v=637226034481100000"),
        ModelProduct("polenta", "11/23", 150.00, 0.0, false, "500gr","https://jumboargentina.vteximg.com.br/arquivos/ids/581390-1000-1000/Harina-De-Maiz-Presto-Pronta-500-Gr-1-41146.jpg?v=637226034481100000"),
        ModelProduct("harina", "11/23", 90.00, 0.0, false, "1kg","https://jumboargentina.vteximg.com.br/arquivos/ids/601749-1000-1000/Harina-De-Trigo-Favorita-000-1-Kg-1-7126.jpg?v=637352619013570000"),
        ModelProduct("harina", "11/23", 90.00, 0.0, false, "1kg","https://jumboargentina.vteximg.com.br/arquivos/ids/601749-1000-1000/Harina-De-Trigo-Favorita-000-1-Kg-1-7126.jpg?v=637352619013570000")
    )

    fun delProduct(name: String) {
        var temp : ModelProduct? =null
        for (i in allStock){
            if (i.name == name){
                temp= i
            }
        }
        if (temp != null){
            allStock.remove(temp)
        }
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
        allStock.add(ModelProduct(name,expDate,price,priceDiscount,discountStatus,weight,image))
    }

    fun getAllStock(): MutableList<ModelProduct> {
        return allStock
    }
}

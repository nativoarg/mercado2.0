package com.example.mercado20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mercado20.databinding.ActivityAllProductBinding

class AllProductActivity : AppCompatActivity() {
    lateinit var binding: ActivityAllProductBinding
    val employee= Employee()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAllProductBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecycler(getList())


    }



    fun initRecycler(list: List<ModelProduct>){
        val adapter = ProductAdapter(list)
        binding.rvProduct.adapter= adapter
    }

    fun getList(): MutableList<ModelProduct> {
        return employee.getAllStock()
    }
}
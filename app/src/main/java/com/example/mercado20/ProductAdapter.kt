package com.example.mercado20

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mercado20.databinding.ItemProductBinding
import com.squareup.picasso.Picasso

class ProductAdapter(val list: List<ModelProduct>) : RecyclerView.Adapter<ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.render(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class ProductHolder(view: View) : RecyclerView.ViewHolder(view) {

    var binding = ItemProductBinding.bind(view)

    fun render(value: ModelProduct) {
        binding.price.text = value.price.toString()
        binding.title.text = value.name
        binding.weight.text = value.weight
        Picasso.get().load(value.image).into(binding.image)
    }
}
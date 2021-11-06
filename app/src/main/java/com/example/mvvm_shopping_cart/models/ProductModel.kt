package com.example.mvvm_shopping_cart.models

import androidx.recyclerview.widget.DiffUtil

class ProductModel(var id : Number,var  name : String,var  imageUrl : String, var price : Number, var isAvailable : Boolean) {
    override fun toString(): String {
        return super.toString()
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    class ShopItemCallBack : DiffUtil.ItemCallback<ProductModel>() {
        override fun areItemsTheSame(oldItem: ProductModel, newItem: ProductModel): Boolean {
            return newItem.id == oldItem.id;
        }

        override fun areContentsTheSame(oldItem: ProductModel, newItem: ProductModel): Boolean {
            return newItem == oldItem;
        }

    }

}
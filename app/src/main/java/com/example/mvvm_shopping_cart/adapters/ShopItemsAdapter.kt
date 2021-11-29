package com.example.mvvm_shopping_cart.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm_shopping_cart.databinding.ShopItemBinding
import com.example.mvvm_shopping_cart.models.ProductModel
import com.example.mvvm_shopping_cart.viewModels.ShopViewModel

class ShopItemsAdapter : ListAdapter<ProductModel , ShopItemsAdapter.ShopViewHolder>{
    var shopInterface: ShopInterface;
    constructor(  shopInterface: ShopInterface) : super(ProductModel.itemCallBack()) {
        this.shopInterface=shopInterface;


    }


    class ShopViewHolder(private val binding:  ShopItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(itemViewModel: ProductModel) {
            binding.productModel=itemViewModel
        }



    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {

       var layoutInflater= LayoutInflater.from(parent.context);
        var binding = ShopItemBinding.inflate(layoutInflater,parent ,false);
        binding.shopInterface=shopInterface
        return  ShopViewHolder(binding);
    }

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        var productModel=getItem(position);
        holder.bind(productModel)

    }

    public  interface  ShopInterface {
        fun addItem( productModel: ProductModel);
        fun onItemClick (productModel: ProductModel)

    }
}
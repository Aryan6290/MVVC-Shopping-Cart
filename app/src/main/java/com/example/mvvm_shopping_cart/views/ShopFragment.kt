package com.example.mvvm_shopping_cart.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvvm_shopping_cart.R
import com.example.mvvm_shopping_cart.adapters.ShopItemsAdapter
import com.example.mvvm_shopping_cart.databinding.FragmentShopBinding
import com.example.mvvm_shopping_cart.models.ProductModel


class ShopFragment : Fragment(),ShopItemsAdapter.ShopInterface {
  lateinit  var fragmentShopBinding: FragmentShopBinding;
    lateinit var shopItemsAdapter: ShopItemsAdapter ;
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        fragmentShopBinding= FragmentShopBinding.inflate(inflater,container,false)

        return  fragmentShopBinding.root;

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        shopItemsAdapter = ShopItemsAdapter();
        fragmentShopBinding.shopRV.adapter=shopItemsAdapter;
        super.onViewCreated(view, savedInstanceState)
    }

    override fun addItem(productModel: ProductModel) {
        TODO("Not yet implemented")
    }

    override fun onItemClick(productModel: ProductModel) {
        TODO("Not yet implemented")
    }
}
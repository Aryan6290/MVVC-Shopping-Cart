package com.example.mvvm_shopping_cart.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_shopping_cart.R
import com.example.mvvm_shopping_cart.databinding.FragmentProductDetailsBinding
import com.example.mvvm_shopping_cart.viewModels.ShopViewModel

class ProductDetailsFragment : Fragment() {
lateinit var productDetailsBinding: FragmentProductDetailsBinding
lateinit var shopViewModel: ShopViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        productDetailsBinding= FragmentProductDetailsBinding.inflate(inflater,container,false);
        return  productDetailsBinding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        shopViewModel= ViewModelProvider(requireActivity())[ShopViewModel::class.java];
        productDetailsBinding.shopViewModel=shopViewModel
    }
}
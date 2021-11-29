package com.example.mvvm_shopping_cart.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_shopping_cart.models.ProductModel
import com.example.mvvm_shopping_cart.repositories.ShopRepo
import java.util.*

class ShopViewModel : ViewModel() {
        var shopRepo : ShopRepo = ShopRepo();
        private var mutableProduct : MutableLiveData<ProductModel>?= MutableLiveData()
        fun getProducts(): LiveData<List<ProductModel>> {
            return shopRepo.getProducts();
            }
        fun  setProduct(product : ProductModel){
        mutableProduct?.value=product;
        }
    fun getProduct() : MutableLiveData<ProductModel>? {
        return  mutableProduct
    }

    }
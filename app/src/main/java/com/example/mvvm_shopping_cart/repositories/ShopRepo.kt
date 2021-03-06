package com.example.mvvm_shopping_cart.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvm_shopping_cart.models.ProductModel
import java.util.*

class ShopRepo {
    private var mutableProductList: MutableLiveData<List<ProductModel>>? = null


    fun getProducts() : LiveData<List<ProductModel>>{
        if(mutableProductList==null){
            mutableProductList= MutableLiveData(mutableListOf());
            loadProducts();
        }
        return mutableProductList!!;
    }

    private fun loadProducts() {
        var products :MutableList<ProductModel> = arrayListOf();
        products.add(
            ProductModel(
                UUID.randomUUID().toString(),
                "iMac 21",
                1299,
                true,
                "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fimac21.jpeg?alt=media&token=e1cf1537-ab30-44a3-91f1-4d6284e79540"
            )
        )
        products.add(
            ProductModel(
                UUID.randomUUID().toString(),
                "iPad Air",
                799,
                true,
                "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fipadair.jpeg?alt=media&token=da387155-bd8f-4343-954b-e46da7d252ae"
            )
        )
        products.add(
            ProductModel(
                UUID.randomUUID().toString(),
                "iPad Pro",
                999,
                true,
                "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fipadpro.jpeg?alt=media&token=5d433343-f3b3-43eb-8bf2-5298eb5bf11c"
            )
        )
        products.add(
            ProductModel(
                UUID.randomUUID().toString(),
                "iPhone 11",
                699,
                false,
                "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fiphone11.jpeg?alt=media&token=c6874af2-c81e-48eb-96e9-2f1f3fad617f"
            )
        )
        products.add(
            ProductModel(
                UUID.randomUUID().toString(),
                "iPhone 11 Pro",
                999,
                true,
                "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fiphone11pro.jpg?alt=media&token=c4547c4f-7a46-483d-80e5-8f1a93d96a03"
            )
        )
        products.add(
            ProductModel(
                UUID.randomUUID().toString(),
                "iPhone 11 Pro Max",
                1099,
                true,
                "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fiphone11promax.png?alt=media&token=109a89bd-e52b-4b76-91d4-5175aa516a23"
            )
        )
        products.add(
            ProductModel(
                UUID.randomUUID().toString(),
                "iPhone SE",
                399,
                true,
                "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fiphonese.jpeg?alt=media&token=8a3a144d-0cd8-4f6d-94cb-0d81634ea5d0"
            )
        )
        products.add(
            ProductModel(
                UUID.randomUUID().toString(),
                "MacBook Air",
                999,
                true,
                "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fmacbookair.jpeg?alt=media&token=aae96a4a-e86a-4a15-825a-3da9851330c8"
            )
        )
        products.add(
            ProductModel(
                UUID.randomUUID().toString(),
                "MacBook Pro 13",
                1299,
                true,
                "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fmbp13touch.jpeg?alt=media&token=88c2bf8e-e72d-4243-a9ab-4cc32e3aff18"
            )
        )
        products.add(
            ProductModel(
                UUID.randomUUID().toString(),
                "MacBook Pro 16",
                2399,
                true,
                "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fmbp16touch.jpeg?alt=media&token=24498b7f-09b8-42ea-9edb-1bad649902d4"
            )
        )
        mutableProductList!!.value=products;

    }
}
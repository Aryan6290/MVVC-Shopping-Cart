package com.example.mvvm_shopping_cart.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mvvm_shopping_cart.R
import com.example.mvvm_shopping_cart.adapters.ShopItemsAdapter
import com.example.mvvm_shopping_cart.databinding.FragmentShopBinding
import com.example.mvvm_shopping_cart.models.ProductModel
import com.example.mvvm_shopping_cart.viewModels.ShopViewModel


class ShopFragment : Fragment(),ShopItemsAdapter.ShopInterface {
  lateinit  var fragmentShopBinding: FragmentShopBinding;
    lateinit var shopItemsAdapter: ShopItemsAdapter ;
    lateinit var shopViewModel : ShopViewModel
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
        fragmentShopBinding.shopRV.addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.HORIZONTAL));
        fragmentShopBinding.shopRV.addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL));
        shopViewModel= ViewModelProvider(requireActivity())[ShopViewModel::class.java];
        shopViewModel.getProducts().observe(viewLifecycleOwner,Observer{
            shopItemsAdapter.submitList(it);
        })
        super.onViewCreated(view, savedInstanceState)
    }

    override fun addItem(productModel: ProductModel) {

    }

    override fun onItemClick(productModel: ProductModel) {

    }


}
@BindingAdapter("android:productImage")
fun loadImage(imageView: ImageView,imageUrl : String?){
    Glide.with(imageView).load(imageUrl).fitCenter().apply(RequestOptions.errorOf(R.drawable.iphone)).into(imageView)

}
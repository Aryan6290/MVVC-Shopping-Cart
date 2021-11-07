package com.example.mvvm_shopping_cart.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.mvvm_shopping_cart.R
class MainActivity : AppCompatActivity() {
    lateinit var navController:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var navHostFragment=supportFragmentManager.findFragmentById(R.id.nav_host_fragment);
        // The screen name will be fragment label
        navController= navHostFragment!!.findNavController()
        NavigationUI.setupActionBarWithNavController(this,navController);
    }
}
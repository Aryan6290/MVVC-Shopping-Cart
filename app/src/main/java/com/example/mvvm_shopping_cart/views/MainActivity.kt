package com.example.mvvm_shopping_cart.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;

    }

    override fun onSupportNavigateUp(): Boolean {
        navController.navigateUp()
        return super.onSupportNavigateUp()
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return   NavigationUI.onNavDestinationSelected(item,navController) ||
        super.onOptionsItemSelected(item)
    }
}
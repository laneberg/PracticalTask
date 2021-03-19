package com.example.practicaltaskapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.practicaltaskapp.R
import com.example.practicaltaskapp.databinding.ActivityMainBinding
import com.example.practicaltaskapp.presenter.AppDrawer
import com.example.practicaltaskapp.ui.fragments.ChatsFragment


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var toolbar: Toolbar
    private lateinit var drawer: AppDrawer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFun()

    }

    private fun initFields() {
        toolbar = binding.toolbarMain
        drawer = AppDrawer(this,toolbar)
    }

    private fun initFun() {
        setSupportActionBar(toolbar)
        drawer.create()
        supportFragmentManager.beginTransaction()
            .replace(R.id.dataContainer, ChatsFragment()).commit()
    }


}

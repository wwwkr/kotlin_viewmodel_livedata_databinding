package com.example.kotlin_viewmodel_livedata_databinding.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.kotlin_viewmodel_livedata_databinding.R
import com.example.kotlin_viewmodel_livedata_databinding.databinding.ActivityMainBinding
import com.example.kotlin_viewmodel_livedata_databinding.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private val model: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mBinding.viewModel = model
        mBinding.lifecycleOwner = this

    }
}
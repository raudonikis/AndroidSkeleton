package com.raudonikis.androidskeleton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raudonikis.network.ExampleApi
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var api: ExampleApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
package com.raudonikis.androidskeleton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raudonikis.data.daos.ExampleDao
import com.raudonikis.network.ExampleApi
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var api: ExampleApi

    @Inject
    lateinit var exampleDao: ExampleDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
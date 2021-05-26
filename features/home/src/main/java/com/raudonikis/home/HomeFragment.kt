package com.raudonikis.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.raudonikis.home.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private var binding: FragmentHomeBinding? = null

    private val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        setUpListeners()
    }

    private fun setUpListeners() {
        binding?.apply {
            buttonToDashboard.setOnClickListener {
                viewModel.navigateToDashboard()
            }
            buttonToHomeNext.setOnClickListener {
                viewModel.navigateToHomeNext()
            }
        }
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}
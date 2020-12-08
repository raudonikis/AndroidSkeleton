package com.raudonikis.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.raudonikis.home.databinding.FragmentHomeBinding
import com.raudonikis.navigation.NavigationGraph
import com.raudonikis.navigation.NavigationDispatcher
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    @Inject
    lateinit var navigationDispatcher: NavigationDispatcher

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        setUpListeners()
    }

    private fun setUpListeners() {
        binding.buttonToDashboard.setOnClickListener {
            navigationDispatcher.navigate(NavigationGraph.Dashboard)
        }
        binding.buttonToHomeNext.setOnClickListener {
            navigationDispatcher.navigate(HomeRouter.homeToHomeNext())
        }
    }
}
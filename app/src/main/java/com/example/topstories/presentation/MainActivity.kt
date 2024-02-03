package com.example.topstories.presentation

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.topstories.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {


    private var _binding : ActivityMainBinding ? = null
    private val binding get() = _binding!!
    private val mainViewModel by viewModel<MainViewModel>()
    private lateinit var itemAdapter : Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        itemAdapter = Adapter()
        binding.recyclerView.adapter = itemAdapter


        mainViewModel.items.observe(this) { topStoriesResponse ->
            itemAdapter.setNews(topStoriesResponse.results)
            binding.progressBar.visibility = View.GONE
        }

    }


    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}
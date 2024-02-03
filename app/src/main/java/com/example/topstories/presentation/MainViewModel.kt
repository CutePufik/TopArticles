package com.example.topstories.presentation


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.topstories.domain.GetTopStoriesUseCase
import com.example.topstories.domain.models.TopStoriesResponse
import kotlinx.coroutines.launch

class MainViewModel(private val usercase : GetTopStoriesUseCase): ViewModel() {


    private val _items = MutableLiveData<TopStoriesResponse>()
    val items: LiveData<TopStoriesResponse> get() = _items

    init {

        viewModelScope.launch {
            val topStories = usercase.execute()
            _items.value = topStories
        }
    }




}
package com.example.topstories.data.repository


import com.example.topstories.data.api.ApiService
import com.example.topstories.domain.models.TopStoriesResponse
import com.example.topstories.domain.repository.NewsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RepositoryImpl(private val apiService: ApiService) : NewsRepository {
    override suspend fun getTopStories(): TopStoriesResponse {
        return withContext(Dispatchers.IO){
            apiService.getTopStories()
        }
    }

}
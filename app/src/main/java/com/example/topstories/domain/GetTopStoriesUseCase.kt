package com.example.topstories.domain


import com.example.topstories.domain.models.TopStoriesResponse
import com.example.topstories.domain.repository.NewsRepository

class GetTopStoriesUseCase(private val repository: NewsRepository) {

    suspend fun execute(): TopStoriesResponse {
        return repository.getTopStories()
    }
}

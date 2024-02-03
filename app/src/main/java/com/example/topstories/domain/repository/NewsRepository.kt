package com.example.topstories.domain.repository

import com.example.topstories.domain.models.TopStoriesResponse
import retrofit2.http.GET


interface NewsRepository {

    suspend fun getTopStories() : TopStoriesResponse
}


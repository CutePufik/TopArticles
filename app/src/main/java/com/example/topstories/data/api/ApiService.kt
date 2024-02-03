package com.example.topstories.data.api


import com.example.topstories.domain.models.TopStoriesResponse

import retrofit2.http.GET

interface ApiService {

    @GET("/svc/topstories/v2/world.json?api-key=SUP8jjfbbU4jr1UlFR6m45iiYkxdk1XX")
    suspend fun getTopStories() : TopStoriesResponse
}
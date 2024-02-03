package com.example.topstories.domain.models


data class TopStoriesResponse(
    val status: String,
    val copyright: String,
    val section: String,
    val lastUpdated: String,
    val numResults: Int,
    val results: List<Article>
)




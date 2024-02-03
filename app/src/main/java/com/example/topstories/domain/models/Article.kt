package com.example.topstories.domain.models



data class Article(
    val section: String,
    val subsection: String,
    val title: String,
    val abstract: String,
    val url: String,
    val uri: String,
    val byline: String,
    val itemType: String,
    val updatedDate: String,
    val createdDate: String,
    val publishedDate: String,
    val materialTypeFacet: String,
    val kicker: String,
    val desFacet: List<String>,
    val orgFacet: List<String>,
    val perFacet: List<String>,
    val geoFacet: List<String>,
    val multimedia: List<Multimedia>,
    val shortUrl: String
)
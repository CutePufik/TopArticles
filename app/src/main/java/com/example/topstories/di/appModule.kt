package com.example.topstories.di


import com.example.topstories.data.api.ApiService
import com.example.topstories.data.repository.RepositoryImpl
import com.example.topstories.domain.GetTopStoriesUseCase
import com.example.topstories.domain.repository.NewsRepository
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val appModule = module {

    single<ApiService> {
        Retrofit.Builder()
            .baseUrl("https://api.nytimes.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    factory<GetTopStoriesUseCase> { GetTopStoriesUseCase(repository = get()) }


    single<NewsRepository> { RepositoryImpl(apiService = get()) }
}

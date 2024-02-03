package com.example.topstories.di

import com.example.topstories.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appDi = module {

    viewModel<MainViewModel>{
        MainViewModel(usercase = get())
    }

}


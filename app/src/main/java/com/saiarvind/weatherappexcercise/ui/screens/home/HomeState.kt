package com.saiarvind.weatherappexcercise.ui.screens.home

import com.saiarvind.weatherappexcercise.data.model.WeatherResponse

// class to handle state of api result
data class HomeState(
    val isLoading: Boolean = false,
    val data: WeatherResponse? = null,
    val error: String = ""

)

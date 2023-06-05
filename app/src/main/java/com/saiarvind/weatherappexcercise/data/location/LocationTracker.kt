package com.saiarvind.weatherappexcercise.data.location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}
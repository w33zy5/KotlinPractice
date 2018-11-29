package com.example.krisnayana.kotlintestapp.main

import com.example.krisnayana.kotlintestapp.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}

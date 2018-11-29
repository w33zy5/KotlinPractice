package com.example.krisnayana.kotlintestapp.main

import com.example.krisnayana.kotlintestapp.api.ApiRepository
import com.example.krisnayana.kotlintestapp.api.TheSportDBApi
import com.example.krisnayana.kotlintestapp.model.TeamResponse
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainPresenter(private val view: MainView,
                    private val apiRepository: ApiRepository,
                    private val gson: Gson){

    fun getTeamList(league: String?){
        view.showLoading()
        doAsync{
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportDBApi.getTeams(league)),
                    TeamResponse::class.java
            )

            uiThread{
                view.hideLoading()
                view.showTeamList(data.teams)
            }
        }
    }
}
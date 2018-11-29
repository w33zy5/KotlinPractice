package com.example.krisnayana.kotlintestapp.api

import android.net.Uri
import com.example.krisnayana.kotlintestapp.BuildConfig

object TheSportDBApi {
    fun getTeams(league: String?): String{
        //Bisa seperti ini
        /*return BuildConfig.BASE_URL + "api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/search_all_teams.php?l=" + league*/
        //Atau seperti ini
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
                .appendPath("api")
                .appendPath("v1")
                .appendPath("json")
                .appendPath(BuildConfig.TSDB_API_KEY)
                .appendPath("search_all_teams.php")
                .appendQueryParameter("l", league)
                .build()
                .toString()
    }
}
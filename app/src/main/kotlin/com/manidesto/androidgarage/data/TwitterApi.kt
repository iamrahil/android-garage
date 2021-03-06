package com.manidesto.androidgarage.data

import com.manidesto.androidgarage.BuildConfig
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 * Created by manidesto on 23/01/16.
 */
interface TwitterApi {
    @Headers("Authorization: Bearer " + BuildConfig.TWITTER_KEY)
    @GET("search/tweets.json")
    fun searchTweets(@Query("q")query : String) : Call<SearchResult>
}

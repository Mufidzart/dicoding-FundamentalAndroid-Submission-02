package com.mufidz.githubusersubmission2.github.api

import com.mufidz.githubusersubmission2.github.model.DetailUserResponse
import com.mufidz.githubusersubmission2.github.model.UserGitHub
import com.mufidz.githubusersubmission2.github.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: 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")
    fun getSearchUser(
        @Query("q") query: String
    ):Call<UserResponse>

    @GET("users/{name}")
    @Headers("Authorization: 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")
    fun getUserDetail(
        @Path("name") username : String
    ):Call<DetailUserResponse>

    @GET("users/{name}/followers")
    @Headers("Authorization: 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")
    fun geFollowers(
        @Path("name") username : String
    ):Call<ArrayList<UserGitHub>>

    @GET("users/{name}/following")
    @Headers("Authorization: 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")
    fun geFollowing(
        @Path("name") username : String
    ):Call<ArrayList<UserGitHub>>
}
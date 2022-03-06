package com.ehsankolivand.remote

import com.ehsankolivand.model.RepoSearchResponse
import retrofit2.http.GET


interface GithubApi {
    @GET("search/repositories?q=tetris")
    suspend fun getRepos(): RepoSearchResponse
}
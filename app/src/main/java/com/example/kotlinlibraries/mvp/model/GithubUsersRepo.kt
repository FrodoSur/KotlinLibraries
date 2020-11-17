package com.example.kotlinlibraries.mvp.model

import java.util.*

class GithubUsersRepo {
    private val repositories = listOf(
        GithubUser("login1"),
        GithubUser("login2"),
        GithubUser("login3"),
        GithubUser("login4"),
        GithubUser("login5")
    )

  /*  fun getUsers() : Observable<GithubUser> {
        return return Observable.fromIterable(repositories)
    } */

    fun getUsers() : Observable<GithubUser> {
        return  Observable.fromIterable(repositories)
    }
}
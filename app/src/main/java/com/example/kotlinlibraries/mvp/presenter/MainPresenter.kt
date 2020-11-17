package com.example.kotlinlibraries.mvp.presenter

import com.kotlin.geekbrains_dlls.mvp.view.MainView
import com.example.kotlinlibraries.navigation.Screens

class MainPresenter(val router: Router) : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.replaceScreen(Screens.UsersScreen())
    }

    fun backClicked() {
        router.exit()
    }
}
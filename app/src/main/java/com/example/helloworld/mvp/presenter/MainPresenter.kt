package com.example.helloworld.mvp.presenter

import com.example.helloworld.mvp.contract.MainContract

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {
    init {
        view.onShowTextBtnPressed { onShowTextBtnPressed() }
    }

    override fun onShowTextBtnPressed() {
        view.setToast()
    }
}

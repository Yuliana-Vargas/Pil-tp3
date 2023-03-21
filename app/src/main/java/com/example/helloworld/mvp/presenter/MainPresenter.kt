package com.example.helloworld.mvp.presenter

import com.example.helloworld.mvp.contract.MainContract

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    init {
        view.onShowTextBtnPressed { onShowTextBtnPressed(view.getInputText()) }
    }

    override fun onShowTextBtnPressed(text: String) {
        if (text.isEmpty()) {
            view.showToastEmptyInputError()
        } else {
            view.showToast(text)
        }
    }
}

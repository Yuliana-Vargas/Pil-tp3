package com.example.helloworld.mvp.contract

interface MainContract {
    interface View {
        fun onShowTextBtnPressed(onClick: () -> Unit)
        fun showToast(text: String)
        fun showToastEmptyInputError()
        fun getInputText(): String
    }

    interface Presenter {
        fun onShowTextBtnPressed(text: String)
    }
}

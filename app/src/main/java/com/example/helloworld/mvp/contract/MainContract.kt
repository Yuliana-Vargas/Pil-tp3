package com.example.helloworld.mvp.contract

interface MainContract {
    interface View {
        fun onShowTextBtnPressed(onClick: () -> Unit)
        fun setToast()
    }

    interface Presenter {
        fun onShowTextBtnPressed()
    }
}

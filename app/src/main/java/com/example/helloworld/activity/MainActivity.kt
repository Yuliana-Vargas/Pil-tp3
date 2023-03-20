package com.example.helloworld.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.mvp.presenter.MainPresenter
import com.example.helloworld.mvp.view.MainView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainPresenter(MainView(this))
    }
}

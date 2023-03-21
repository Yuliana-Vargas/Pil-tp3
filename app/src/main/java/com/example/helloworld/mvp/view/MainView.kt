package com.example.helloworld.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.helloworld.R
import com.example.helloworld.databinding.ActivityMainBinding
import com.example.helloworld.mvp.contract.MainContract
import com.example.helloworld.mvp.view.base.ActivityView

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)
    init {
        activity.setContentView(binding.root)
    }

    override fun getInputText(): String {
        return binding.insertText.text.toString()
    }
    override fun onShowTextBtnPressed(onClick: () -> Unit) {
        binding.btnShowText.setOnClickListener { onClick() }
    }

    override fun showToast(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }

    override fun showToastEmptyInputError() {
        Toast.makeText(context, R.string.error_message, Toast.LENGTH_SHORT).show()
    }
}

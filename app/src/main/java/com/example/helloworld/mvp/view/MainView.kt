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

    override fun onShowTextBtnPressed(onClick: () -> Unit) {
        binding.btnShowText.setOnClickListener { onClick() }
    }

    private var text = binding.insertText.text
    override fun setToast() {
        Toast.makeText(context, verifyText(), Toast.LENGTH_SHORT).show()
    }

    private fun verifyText(): String {
        return text.toString().ifEmpty {
            context?.getString(R.string.error_message).toString()
        }
    }
}

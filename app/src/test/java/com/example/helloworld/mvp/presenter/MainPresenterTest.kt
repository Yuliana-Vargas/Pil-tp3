package com.example.helloworld.mvp.presenter

import com.example.helloworld.mvp.contract.MainContract
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {
    private lateinit var presenter: MainContract.Presenter

    @MockK
    private lateinit var view: MainContract.View

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)
        presenter = MainPresenter(view)
    }

    @Test
    fun `mocked presenter test`() {
        presenter.onShowTextBtnPressed()
        verify { view.setToast() }
    }
}

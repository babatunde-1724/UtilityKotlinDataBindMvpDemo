package com.example.framgiababatundefatoyesunday.utiltykotlindatabindmvpdemo.home

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.example.framgiababatundefatoyesunday.utiltykotlindatabindmvpdemo.R
import com.example.framgiababatundefatoyesunday.utiltykotlindatabindmvpdemo.databinding.ActivityHomeBinding

class HomeActivity : Activity(), HomeContract.ViewModel {
  private var mBinding: ActivityHomeBinding? = null
  private var mPresenter: HomePresenter? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    mBinding = DataBindingUtil.setContentView(this, R.layout.activity_home)
    mPresenter = HomePresenter(this)
    mBinding!!.presenter = mPresenter
  }

  override fun gotoNotes() {
    //Todo
  }

  override fun gotoDiary() {
    //Todo
  }

  override fun gotoContacts() {
    //Todo
  }

  override fun onStart() {
    super.onStart()
  }
}
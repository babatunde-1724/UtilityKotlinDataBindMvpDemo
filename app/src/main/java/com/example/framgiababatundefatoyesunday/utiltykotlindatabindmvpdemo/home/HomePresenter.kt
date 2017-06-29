package com.example.framgiababatundefatoyesunday.utiltykotlindatabindmvpdemo.home

class HomePresenter(viewModel: HomeContract.ViewModel) : HomeContract.Presenter {

  private val mViewModel: HomeContract.ViewModel = viewModel

  override fun toNotes() {
    mViewModel.gotoNotes()
  }

  override fun toDiary() {
    mViewModel.gotoDiary()
  }

  override fun toContacts() {
    mViewModel.gotoContacts()
  }
}
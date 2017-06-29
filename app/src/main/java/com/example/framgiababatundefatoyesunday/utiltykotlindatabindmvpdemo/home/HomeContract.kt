package com.example.framgiababatundefatoyesunday.utiltykotlindatabindmvpdemo.home

interface HomeContract {
  interface ViewModel {
    fun gotoNotes()
    fun gotoDiary()
    fun gotoContacts()
  }
  interface Presenter {
    fun toNotes()
    fun toDiary()
    fun toContacts()
  }
}
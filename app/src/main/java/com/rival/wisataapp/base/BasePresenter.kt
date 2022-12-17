package com.rival.wisataapp.base

import com.rival.wisataapp.MainActivity

interface BasePresenter<T> {
    fun onAttach(view: MainActivity)
    fun onDetach()
}
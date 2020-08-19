package com.myweatherbroadcast.android.ui.place

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders

class PlaceFragment : Fragment() {

    val viewModel by lazy {
        ViewModelProviders.of(this).get(PlaceViewModel::class.java)
    }



}
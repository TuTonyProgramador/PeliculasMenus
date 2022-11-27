package com.example.peliculas.activities

import android.os.Bundle
import com.example.peliculas.R
import com.example.peliculas.adapter.ActivityWithMenus

class info : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
    }
}
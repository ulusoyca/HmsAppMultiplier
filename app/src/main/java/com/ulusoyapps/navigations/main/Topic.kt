package com.ulusoyapps.navigations.main

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val title: Int,
    @StringRes val description: Int,
    @StringRes val window1: Int,
    val window1Action: () -> Unit,
    val window2Action: () -> Unit,
    val window3Action: () -> Unit,
    @StringRes val window2: Int,
    @StringRes val window3: Int,
    @DrawableRes val image: Int
)

package com.example.lab2_belyakov.data

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Android(val title: String,
                   @DrawableRes val ImageAndroid: Int,
                   val release_data: String,
                   val description: String
) : Parcelable
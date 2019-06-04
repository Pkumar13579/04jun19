package com.example.iteradmin.a04_jun_19

import android.provider.MediaStore

class card(thumbnails: String,title:String,subtitle:String){
    private val thumbnails:String
    private val title:String
    private val subtitle:String

    init {
        this.thumbnails=thumbnails
        this.title=title
        this.subtitle=subtitle
    }
    fun getThumbnail():String{
        return this.thumbnails
    }
    fun getTitle():String{
        return this.title
    }
    fun getSubTitle():String{
        return this.subtitle
    }
}
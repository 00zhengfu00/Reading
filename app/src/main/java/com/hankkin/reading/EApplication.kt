package com.hankkin.reading

import android.app.Application
import com.hankkin.reading.utils.FileUtils

/**
 * Created by huanghaijie on 2018/5/18.
 */
class EApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        FileUtils.initSd()
    }

}
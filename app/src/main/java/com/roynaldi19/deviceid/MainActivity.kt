package com.roynaldi19.deviceid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.vrinda.kotlinpermissions.DeviceInfo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getDeviceId()
    }

    private fun getDeviceId() {
        val deviceId = DeviceInfo.getAndroidID(this)
        textId.text = deviceId
    }
}
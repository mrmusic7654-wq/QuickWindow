package com.quickwindow
import android.app.Service
import android.content.Intent
import android.os.IBinder
class WindowOverlayService : Service() { override fun onBind(intent: Intent?): IBinder? = null }
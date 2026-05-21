package com.quickwindow
import android.app.Service
import android.content.Intent
import android.os.IBinder
class FloatingMenuService : Service() { override fun onBind(intent: Intent?): IBinder? = null }
package com.quickwindow
import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
class AccessibilityManagerService : AccessibilityService() { override fun onAccessibilityEvent(e: AccessibilityEvent?) {} override fun onInterrupt() {} }
package com.quickwindow
import androidx.lifecycle.ViewModel
class AppViewModel(private val repo: AppRepository) : ViewModel() { val apps = repo.allApps }
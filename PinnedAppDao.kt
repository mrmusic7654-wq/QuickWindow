package com.quickwindow
import androidx.room.*
@Dao interface PinnedAppDao { @Query("SELECT * FROM pinned_apps") fun getAll(): List<PinnedApp> }
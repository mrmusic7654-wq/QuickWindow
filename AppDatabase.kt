package com.quickwindow
import androidx.room.*
@Database(entities = [PinnedApp::class], version = 1)
abstract class AppDatabase : RoomDatabase() { abstract fun pinnedAppDao(): PinnedAppDao }
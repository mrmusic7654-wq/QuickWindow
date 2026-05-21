package com.quickwindow
class AppRepository(private val dao: PinnedAppDao) { val allApps = dao.getAll() }
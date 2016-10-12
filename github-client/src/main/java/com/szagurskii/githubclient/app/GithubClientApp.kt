package com.szagurskii.githubclient.app

import android.app.Application
import com.szagurskii.githubclient.BuildConfig
import timber.log.Timber

class GithubClientApp : Application() {

  override fun onCreate() {
    super.onCreate()
    if (BuildConfig.DEBUG) {
      Timber.plant(Timber.DebugTree())
    }
  }
}
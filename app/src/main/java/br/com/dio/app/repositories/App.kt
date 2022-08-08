package br.com.dio.app.repositories

import android.app.Application
import br.com.dio.app.repositories.domain.DomainModule
import di.DataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import presentation.di.PresentationModel

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModel.load()
    }
}
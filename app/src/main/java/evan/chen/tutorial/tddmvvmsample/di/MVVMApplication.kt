package evan.chen.tutorial.tddmvvmsample

import android.app.Application
import evan.chen.tutorial.mvvmretrofitsample.appModule
import org.koin.core.context.startKoin

class MVVMApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin { modules(listOf(appModule)) }
    }
}
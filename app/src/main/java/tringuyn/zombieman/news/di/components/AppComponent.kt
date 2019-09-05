package tringuyn.zombieman.news.di.components
import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import tringuyn.zombieman.news.App
import tringuyn.zombieman.news.di.modules.ActivityModule
import tringuyn.zombieman.news.di.modules.AppModule
import javax.inject.Singleton

/**
 * Created by Frederick on 20/08/2017.
 */

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}
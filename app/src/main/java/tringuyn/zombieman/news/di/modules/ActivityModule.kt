package tringuyn.zombieman.news.di.modules
import dagger.Module
import dagger.android.ContributesAndroidInjector
import tringuyn.zombieman.news.view.DetailNewsActivity
import tringuyn.zombieman.news.view.MainActivity


/**
 * Created by Frederick on 20/08/2017.
 */
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeHomeActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeDetailActivity() : DetailNewsActivity


}
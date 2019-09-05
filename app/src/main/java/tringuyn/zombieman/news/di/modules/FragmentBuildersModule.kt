package tringuyn.zombieman.news.di.modules
import dagger.Module
import dagger.android.ContributesAndroidInjector
import tringuyn.zombieman.news.view.NewsFragment


/**
 * Created by Frederick on 20/08/2017.
 */
@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    internal abstract fun contributeSourcesFragment(): NewsFragment

}

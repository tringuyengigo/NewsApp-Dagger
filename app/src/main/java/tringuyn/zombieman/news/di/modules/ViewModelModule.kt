package tringuyn.zombieman.news.di.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import tringuyn.zombieman.news.viewmodel.DetailNewsActivityViewModel
import tringuyn.zombieman.news.viewmodel.NewsFragmentViewModel
import tringuyn.zombieman.news.viewmodel.ViewModelFactory
import tringuyn.zombieman.news.viewmodel.ViewModelKey


/**
 * Created by Frederick on 20/08/2017.
 */
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(NewsFragmentViewModel::class)
    internal abstract fun bindSourceViewModel(newsFragmentViewModel: NewsFragmentViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DetailNewsActivityViewModel::class)
    internal abstract fun bindArticleViewModel(detailNewsActicityViewModel: DetailNewsActivityViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
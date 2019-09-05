package tringuyn.zombieman.news.di.modules
import android.app.Application
import android.arch.persistence.room.Room
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import tringuyn.zombieman.news.model.api.NewsService
import tringuyn.zombieman.news.model.db.AppDatabase
import tringuyn.zombieman.news.utils.LiveDataCallAdapterFactory
import tringuyn.zombieman.news.view.model.ArticleDao
import tringuyn.zombieman.news.view.model.SourceDao
import javax.inject.Singleton



/**
 * Created by Frederick on 20/08/2017.
 */
@Module(includes = [ViewModelModule::class])
class AppModule {

    @Singleton
    @Provides
    fun provideNewsService(): NewsService {
        return Retrofit.Builder()
                .baseUrl("https://newsapi.org/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(LiveDataCallAdapterFactory())
                .build()
                .create(NewsService::class.java)
    }

    @Singleton
    @Provides
    fun provideDb(app: Application): AppDatabase {
        return Room.databaseBuilder(app, AppDatabase::class.java, AppDatabase.DATABASE_NAME).fallbackToDestructiveMigration().build()
    }

    @Singleton
    @Provides
    fun provideArticleDao(db: AppDatabase): ArticleDao {
        return db.articleDao()
    }

    @Singleton
    @Provides
    fun provideSourceDao(db: AppDatabase): SourceDao {
        return db.sourceDao()
    }
}
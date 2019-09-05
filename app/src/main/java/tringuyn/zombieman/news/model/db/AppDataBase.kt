package tringuyn.zombieman.news.model.db


import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import tringuyn.zombieman.news.view.model.*


/**
 * Created by Frederick on 20/08/2017.
 */
@Database(entities = [Article::class, Source::class], version = 9)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        @JvmStatic
        val DATABASE_NAME: String = "app.db"
    }
    abstract fun articleDao(): ArticleDao

    abstract fun sourceDao(): SourceDao
}
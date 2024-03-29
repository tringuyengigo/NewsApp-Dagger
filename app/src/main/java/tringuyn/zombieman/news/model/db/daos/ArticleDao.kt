package tringuyn.zombieman.news.view.model

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import tringuyn.zombieman.news.view.model.Article


/**
 * Created by Frederick on 20/08/2017.
 */
@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(article: Article?)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(articles: List<Article>?)

    @Query("SELECT * FROM articles")
    fun get(): LiveData<Article>

    @Query("SELECT * FROM articles WHERE source = :source")
    fun get(source: String?): LiveData<List<Article>>

    @Query("SELECT * FROM articles WHERE url = :url")
    fun findArticle(url: String): LiveData<Article>

    @Query("SELECT * FROM articles")
    fun listAll(): LiveData<List<Article>>

}
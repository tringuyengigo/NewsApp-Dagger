package tringuyn.zombieman.news.view.model

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import tringuyn.zombieman.news.view.model.Source

/**
 * Created by Frederick on 24/08/2017.
 */
@Dao
abstract class SourceDao {

    @Insert
    abstract fun insert(source: List<Source>?)

    @Query("SELECT * FROM sources")
    abstract fun list(): LiveData<List<Source>>

    @Query("SELECT * FROM sources WHERE category = :category")
    abstract fun listFiltered(category: String): LiveData<List<Source>>
}
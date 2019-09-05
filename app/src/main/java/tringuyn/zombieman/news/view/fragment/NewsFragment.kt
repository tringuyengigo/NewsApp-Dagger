package tringuyn.zombieman.news.view

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.annotation.Nullable
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import tringuyn.zombieman.news.R
import android.support.v7.widget.RecyclerView
import tringuyn.zombieman.news.view.adapter.NewsAdapter
import tringuyn.zombieman.news.view.model.News
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager

class NewsFragment : Fragment() {

    private var listNews: MutableList<News>? = null
    private var recyclerView: RecyclerView? = null
    private var mAdapter: NewsAdapter? = null

    @Nullable
    override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeData()
        recyclerView = view.findViewById(R.id.recycler_view) as RecyclerView
        mAdapter = listNews?.let { NewsAdapter(it) }
        val mLayoutManager = LinearLayoutManager(view.context)
        recyclerView!!.layoutManager = mLayoutManager
        recyclerView!!.itemAnimator = DefaultItemAnimator()
        recyclerView!!.adapter = mAdapter
        recyclerView!!.setHasFixedSize(true)
    }

    private fun initializeData() {
        listNews = ArrayList()
        listNews!!.add(News("New 1", "Content 1", R.drawable.new_icon))
        listNews!!.add(News("New 2", "Content 2", R.drawable.new_icon))
        listNews!!.add(News("New 3", "Content 3", R.drawable.new_icon))
        listNews!!.add(News("New 1", "Content 1", R.drawable.new_icon))
        listNews!!.add(News("New 2", "Content 2", R.drawable.new_icon))
        listNews!!.add(News("New 3", "Content 3", R.drawable.new_icon))
        listNews!!.add(News("New 1", "Content 1", R.drawable.new_icon))
        listNews!!.add(News("New 2", "Content 2", R.drawable.new_icon))
        listNews!!.add(News("New 3", "Content 3", R.drawable.new_icon))
        listNews!!.add(News("New 1", "Content 1", R.drawable.new_icon))
        listNews!!.add(News("New 2", "Content 2", R.drawable.new_icon))
        listNews!!.add(News("New 3", "Content 3", R.drawable.new_icon))
    }

}
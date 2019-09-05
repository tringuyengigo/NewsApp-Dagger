package tringuyn.zombieman.news.view.adapter

import android.widget.TextView
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.view.LayoutInflater
import tringuyn.zombieman.news.R
import tringuyn.zombieman.news.view.model.News




class NewsAdapter(lNews: MutableList<News>) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    var mlistNews: MutableList<News>? = null
    init {
        mlistNews = lNews
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): NewsViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.layout_card_news, viewGroup, false)
        return NewsViewHolder(v)
    }

    override fun getItemCount(): Int {
        return mlistNews?.size!!
    }

    override fun onBindViewHolder(newsViewHolder: NewsViewHolder, p1: Int) {
        newsViewHolder.title.text = mlistNews?.get(p1)?.title
        newsViewHolder.description.text = mlistNews?.get(p1)?.description
        mlistNews?.get(p1)?.photo?.let { newsViewHolder.newsPhoto.setImageResource(it) }
    }

    class NewsViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var cv: CardView = itemView.findViewById(R.id.card_view)
        var title: TextView = itemView.findViewById(R.id.new_title)
        var description: TextView = itemView.findViewById(R.id.news_description)
        var newsPhoto: ImageView = itemView.findViewById(R.id.news_photo) as ImageView
    }

}
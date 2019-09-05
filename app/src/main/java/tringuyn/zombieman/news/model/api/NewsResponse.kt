package tringuyn.zombieman.news.model.api

import tringuyn.zombieman.news.view.model.Article
import tringuyn.zombieman.news.view.model.Source

/**
 * Created by Frederick on 24/08/2017.
 */
class NewsResponse {

    var status: String
    var source: String
    var sources: ArrayList<Source>
    var articles: ArrayList<Article>

    constructor(status: String, source: String, sources: ArrayList<Source>, articles: ArrayList<Article>) {
        this.status = status
        this.source = source
        this.sources = sources
        this.articles = articles

    }
}
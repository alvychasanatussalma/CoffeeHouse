package id.ac.amikom.coffeehouse.data.remote

import retrofit2.Call
import id.ac.amikom.coffeehouse.data.model.NewsList
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {
    @GET("https://berita-news.herokuapp.com/page/1")
    fun listNews() : Call<NewsList>

    @GET("https://berita-news.herokuapp.com/detail/url=")
    fun detailNews(@Query("url") url: String) : Call<NewsList>

    @GET("https://berita-news.herokuapp.com/search/?q=")
    fun searchNews(@Query("q") query: String) : Call<NewsList>

}
package com.example.proje5;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    String BASE_URL="https://newsapi.org/v2/";


    @GET("top-headlines")
    Call<mainNews> getNews(
            @Query("country") String country,
            @Query("page size") int pagesize,
            @Query("apiKey") String apikey
    );

    @GET("top-headlines")
    Call<mainNews> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("page size") int pagesize,
            @Query("apiKey") String apikey
    );


}

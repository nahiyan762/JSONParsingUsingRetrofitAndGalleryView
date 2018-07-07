package com.example.hp.jsonparsingusingretrofitandgalleryview;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://api.myjson.com/bins/";

    @GET("oz8s2")
    Call<List<Hero>> getHeroes();
}

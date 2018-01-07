package com.example.kesar.taxibooking.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by kesar on 1/7/2018.
 */

public interface IGoogleAPI {

    @GET
    Call<String> getPath(@Url String url);

}

package com.imamwahyudi.testrevactory.network;



import com.imamwahyudi.testrevactory.model.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {
    @GET("users")
    Call<Response> discoverMovie();

    @GET("3/discover/tv?api_key=8db767f07bca4232adeae5ad948924a3&language=en-US")
    Call<Response> discoverTvShow();
}

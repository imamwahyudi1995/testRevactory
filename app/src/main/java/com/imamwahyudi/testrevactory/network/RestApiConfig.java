package com.imamwahyudi.testrevactory.network;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestApiConfig {
    private static Retrofit getRetrofit(){
        Retrofit retrofit;
        retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

    public static RestApi getRestApi(){
        return getRetrofit().create(RestApi.class);
    }
}

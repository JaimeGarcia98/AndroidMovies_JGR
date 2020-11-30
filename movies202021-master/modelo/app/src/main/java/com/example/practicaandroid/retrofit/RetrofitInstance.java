package com.example.practicaandroid.retrofit;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit;
    private static final String API_KEY = "8bc421c22af84bb77bdcfd9cccd4d231";
    private static final String BASE_URL = "https://api.themoviedb.org/3/";
    private static final String LANGUAGE = "es";


    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static String getApiKey () {
        return API_KEY;
    }

    public static String getLanguage() { return LANGUAGE; }
}
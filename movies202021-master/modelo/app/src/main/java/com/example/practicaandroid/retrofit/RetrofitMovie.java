package com.example.practicaandroid.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitMovie {

    private static Retrofit retrofit;

    /* Indique su API Key de themoviedb.org */
    private static final String API_KEY = "8bc421c22af84bb77bdcfd9cccd4d231";
    private static final String BASE_URL = "https://api.themoviedb.org/3/";

    /*
    Si no exite la instancia retrofit la crea, indicando que se va a convertir un fichero JSON
    */
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
}

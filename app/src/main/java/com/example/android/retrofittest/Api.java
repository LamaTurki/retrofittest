package com.example.android.retrofittest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by lama on 22/07/2018 AD.
 */

public interface Api {

    String BASE_URL = "https://3d4e6e92-2233-4123-845c-fdfb146901ab.mock.pstmn.io/";

    @GET("lama")
    Call<List<Hero>> getHeroes();
}
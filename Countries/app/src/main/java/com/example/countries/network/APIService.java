package com.example.countries.network;

import com.example.countries.model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("photos")
    Call<List<MovieModel>> getMovieList();
}

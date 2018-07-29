package com.delaroystudios.javadevelopers.api;

import com.delaroystudios.javadevelopers.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("/search/users?q=language:java+location:Santo&Domingo")
    Call<ItemResponse> getItems();
}

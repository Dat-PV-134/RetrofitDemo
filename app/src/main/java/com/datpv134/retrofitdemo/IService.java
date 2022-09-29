package com.datpv134.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IService {
    @GET("getProduct")
    Call<List<Product>> getProduct();
}

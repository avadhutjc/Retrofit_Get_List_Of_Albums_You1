package com.masai.a1414july_get_list_of_albums_you1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/albums")
    Call<List<ResponseModel>> getAlbums();
}

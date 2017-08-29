package v_satyamounika.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import v_satyamounika.myapplication.pojo.MultipleResource;

/**
 * Created by v-satya.chandu on 8/25/2017.
 */

interface APIInterface {

    @GET("daily?")
    Call<MultipleResource> getDetails(@Query("zip") String zip, @Query("appid") String appid);

//    @GET("movie/{id}")
//    Call<Temp> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}



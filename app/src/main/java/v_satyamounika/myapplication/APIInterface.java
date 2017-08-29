package v_satyamounika.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import v_satyamounika.myapplication.pojo.TempList;

/**
 * Created by v-satya.chandu on 8/25/2017.
 */

interface APIInterface {

    @GET("movie/top_rated")
    Call<TempList> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<TempList> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);


}

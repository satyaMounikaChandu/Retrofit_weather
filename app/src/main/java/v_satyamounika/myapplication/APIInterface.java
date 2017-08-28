package v_satyamounika.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import v_satyamounika.myapplication.pojo.MultipleResource;
import v_satyamounika.myapplication.pojo.TempList;

/**
 * Created by v-satya.chandu on 8/25/2017.
 */

interface APIInterface {

    @GET("/api.openweathermap.org/data/2.5/forecast/daily?")
    Call<MultipleResource> doGetListResources();

    @GET("/api.openweathermap.org/data/2.5/forecast/daily?")
    Call<TempList> doGetUserList(@Query("zip") Integer zip);

}

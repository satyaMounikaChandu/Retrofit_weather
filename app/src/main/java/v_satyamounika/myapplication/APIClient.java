package v_satyamounika.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by v-satya.chandu on 8/25/2017.
 */

class APIClient {

    public static final String BASE_URL = "https://api.openweathermap.org/data/2.5/forecast/";
    private static Retrofit retrofit = null;

    static Retrofit getClient(){

        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}

package v_satyamounika.myapplication.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by v-satya.chandu on 8/25/2017.
 */

public class MultipleResource {

    @SerializedName("list")
    public List list = null;

    public class List{

        @SerializedName("temp")
        public List temp = null;
    }

    public class Temp{

        @SerializedName("day")
        public Integer dayTemp;

        @SerializedName("night")
        public Integer nightTemp;

        @SerializedName("eve")
        public Integer eveTemp;
    }



}

package v_satyamounika.myapplication.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by v-satya.chandu on 8/28/2017.
 */

public class TempList {

    @SerializedName("list")
    public List list = new ArrayList();

    public class List{

        @SerializedName("temp")
        public List temp = new ArrayList();
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

package v_satyamounika.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import v_satyamounika.myapplication.pojo.MultipleResource;
import v_satyamounika.myapplication.pojo.Temp;

public class MainActivity extends AppCompatActivity {

    protected TextView Temp;
    protected EditText Zip;
    protected Button Present, Max, Min;
    private static final String TAG = MainActivity.class.getSimpleName();

    String zip;
    APIInterface apiInterface;
    //private final static String API_KEY = "7e8f60e325cd06e164799af1e317d7a7";
    private final static String API_KEY = "20611fbf799ba869dfe5373d82d525c7";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY first from", Toast.LENGTH_LONG).show();
            return;
        }

        Temp = (TextView)findViewById(R.id.textView_temp);
        Zip = (EditText) findViewById(R.id.edittext_zipcode);
        Present = (Button)findViewById(R.id.button_present);
        Max = (Button)findViewById(R.id.button_max);
        Min = (Button)findViewById(R.id.button_min);

        apiInterface = APIClient.getClient().create(APIInterface.class);

        zip = "60607";
        Present.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {

                                           zip = Zip.getText().toString();
                                           Call<MultipleResource> call = apiInterface.getDetails(zip, API_KEY);
                                           call.enqueue(new Callback<MultipleResource>() {
                                               @Override
                                               public void onResponse(Call<MultipleResource> call, Response<MultipleResource> response) {
                                                   Temp temperature = response.body().getList().get(0).getTemp();
                                                   Temp.setText(temperature.getDay().toString());
                                               }
                                               //temperature.getList().getTemp().getDay().toString());

                                               @Override
                                               public void onFailure(Call call, Throwable t) {
                                                   call.cancel();

                                               }
                                           });
                                       }
                                   });

        Max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                zip = Zip.getText().toString();
                Call<MultipleResource> call = apiInterface.getDetails(zip, API_KEY);
                call.enqueue(new Callback<MultipleResource>() {
                    @Override
                    public void onResponse(Call<MultipleResource> call, Response<MultipleResource> response) {
                        Temp temperature = response.body().getList().get(0).getTemp();
                        Temp.setText(temperature.getMax().toString());
                    }
                    //temperature.getList().getTemp().getDay().toString());

                    @Override
                    public void onFailure(Call call, Throwable t) {
                        call.cancel();
                    }
                });

            }
        });

        Min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                zip = Zip.getText().toString();
                Call<MultipleResource> call = apiInterface.getDetails(zip, API_KEY);
                call.enqueue(new Callback<MultipleResource>() {
                    @Override
                    public void onResponse(Call<MultipleResource> call, Response<MultipleResource> response) {
                        Temp temperature = response.body().getList().get(0).getTemp();
                        Temp.setText(temperature.getMin().toString());
                    }
                    //temperature.getList().getTemp().getDay().toString());

                    @Override
                    public void onFailure(Call call, Throwable t) {
                        call.cancel();
                    }
                });
            }
        });
    }
}

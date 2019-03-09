package com.example.ojooapp;

import androidx.appcompat.app.AppCompatActivity;
import cz.msebera.android.httpclient.Header;

import android.os.Bundle;
<<<<<<< HEAD
import android.widget.Toast;

=======
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ojooapp.Models.CWeatherClass;
import com.google.gson.Gson;
>>>>>>> 5efd74256b083846bdbd80de40146023e6a124c0
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;

public class GetDataActivity extends AppCompatActivity {

<<<<<<< HEAD
=======

    Button btnGetData;

>>>>>>> 5efd74256b083846bdbd80de40146023e6a124c0
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);

<<<<<<< HEAD
        getData();
=======
        btnGetData = findViewById(R.id.btnGetData);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
            }
        });

>>>>>>> 5efd74256b083846bdbd80de40146023e6a124c0

    }


    private void getData() {
<<<<<<< HEAD

        String url = "http://api.openweathermap.org/data/2.5/forecast?id=112931&APPID=d8848fb2a6d94ea1309cf0b74c498fb0";
=======
        String url = "https://api.apixu.com/v1/current.json?key=2edfb78c56e64c07bf4121640190603&q=Paris";
>>>>>>> 5efd74256b083846bdbd80de40146023e6a124c0
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
<<<<<<< HEAD
                Toast.makeText(GetDataActivity.this, "no", Toast.LENGTH_SHORT).show();
=======
                Toast.makeText(GetDataActivity.this, "Nashod", Toast.LENGTH_SHORT).show();
>>>>>>> 5efd74256b083846bdbd80de40146023e6a124c0
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
<<<<<<< HEAD
                Toast.makeText(GetDataActivity.this, "yes", Toast.LENGTH_SHORT).show();

            }
        });

=======
                try {
                    Gson gson = new Gson();
                    CWeatherClass w = gson.fromJson(responseString, CWeatherClass.class);

                    String city = w.getLocation().getName();
                    btnGetData.setText(city);

                } catch (Exception e) {
                    Log.d("mehrdad", "onsuccess" + e.getMessage());
                }


            }
        });
>>>>>>> 5efd74256b083846bdbd80de40146023e6a124c0
    }
}

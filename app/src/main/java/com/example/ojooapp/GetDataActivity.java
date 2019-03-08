package com.example.ojooapp;

import androidx.appcompat.app.AppCompatActivity;
import cz.msebera.android.httpclient.Header;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ojooapp.Models.CWeatherClass;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;

public class GetDataActivity extends AppCompatActivity {


    Button btnGetData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);

        btnGetData = findViewById(R.id.btnGetData);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
            }
        });


    }


    private void getData() {
        String url = "https://api.apixu.com/v1/current.json?key=2edfb78c56e64c07bf4121640190603&q=Paris";
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Toast.makeText(GetDataActivity.this, "Nashod", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
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
    }
}

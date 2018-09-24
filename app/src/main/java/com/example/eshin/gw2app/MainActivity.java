package com.example.eshin.gw2app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            String url = "https://api.github.com/orgs/nodejs";
            JSONObject json;
            json = new JSONObject(url);
            JSONObject jsonResponse = json.getJSONObject("url");
            String jsonString = jsonResponse.getString("id");
            textView.setText(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

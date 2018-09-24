package com.example.eshin.gw2app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.JsonReader;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private String url = "https://api.github.com/orgs/nodejs";
    private JSONObject json;

    {
        try {
            json = new JSONObject(url);
            JSONObject jsonResponse = json.getJSONObject("url");
            String jsonString = jsonResponse.getString("id");
            TextView textView = null;
            textView.setText(jsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}

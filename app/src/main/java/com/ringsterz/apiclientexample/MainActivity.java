package com.ringsterz.apiclientexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {

    private EditText etLatitude, etLongitude;
    private Button btnRequst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLatitude = (EditText)findViewById(R.id.et_latitude);
        etLongitude = (EditText)findViewById(R.id.et_longitude);
        btnRequst = (Button)findViewById(R.id.btn_request);
        final TextView mTextView = (TextView) findViewById(R.id.text);

        final RequestQueue queue = Volley.newRequestQueue(this);
        final String base_url ="http://landlord-reputation.herokuapp.com/reputation/api/";

        btnRequst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String query = etLongitude.getText().toString()+"+"+etLatitude.getText().toString();
                JsonObjectRequest jsObjRequest = new JsonObjectRequest
                        (Request.Method.GET, base_url+query, null, new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                mTextView.setText("Response: " + response.toString());
                            }
                        }, new Response.ErrorListener() {

                            @Override
                            public void onErrorResponse(VolleyError error) {
                                mTextView.setText("Error: "+error.toString());
                            }
                        });

                queue.add(jsObjRequest);
            }
        });
    }

}

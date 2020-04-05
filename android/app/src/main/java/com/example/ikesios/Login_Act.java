package com.example.ikesios;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Login_Act extends AppCompatActivity {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private OkHttpClient client = new OkHttpClient();
    Context ta=this;
    EditText email ;
EditText password;

Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        setTitle("Ικέσιος ");
        email=(EditText) findViewById(R.id.Login_Email);
        password=(EditText) findViewById(R.id.Login_Password);
        submit=(Button)findViewById(R.id.Login_Submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emai=email.getText().toString();
                String passwor=password.getText().toString();
                System.out.println("marios");


              //  String url="https://vis36020200404041324.azurewebsites.net/api/Account/Login";


                JSONObject jsonParam = new JSONObject();
                try {
                    jsonParam.put("Email", emai);
                    jsonParam.put("Password", passwor);
                } catch (JSONException e) {
                    e.printStackTrace();
                }




                OkHttpClient client = new OkHttpClient();

                String url = "https://vis36020200404041324.azurewebsites.net/api/Account/Register";


                Api.post("Account/Login",jsonParam.toString(),ta);



            }
        });



    }



  private String post(String url, String json) throws IOException {

        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}

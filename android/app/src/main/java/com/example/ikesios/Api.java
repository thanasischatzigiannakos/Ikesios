package com.example.ikesios;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Api {
    private static final String TAG = "API";
    public static String apiResponse=null;
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
   private static String base = "https://vis36020200404041324.azurewebsites.net/api/";

   private static String incoming;
   private static Context te;


    public static void post(String url, String json, Context t){
        OkHttpClient client = new OkHttpClient();
        incoming=url;
        te=t;


        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(base+url)
                .post(body)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
               apiResponse = response.body().string();

                if (apiResponse.contains("successfully") && incoming.contains("Login") ) {


                    System.out.println("maaa");

                    Intent i=new Intent(te,Menu.class);
                    te.startActivity(i);


                    Log.d(TAG, apiResponse);

                }
                else if (apiResponse.contains("successfully") && incoming.contains("Register") ) {


                    System.out.println("maaa");

                    Intent i=new Intent(te,MainActivity.class);
                    te.startActivity(i);


                    Log.d(TAG, apiResponse);

                }
                else{

                    Log.d(TAG, apiResponse);

                }
            }
        });


    }

}

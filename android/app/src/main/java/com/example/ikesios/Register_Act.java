package com.example.ikesios;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.OkHttpClient;

public class Register_Act extends AppCompatActivity {

    EditText email;
    EditText onoma;
    EditText epitheto;
    EditText epalitheusi;
    TextView error;
    EditText kodikos;
    Button submit;
    Context ta=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);
        setTitle("Ικέσιος ");

        email=(EditText)findViewById(R.id.Register_Email);
        kodikos=(EditText)findViewById(R.id.Register_Kodikos);
        submit=(Button)findViewById(R.id.Register_Submit);
        onoma=(EditText)findViewById(R.id.Register_Onoma);
        epitheto=(EditText)findViewById(R.id.Register_Epitheto);
        epalitheusi=(EditText)findViewById(R.id.Register_Epalitheusi);
        error=(TextView)findViewById(R.id.Register_Error) ;

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               if(email.getText().toString().isEmpty() || kodikos.getText().toString().isEmpty() || onoma.getText().toString().isEmpty() || epitheto.getText().toString().isEmpty() ||epalitheusi.getText().toString().isEmpty() ) {

                   error.setText("Παρακαλώ συμπληρώστε όλα τα πεδία!");

               }

               else if (!email.getText().toString().contains("@") || !email.getText().toString().contains(".com")){
                   error.setText("                 To email δεν είναι σωστό!!");
               }
               else if (!kodikos.getText().toString().equals(epalitheusi.getText().toString())){
                   error.setText("                 Οι κωδικοί διαφέρουν!!");
               }

               else if (kodikos.length()<7){

                   error.setText("                 Αδύναμος Κωδικός!!");
               }
               else{
                String emai=email.getText().toString();
                String kodiko=kodikos.getText().toString();

                JSONObject jsonParam = new JSONObject();
                try {
                    jsonParam.put("Email", emai);
                    jsonParam.put("Password", kodiko);
                } catch (JSONException e) {
                    e.printStackTrace();
                }




                OkHttpClient client = new OkHttpClient();

                String url = "https://vis36020200404041324.azurewebsites.net/api/Account/Register";


                Api.post("Account/Register",jsonParam.toString(),ta);


            }}
        });

    }
}

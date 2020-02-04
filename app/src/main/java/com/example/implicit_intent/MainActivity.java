package com.example.implicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.DialerKeyListener;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button BTNcall,BTNfrnd, BTNweb, BTNmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTNcall=findViewById(R.id.BTNcall);
        BTNfrnd=findViewById(R.id.BTNfrnd);
        BTNweb=findViewById(R.id.BTNweb);
        BTNmap=findViewById(R.id.BTNmap);

        BTNcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });

        BTNfrnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9924962390"));
                startActivity(intent);
            }
        });

        BTNweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.in"));
                startActivity(intent);

            }
        });

        BTNmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q=surat"));
                startActivity(intent);
            }
        });

    }
}

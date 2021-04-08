package com.example.btth_tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnCm;
    ImageView imgM;
    private int n = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btnCm = findViewById(R.id.btnCm);
        imgM = findViewById(R.id.ImgM);
        Intent intent = new Intent(MainActivity.this,SelectionActivity.class);
        Intent i = getIntent();
        Phone p = (Phone) i.getSerializableExtra("phone");
        if( getIntent().getExtras() != null)
        {
            String name = p.getName();
            String color = p.getColor();
            String supplier = p. getSupplier();
            String price = p.getPrice();
            int img = p.getImg();
            if(name != null){
                imgM.setImageResource(img);
            }
        }


        btnCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p != null){
                    intent.putExtra("item",p);
                }
                startActivity(intent);
            }
        });
    }
}
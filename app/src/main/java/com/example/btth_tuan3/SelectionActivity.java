package com.example.btth_tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SelectionActivity extends AppCompatActivity {
    Button btnCl1;
    Button btnCl2;
    Button btnCl3;
    Button btnCl4;
    Button btnXong;
    ImageView imgSel;
    TextView tvName;
    TextView tvColor;
    TextView tvCC;
    TextView tvPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        Phone p1 = new Phone("Điện Thoại Vsmart Joy 3\n" +
                "Hàng chính hãng","Bạc","Tiki Trading","1.790.000 đ",R.drawable.bac);
        Phone p2 = new Phone("Điện Thoại Vsmart Joy 3\n" +
                "Hàng chính hãng","Đỏ","Tiki Trading","1.790.000 đ",R.drawable.red);
        Phone p3 = new Phone("Điện Thoại Vsmart Joy 3\n" +
                "Hàng chính hãng","Xanh","Tiki Trading","1.790.000 đ",R.drawable.xanh);
        Phone p4 = new Phone("Điện Thoại Vsmart Joy 3\n" +
                "Hàng chính hãng","Đen","Tiki Trading","1.790.000 đ",R.drawable.den);

        btnCl1 = findViewById(R.id.btnCl1);
        btnCl2 = findViewById(R.id.btnCl2);
        btnCl3 = findViewById(R.id.btnCl3);
        btnCl4 = findViewById(R.id.btnCl4);
        btnXong = findViewById(R.id.btnFinish);
        imgSel = findViewById(R.id.imgSelection);
        tvName = findViewById(R.id.tvName2);
        tvColor = findViewById(R.id.tvColor2);
        tvCC = findViewById(R.id.tvcc2);
        tvPrice = findViewById(R.id.tvPrice2);
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        Intent i = getIntent();
        Phone p = (Phone) i.getSerializableExtra("item");
        if( getIntent().getExtras() != null){
            String name = p.getName();
            String color = p.getColor();
            String supplier = p. getSupplier();
            String price = p.getPrice();
            int img = p.getImg();
            if(name != null){
                tvName.setText(p.getName());
                tvColor.setText(p.getColor());
                tvCC.setText(p.getSupplier());
                tvPrice.setText(p.getPrice());
                imgSel.setImageResource(img);
            }


        }
        btnCl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCl1.setText("O");
                intent.putExtra("phone",p1);
            }
        });
        btnCl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCl2.setText("O");
                intent.putExtra("phone",p2);
            }
        });
        btnCl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCl3.setText("O");
                intent.putExtra("phone",p4);
            }
        });
        btnCl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCl4.setText("O");
                intent.putExtra("phone",p3);
            }
        });
        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
package com.example.aplikasitasbih;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count =0;
    private Button btnKurang, btnTambah, btnReset;
    private TextView hasilHitung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKurang =findViewById(R.id.btnKurang);
        btnTambah =findViewById(R.id.btnTambah);
        hasilHitung= findViewById(R.id.hasil);
        btnReset=findViewById(R.id.btnReset);

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                hasilHitung.setText(Integer.toString(count));
            }
        });

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                hasilHitung.setText(Integer.toString(count));
            }
        });
    }
}
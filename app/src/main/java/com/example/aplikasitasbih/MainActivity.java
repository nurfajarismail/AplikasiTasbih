package com.example.aplikasitasbih;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int oldValue;
    int count = 0;
    private Button btnKurang, btnTambah, btnReset, btnUbah;
    private TextView hasilHitung,textUbah, txtper;
    int i = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKurang = findViewById(R.id.btnKurang);
        btnTambah = findViewById(R.id.btnTambah);
        hasilHitung = findViewById(R.id.hasil);
        btnReset = findViewById(R.id.btnReset);
        textUbah = (TextView) findViewById(R.id.perberapa);
        btnUbah = findViewById(R.id.btnUbah);
        txtper=findViewById(R.id.per);


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

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                hasilHitung.setText(Integer.toString(count));

            }
        });

        btnUbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i == 0) {
                    textUbah.setText("33") ;
                    btnUbah.setText("33");
                    txtper.setText("/");
                    hasilHitung.setText("0");
                    i++;
                } else if (i == 1) {
                    textUbah.setText("99");
                    btnUbah.setText("99");
                    txtper.setText("/");
                    hasilHitung.setText("0");
                    i = 2;
                } else if (i ==2 ){
                    textUbah.setText("");
                    btnUbah.setText("~");
                    txtper.setText("");
                    hasilHitung.setText("0");
                    i = 0;

                }
            }
        });

        //ubahHasilButton();


    }

//    private void ubahHasilButton() {
//        final String[] beberapaUbahan ={"33", "99", ""};
//        final TextView textUbah = (TextView) findViewById(R.id.perberapa);
//        btnUbah = findViewById(R.id.btnUbah);
//
//        btnUbah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int random = (int) (Math.random() * beberapaUbahan.length);
//                if (random == oldValue){
//                    random=(int) (Math.random() * beberapaUbahan.length);
//                }
//                textUbah.setText(beberapaUbahan[random]);
//                oldValue = random;
//
//
//            }
//
//        });
//    }


}
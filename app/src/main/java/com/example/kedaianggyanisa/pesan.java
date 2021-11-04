package com.example.kedaianggyanisa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class pesan extends AppCompatActivity {
    private CheckBox ayam, naspec, nasgor,teh,jeruk,kopi;
    private EditText jmlayam,jmlnaspec,jmlnasgor,jmlteh,jmljeruk,jmlkopi;
    private String menu1, menu2, menu3,menu4,menu5,menu6;
    private int hayam,hnaspec,hnasgor,hteh,hjeruk,hkopi;
    private Button pesan;
    private TextView pilihan1, pilihan2, pilihan3,pilihan4,pilihan5,pilihan6,txthargatot;
    private double hargatot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);
        ayam = findViewById(R.id.ayam);
        naspec = findViewById(R.id.naspec);
        nasgor = findViewById(R.id.nasgor);
        teh = findViewById(R.id.teh);
        jeruk = findViewById(R.id.jeruk);
        kopi = findViewById(R.id.kopi);
        //editext
        jmlayam = findViewById(R.id.jmlayam);
        jmlnaspec = findViewById(R.id.jmlnaspec);
        jmlnasgor = findViewById(R.id.jmlnasgor);
        jmlteh = findViewById(R.id.jmlteh);
        jmljeruk = findViewById(R.id.jmljeruk);
        jmlkopi = findViewById(R.id.jmlkopi);

        //TextView
        pilihan1 = findViewById(R.id.pilihan_satu);
        pilihan2 = findViewById(R.id.pilihan_dua);
        pilihan3 = findViewById(R.id.pilihan_tiga);
        pilihan4 = findViewById(R.id.pilihan_empat);
        pilihan5 = findViewById(R.id.pilihan_lima);
        pilihan6 = findViewById(R.id.pilihan_enam);
        pesan = findViewById(R.id.pesan);
        txthargatot = findViewById(R.id.txtHargatot);

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ayam.isChecked()) {
                    int finalayam = Integer.parseInt(jmlayam.getText().toString());
                    menu1 = "Ayam Geprek " + jmlayam;
                    hayam = finalayam * 20000;

                } else if (!ayam.isChecked()) {
                    menu1 = " ";
                    hayam = 0;
                }

                if (naspec.isChecked()) {
                    int finalnaspec = Integer.parseInt(jmlnaspec.getText().toString());
                    menu2 = "Nasi Pecel " + jmlnaspec;
                    hnaspec = finalnaspec * 10000;
                } else if (naspec.isChecked()) {
                    menu2 = " ";
                    hnaspec = 0;
                }
                if (nasgor.isChecked()) {
                    int finalnasgor = Integer.parseInt(jmlnasgor.getText().toString());
                    menu3 = "Ayam Goreng " + jmlnasgor;
                    hnasgor = finalnasgor * 15000;
                } else if (!nasgor.isChecked()) {
                    menu3 = " ";
                    hnasgor = 0;
                }
                if (teh.isChecked()) {
                    int finalteh = Integer.parseInt(jmlteh.getText().toString());
                    menu4 = "Es Teh " + jmlteh;
                    hteh = finalteh * 5000;
                } else if (!teh.isChecked()) {
                    menu4 = " ";
                    hteh = 0;
                }
                if (jeruk.isChecked()) {
                    int finaljeruk = Integer.parseInt(jmljeruk.getText().toString());
                    menu5 = "Es Jeruk " + jmljeruk;
                    hjeruk = finaljeruk * 6000;
                } else if (!jeruk.isChecked()) {
                    menu5 = " ";
                    hjeruk = 0;

                }
                if (kopi.isChecked()) {
                    int finalkopi = Integer.parseInt(jmlkopi.getText().toString());
                    menu6 = "Es Kopi " + jmlkopi;
                    hkopi = finalkopi * 6000;
                } else if (!kopi.isChecked()) {
                    menu6 = " ";
                    hkopi = 0;
                }

                if(!ayam.isChecked() && !naspec.isChecked() && !nasgor.isChecked() && !teh.isChecked()
                        && !jeruk.isChecked() && !kopi.isChecked()){
                    Toast.makeText(getApplicationContext(), "Tidak Ada Menu yang Dipesan", Toast.LENGTH_SHORT).show();
                }else{
                    // Menampilkan Hasil Pesanan Yang Di Input Dari User
                    pilihan1.setText(menu1);
                    pilihan2.setText(menu2);
                    pilihan3.setText(menu3);
                    pilihan4.setText(menu4);
                    pilihan5.setText(menu5);
                    pilihan6.setText(menu6);

                    hargatot = hayam+hnaspec+hnasgor+hteh+hjeruk+hkopi;
                    String hrg = String.valueOf(hargatot);

                    txthargatot.setText(hrg);
                }
            }
        });


    }

}
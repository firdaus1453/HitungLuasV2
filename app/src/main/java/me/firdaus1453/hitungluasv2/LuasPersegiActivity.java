package me.firdaus1453.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPersegiActivity extends AppCompatActivity {

    // TODO 1 Luas Persegi membuat variable global
    EditText edtSisi;
    TextView txtHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);

        // TODO 2 Menginisiasikan object widget
        edtSisi = findViewById(R.id.edtSisi);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        // TODO 3 Membuat method onClick untuk mendeteksi click dari user
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO 4 Memasukkan input editText dari user dan convert String ke Int
                Integer sisi = Integer.valueOf(edtSisi.getText().toString());

                // TODO 5 Memanggil function hitungLuasPersegi
                hitungLuasPersegi(sisi);
            }
        });
    }

    // TODO 6 Membuat method hitungLuasPersegi
    private void hitungLuasPersegi(Integer sisi) {
        // TODO 7 menghitung luas persegi
        int hasil = sisi * sisi;

        // TODO 8 Mencetak hasil
        txtHasil.setText(String.valueOf(hasil));
    }
}

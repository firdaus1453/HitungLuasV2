package me.firdaus1453.hitungluasv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    // TODO 1 Luas Persegi membuat method luasPersegi
    public void luasPersegi(View view){
        // TODO 2 Luas Persegi membuat object Intent
        Intent pindah = new Intent(MenuActivity.this, LuasPersegiActivity.class);

        // TODO 3 Menjalankan startActivity
        startActivity(pindah);
    }
}

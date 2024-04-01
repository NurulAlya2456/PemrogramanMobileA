package com.example.mybiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }


    public void telepon(View view) {
        Intent telepon = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:085656226102"));
        startActivity(telepon);
    }

    public void lokasi(View view) {
        Intent lokasi = new Intent(Intent.ACTION_VIEW);
        lokasi.setData(Uri.parse("geo:-5.132193, 119.488449"));
        startActivity(lokasi);
    }

    public void github(View view) {
        Intent github = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/NurulAlya2456"));
        startActivity(github);
    }

    public void pesan(View view) {
        String noTelp = "6285656226102";
        String text = "Halo, salam kenal!";

        Uri uri = Uri.parse("https://api.whatsapp.com/send?phone=" + noTelp + "&text=" + Uri.encode(text));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(MainActivity4.this, MainActivity.class);
        startActivity(intent);
    }
}
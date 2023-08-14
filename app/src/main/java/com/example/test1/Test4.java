package com.example.test1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Test4 extends AppCompatActivity {
    Button btnBack3;
    Button btnmore3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test4);
        setTitle("현재 기온 20~22도");
        btnBack3=findViewById(R.id.btnBack3);
        btnmore3=findViewById(R.id.btnmore3);
        btnBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bintent3=new Intent(getApplicationContext(),Test1.class);
                startActivity(Bintent3);
                getIntent();
            }
        });
        btnmore3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mintent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%B4%88%EA%B0%80%EC%9D%84+%EC%BD%94%EB%94%94&tbm=isch&ved=2ahUKEwjY7dG7lLb0AhXERd4KHewwBBAQ2-cCegQIABAA&oq=%EC%B4%88%EA%B0%80%EC%9D%84+%EC%BD%94%EB%94%94&gs_lcp=CgNpbWcQAzIECAAQGDIECAAQGDoFCAAQgARQ5QRY4BFg5RNoAXAAeACAAXqIAf4GkgEDMC44mAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=jeSgYZjzL8SL-Qbs4ZCAAQ&bih=664&biw=1536"));
                startActivity(Mintent3);

            }
        });

    }
}
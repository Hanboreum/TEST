package com.example.test1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Test9 extends AppCompatActivity {
    Button btnBack8;
    Button btnmore8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test9);
        setTitle("현재 기온: 5도 이하");
        btnBack8=findViewById(R.id.btnBack8);
        btnmore8=findViewById(R.id.btnmore8);
        btnBack8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bintent8=new Intent(getApplicationContext(),Test1.class);
                startActivity(Bintent8);
                getIntent();
            }
        });
        btnmore8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mintent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EA%B2%A8%EC%9A%B8+%EC%BD%94%EB%94%94&tbm=isch&ved=2ahUKEwinmMWWlrb0AhVKFIgKHYKwAlMQ2-cCegQIABAA&oq=%EA%B2%A8%EC%9A%B8+%EC%BD%94%EB%94%94&gs_lcp=CgNpbWcQAzILCAAQgAQQsQMQgwEyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjoICAAQgAQQsQNQ8QlYgxNg8xVoAXAAeAGAAYwBiAG7B5IBAzAuOJgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=WOagYaeMNMqooASC4YqYBQ&bih=664&biw=1536"));
                startActivity(Mintent8);
            }
        });
    }
}
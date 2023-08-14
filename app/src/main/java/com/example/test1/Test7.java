package com.example.test1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Test7 extends AppCompatActivity {
    Button btnBack6;
    Button btnmore6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test7);
        setTitle("현재 기온10~11도");
        btnBack6=findViewById(R.id.btnBack6);
        btnmore6=findViewById(R.id.btnmore6);
        btnBack6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bintent6=new Intent(getApplicationContext(),Test1.class);
                startActivity(Bintent6);
                getIntent();
            }
        });
        btnmore6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mintent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%B4%88%EA%B2%A8%EC%9A%B8+%EC%BD%94%EB%94%94&tbm=isch&ved=2ahUKEwjXh6PnlLb0AhXDQPUHHVKHBHsQ2-cCegQIABAA&oq=%EC%B4%88%EA%B2%A8%EC%9A%B8+%EC%BD%94%EB%94%94&gs_lcp=CgNpbWcQAzIFCAAQgAQyBAgAEBgyBggAEAUQHjoGCAAQBxAeOggIABCABBCxAzoICAAQBxAFEB5Q-wVYrRtgxh5oAnAAeAGAAbACiAGjCpIBBzIuNy4wLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=6eSgYZfvEcOB1e8P0o6S2Ac&bih=664&biw=1536"));
                startActivity(Mintent6);
            }
        });
    }
}
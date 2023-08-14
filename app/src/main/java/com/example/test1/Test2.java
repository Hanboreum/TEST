package com.example.test1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Test2 extends AppCompatActivity {
    Button btnBack;
    Button btnmore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);
        setTitle("현재 기온: 27도 이상");
        btnBack=findViewById(R.id.btnBack);
        btnmore=findViewById(R.id.btnmore);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bintent=new Intent(getApplicationContext(),Test1.class);
                startActivity(Bintent);
                getIntent();
            }
        });
        btnmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%97%AC%EB%A6%84+%EB%8D%B0%EC%9D%BC%EB%A6%AC%EB%A3%A9&tbm=isch&ved=2ahUKEwj57qvq27X0AhXWEIgKHZTwAEMQ2-cCegQIABAA&oq=%EC%97%AC%EB%A6%84+%EB%8D%B0%EC%9D%BC%EB%A6%AC%EB%A3%A9&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIGCAAQBxAeOgQIABAYOggIABAHEAUQHjoICAAQCBAHEB5QyQVY9wtghA5oAXAAeAGAAZQBiAHvBpIBAzEuN5gBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=KqmgYfmxN9ahoASU4YOYBA&bih=664&biw=1536"));
                startActivity(Mintent);
            }
        });


    }
}
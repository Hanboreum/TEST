package com.example.test1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Test3 extends AppCompatActivity {
    Button btnBack2;
    Button btnmore2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test3);
        setTitle("현재 기온23~26도");
        btnmore2=findViewById(R.id.btnmore2);
        btnBack2=findViewById(R.id.btnBack2);
        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bintent2=new Intent(getApplicationContext(),Test1.class);
                startActivity(Bintent2);
                getIntent();
            }
        });
        btnmore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mintent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%B4%88%EC%97%AC%EB%A6%84+%EB%8D%B0%EC%9D%BC%EB%A6%AC%EB%A3%A9&source=lnms&tbm=isch&sa=X&ved=2ahUKEwi4vMHDk7b0AhWtrlYBHbopBrkQ_AUoAXoECAEQAw&biw=1536&bih=664&dpr=1.25"));
                startActivity(Mintent2);
            }
        });

    }
}
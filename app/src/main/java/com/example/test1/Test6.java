package com.example.test1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Test6 extends AppCompatActivity {
    Button btnBack5;
    Button btnmore5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test6);
        setTitle("현재 기온 12~16도");
        btnBack5=findViewById(R.id.btnBack5);
        btnmore5=findViewById(R.id.btnmore5);
        btnBack5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bintent5=new Intent(getApplicationContext(),Test1.class);
                startActivity(Bintent5);
                getIntent();
            }
        });
        btnmore5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mintent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EA%B0%80%EC%9D%84+%EC%BD%94%EB%94%94&tbm=isch&ved=2ahUKEwiL1tW_lLb0AhUQZ94KHVwjB-cQ2-cCegQIABAA&oq=%EA%B0%80%EC%9D%84+%EC%BD%94%EB%94%94&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjoECAAQGFDrFVjrFWCzF2gAcAB4AIABdogB5wGSAQMwLjKYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=luSgYYuzDpDO-Qbcxpy4Dg&bih=664&biw=1536"));
                startActivity(Mintent5);
            }
        });
    }
}
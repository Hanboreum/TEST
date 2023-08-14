package com.example.test1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Test8 extends AppCompatActivity {
    Button btnBack7;
    Button btnmore7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test8);
        setTitle("현재 기온 6~9도");
        btnBack7=findViewById(R.id.btnBack7);
        btnmore7=findViewById(R.id.btnmore7);
        btnBack7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bintent7=new Intent(getApplicationContext(),Test1.class);
                startActivity(Bintent7);
                getIntent();
            }
        });
        btnmore7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mintent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EA%B2%A8%EC%9A%B8+%EC%BD%94%EB%94%94&tbm=isch&ved=2ahUKEwjXxejDlbb0AhVOdXAKHYM2C9YQ2-cCegQIABAA&oq=%EA%B2%A8%EC%9A%B8+%EC%BD%94%EB%94%94&gs_lcp=CgNpbWcQAzILCAAQgAQQsQMQgwEyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjoECAAQGFC7BVi7BWCWB2gAcAB4AIABggGIAfQBkgEDMC4ymAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=q-WgYZfEFs7qwQOD7aywDQ&bih=664&biw=1536"));
                startActivity(Mintent7);
            }
        });
    }
}
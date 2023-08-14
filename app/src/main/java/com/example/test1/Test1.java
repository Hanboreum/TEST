package com.example.test1;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Test1 extends AppCompatActivity {
    Button btnShow;
    Button btnWeather;
    RadioGroup rdoG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);
        setTitle("기온별 옷차림 추천");
        btnShow= findViewById(R.id.btnShow);
        rdoG= findViewById(R.id.rdoG);
        btnWeather= findViewById(R.id.btnWeather);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Test2.class);
                Intent intent2=new Intent(getApplicationContext(),Test3.class);
                Intent intent3=new Intent(getApplicationContext(),Test4.class);
                Intent intent4=new Intent(getApplicationContext(),Test5.class);
                Intent intent5=new Intent(getApplicationContext(),Test6.class);
                Intent intent6=new Intent(getApplicationContext(),Test7.class);
                Intent intent7=new Intent(getApplicationContext(),Test8.class);
                Intent intent8=new Intent(getApplicationContext(),Test9.class);

                switch (rdoG.getCheckedRadioButtonId()){
                    case R.id.Hot:
                        AlertDialog.Builder dlg=new AlertDialog.Builder(Test1.this);
                        dlg.setTitle("실내활동 권장");
                        dlg.setMessage("충분한 수분을 섭취해주세요");
                        dlg.setIcon(R.mipmap.ic_launcher);
                        dlg.show();
                        break;
                    case R.id.twentySeven:
                        startActivity(intent);
                        getIntent();
                        break;
                    case R.id.twentySix:
                        startActivity(intent2);
                        getIntent();

                        break;
                    case R.id.twentyTwo:

                        startActivity(intent3);
                        getIntent();
                        break;
                    case R.id.nineTeen:
                        //니트, 가디건,후드티, 맨투맨, 면바지");
                        startActivity(intent4);
                        getIntent();


                        break;
                    case R.id.sixTeen:
                        //자켓, 두꺼운 가디건or니트,");
                        startActivity(intent5);
                        getIntent();
                        break;
                    case R.id.eleven:
                        //"트렌치 코트,항공점퍼");
                        startActivity(intent6);
                        getIntent();
                        break;
                    case R.id.Nine:
                        //겨울 코트,발열 내의,경량 패딩");
                        startActivity(intent7);
                        getIntent();


                        break;
                    case R.id.Five:
                        //"겨울코트,패딩,목도리,기모바지,털모자
                        startActivity(intent8);
                        getIntent();
                        break;
                    case R.id.Cold:
                        System.out.println("실내활동 권장");
                        AlertDialog.Builder dlg2=new AlertDialog.Builder(Test1.this);
                        dlg2.setTitle("실내활동을 추천드려요");
                        dlg2.setMessage("핫팩 필수");
                        dlg2.setIcon(R.mipmap.ic_launcher);
                        dlg2.show();
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"기온을 먼저 선택하세요!",Toast.LENGTH_SHORT)
                                .show();

                }

            }
        });
        btnWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent Wintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.weather.go.kr/w/index.do"));
                startActivity(Wintent);



            }
        });
    }
}



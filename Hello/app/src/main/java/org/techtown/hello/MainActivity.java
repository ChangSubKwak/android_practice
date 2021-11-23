package org.techtown.hello;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v) {
        Toast.makeText(this, "확인1 버튼이 눌렸어요", Toast.LENGTH_SHORT).show();
    }

    // 인텐트란 : 안드로이드 플랫폼에게 원하는 것을 말할 떄 전달하는 우편물 같은 것
    //           '웹페이지를 띄워보고 싶어요'(인텐트) ---> '안드로이드 단말'
    public void onButton2Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);
    }

    public void onButton3Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:119"));
        startActivity(myIntent);
    }
}
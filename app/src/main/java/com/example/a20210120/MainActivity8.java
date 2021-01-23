package com.example.a20210120;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {

    private ImageView img_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 메인 함수라고 생각하면 된다.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);


        img_view = (ImageView) findViewById(R.id.img_view);
//        (ImageView) 굳이 사용 안 해도 된다.
    }
    public void btnClick(View view){
        Log.v("myValue","버튼을 눌렀습니다");
        Toast.makeText(this, "버튼 누름", Toast.LENGTH_SHORT).show();
//      Toast는 매개변수가 3개 들어간다.                  // LENGTH_SHORT : 시간단위
        img_view.setImageResource(R.drawable.dice2); // 원하는 이미지 넣는 코드
    }
}
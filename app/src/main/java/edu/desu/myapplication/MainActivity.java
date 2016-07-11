package edu.desu.myapplication;

import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void eatCookie(View view) {
        ImageView justin = (ImageView)findViewById(R.id.android_cookie_image_view);
        TextView zihao = (TextView) findViewById(R.id.status_text_view);
        justin.setImageResource(R.drawable.after_cookie);
        zihao.setText("IM FULL");


    }

    public void reset(View view) {
        ImageView justin = (ImageView)findViewById(R.id.android_cookie_image_view);
        TextView zihao = (TextView) findViewById(R.id.status_text_view);
        justin.setImageResource(R.drawable.before_cookie);
        zihao.setText("I'm so hungry");


    }

}

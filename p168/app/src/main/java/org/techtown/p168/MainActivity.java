package org.techtown.p168;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView;
    ScrollView scrollView2;
    ImageView imageview;
    ImageView imageview2;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scrollview);
        scrollView2 = findViewById(R.id.scrollview2);
        imageview = findViewById(R.id.imageView4);
        imageview2 = findViewById(R.id.imageView5);

        scrollView.setHorizontalScrollBarEnabled(true);
        scrollView.setVerticalScrollBarEnabled(true);

        scrollView2.setHorizontalScrollBarEnabled(true);
        scrollView2.setVerticalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.noname02);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageview.setImageDrawable(bitmap);
        imageview.getLayoutParams().width = bitmapWidth;
        imageview.getLayoutParams().height = bitmapHeight;
    }

    public void onDown(View v){

        imageview.setVisibility(View.INVISIBLE);
        imageview2.setVisibility(View.VISIBLE);

        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageview2.setImageDrawable(bitmap);
        imageview2.getLayoutParams().width = bitmapWidth;
        imageview2.getLayoutParams().height = bitmapHeight;
    }

    public void onUp(View v){

        imageview.setVisibility(View.VISIBLE);
        imageview2.setVisibility(View.INVISIBLE);

        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageview.setImageDrawable(bitmap);
        imageview.getLayoutParams().width = bitmapWidth;
        imageview.getLayoutParams().height = bitmapHeight;
    }
}
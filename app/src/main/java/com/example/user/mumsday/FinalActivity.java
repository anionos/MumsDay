package com.example.user.mumsday;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    public static final String EXTRA_KEY_1 = "EXTRA_KEY_1";
    public static final String EXTRA_KEY_2 = "EXTRA_KEY_2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);


        //todo: 1 Get the name and image paassed in to this activity
        String itemName = getIntent().getStringExtra("EXTRA_KEY_1");
        int itemImage= getIntent().getIntExtra("EXTRA_KEY_2", 0);
        //todo: 2.. display the name in the textviewj
        TextView itemNameTv = findViewById(R.id.textView7);
        itemNameTv.setText(itemName);
        //todo 3. display the image in the textview
        ImageView itemImageView = findViewById(R.id.imageView5);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), itemImage);
        itemImageView.setImageBitmap(bmp);
    }

    public static Intent createIntent(Context context, String value1, String value2)
    {
        Intent intent = new Intent(context,FinalActivity .class);
        intent.putExtra(EXTRA_KEY_1,value1);
        intent.putExtra(EXTRA_KEY_2,value2);
        return intent;
    }
}

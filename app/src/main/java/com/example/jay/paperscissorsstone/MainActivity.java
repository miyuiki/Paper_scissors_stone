package com.example.jay.paperscissorsstone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int[] imgId = {R.drawable.paper,R.drawable.scissors,R.drawable.stone};
    private ImageButton pap,sci,sto;
    private ImageView imgPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pap = (ImageButton)findViewById(R.id.imageButton);
        sci = (ImageButton)findViewById(R.id.imageButton2);
        sto = (ImageButton)findViewById(R.id.imageButton3);
        imgPhoto = (ImageView) findViewById(R.id.imageView);
    }
}

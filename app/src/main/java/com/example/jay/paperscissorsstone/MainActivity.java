package com.example.jay.paperscissorsstone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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

        pap.setOnClickListener(paperListener);
        sci.setOnClickListener(scissorsListener);
        sto.setOnClickListener(stoneListener);

    }
    private ImageButton.OnClickListener paperListener = new ImageButton.OnClickListener(){
        @Override
        public void onClick(View v){
            shuffleArray(imgId);
            imgPhoto.setImageResource(imgId[0]);
        }
    };
    private ImageButton.OnClickListener scissorsListener = new ImageButton.OnClickListener(){
        @Override
        public void onClick(View v){
            shuffleArray(imgId);
            imgPhoto.setImageResource(imgId[0]);
        }
    };
    private ImageButton.OnClickListener stoneListener = new ImageButton.OnClickListener(){
        @Override
        public void onClick(View v){
            shuffleArray(imgId);
            imgPhoto.setImageResource(imgId[0]);
        }
    };
    public static int[] shuffleArray(int[] array)
    {
        Random rnd = new Random();
        for (int i = 0;i < array.length; i++)
        {
            int randomPosition = rnd.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }
        return array;
    }
}

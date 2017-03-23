package com.example.jay.paperscissorsstone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int[] imgId = {R.drawable.paper,R.drawable.scissors,R.drawable.stone};

    private ImageButton pap,sci,sto;
    private ImageView imgPhoto;
    private TextView txtShow ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pap = (ImageButton)findViewById(R.id.imageButton);
        sci = (ImageButton)findViewById(R.id.imageButton2);
        sto = (ImageButton)findViewById(R.id.imageButton3);
        imgPhoto = (ImageView) findViewById(R.id.imageView);
        txtShow = (TextView) findViewById(R.id.textView);

        pap.setOnClickListener(paperListener);
        sci.setOnClickListener(scissorsListener);
        sto.setOnClickListener(stoneListener);

    }
    private ImageButton.OnClickListener paperListener = new ImageButton.OnClickListener(){
        @Override
        public void onClick(View v){
            shuffleArray(imgId);
            imgPhoto.setImageResource(imgId[0]);
            if (imgId[0] == R.drawable.paper)
                txtShow.setText("平手");
            else if(imgId[0] == R.drawable.stone)
                txtShow.setText("勝利");
            else
                txtShow.setText("敗北");
        }
    };
    private ImageButton.OnClickListener scissorsListener = new ImageButton.OnClickListener(){
        @Override
        public void onClick(View v){
            shuffleArray(imgId);
            imgPhoto.setImageResource(imgId[0]);
            if (imgId[0] == R.drawable.scissors)
                txtShow.setText("平手");
            else if(imgId[0] == R.drawable.paper)
                txtShow.setText("勝利");
            else
                txtShow.setText("敗北");
        }
    };
    private ImageButton.OnClickListener stoneListener = new ImageButton.OnClickListener(){
        @Override
        public void onClick(View v){
            shuffleArray(imgId);
            imgPhoto.setImageResource(imgId[0]);
            if (imgId[0] == R.drawable.stone)
                txtShow.setText("平手");
            else if(imgId[0] == R.drawable.scissors)
                txtShow.setText("勝利");
            else
                txtShow.setText("敗北");
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

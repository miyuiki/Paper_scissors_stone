package com.example.jay.paperscissorsstone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int[] imgId = {R.drawable.paper,R.drawable.scissors,R.drawable.stone};
    int win = 0;
    int lose = 0;
    int tie = 0;
    int cnt = 1;

    private ImageButton pap,sci,sto;
    private ImageView imgPhoto;
    private TextView txtShow ;
    private Button reset;
    private TextView game;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pap = (ImageButton)findViewById(R.id.imageButton);
        sci = (ImageButton)findViewById(R.id.imageButton2);
        sto = (ImageButton)findViewById(R.id.imageButton3);
        imgPhoto = (ImageView) findViewById(R.id.imageView);
        txtShow = (TextView) findViewById(R.id.textView);
        game = (TextView) findViewById(R.id.textView2);
        result = (TextView) findViewById(R.id.textView3);
        reset = (Button) findViewById(R.id.button);

        pap.setOnClickListener(paperListener);
        sci.setOnClickListener(scissorsListener);
        sto.setOnClickListener(stoneListener);
        reset.setOnClickListener(resetListener);

    }
    private ImageButton.OnClickListener paperListener = new ImageButton.OnClickListener(){
        @Override
        public void onClick(View v){
            shuffleArray(imgId);
            imgPhoto.setImageResource(imgId[0]);
            if (imgId[0] == R.drawable.paper){
                txtShow.setText("平手");
                tie++;
            }
            else if(imgId[0] == R.drawable.stone){
                txtShow.setText("勝利");
                win++;
            }
            else{
                txtShow.setText("敗北");
                lose++;
            }
            cnt++;
            game.setText("第"+cnt+"回合");
            result.setText(win+"勝"+lose+"敗"+tie+"和");
        }
    };
    private ImageButton.OnClickListener scissorsListener = new ImageButton.OnClickListener(){
        @Override
        public void onClick(View v){
            shuffleArray(imgId);
            imgPhoto.setImageResource(imgId[0]);
            if (imgId[0] == R.drawable.scissors){
                txtShow.setText("平手");
                tie++;
            }
            else if(imgId[0] == R.drawable.paper){
                txtShow.setText("勝利");
                win++;
            }
            else{
                txtShow.setText("敗北");
                lose++;
            }
            cnt++;
            game.setText("第"+cnt+"回合");
            result.setText(win+"勝"+lose+"敗"+tie+"和");
        }
    };
    private ImageButton.OnClickListener stoneListener = new ImageButton.OnClickListener(){
        @Override
        public void onClick(View v){
            shuffleArray(imgId);
            imgPhoto.setImageResource(imgId[0]);
            if (imgId[0] == R.drawable.stone){
                txtShow.setText("平手");
                tie++;
            }
            else if(imgId[0] == R.drawable.scissors){
                txtShow.setText("勝利");
                win++;
            }
            else{
                txtShow.setText("敗北");
                lose++;
            }
            cnt++;
            game.setText("第"+cnt+"回合");
            result.setText(win+"勝"+lose+"敗"+tie+"和");
        }
    };
    private Button.OnClickListener resetListener = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            win = 0;
            lose = 0;
            tie = 0;
            cnt = 1;
            game.setText("第1回合");
            result.setText("0勝0敗0和");
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

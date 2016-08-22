package com.example.ishan.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int activeplayer=0;
    int[] gamestate={2,2,2,2,2,2,2,2,2}; //2 for unplayed state
    int[][] winpos={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

    public void dropIn(View view){

        ImageView counter=(ImageView)view;
        int tappedcounter=Integer.parseInt(counter.getTag().toString());
        if (gamestate[tappedcounter]==2) {
            gamestate[tappedcounter]=activeplayer;

        }
        counter.setTranslationY(-1000f);
        if(activeplayer==0) {

            counter.setImageResource(R.drawable.yellow_chip);
            activeplayer = 1;
        }
        else{
            counter.setImageResource(R.drawable.redchip);
            activeplayer = 0;


        }
        counter.animate().translationYBy(1000f).setDuration(300);
        for (int[] winpos: winpos){
            if (gamestate[winpos[0]]==gamestate[winpos[1]] && gamestate[winpos[1]]==gamestate[winpos[2]]&&gamestate[winpos[0]]!=2) {

            }
        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

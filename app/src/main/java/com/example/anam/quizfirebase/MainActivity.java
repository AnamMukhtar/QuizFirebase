package com.example.anam.quizfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private quiz objquiz =new quiz();

    private TextView textscore;
    private TextView textqust;
    private Button btnopt1;
    private Button btnopt2;
    private Button btnopt3;
    private Button btnopt4;

    private String ans;
    private  int score =0;
    private  int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textscore=(TextView)findViewById(R.id.scoure_text);
        textqust=(TextView)findViewById(R.id.qust);
        btnopt1=(Button) findViewById(R.id.opt1);
        btnopt2=(Button) findViewById(R.id.opt2);
        btnopt3=(Button) findViewById(R.id.opt3);
        btnopt4=(Button) findViewById(R.id.opt4);
        newqst();

        btnopt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnopt1.getText() == ans){
                    score= score+1;
                    newScore(score);
                    newqst();
                    Toast.makeText(MainActivity.this,"Right Selection",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Wrong Selection",Toast.LENGTH_SHORT).show();
                    newqst();
                }
            }
        });




        btnopt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnopt2.getText() == ans){
                    score= score+1;
                    newScore(score);
                    newqst();
                    Toast.makeText(MainActivity.this,"Right Selection",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Wrong Selection",Toast.LENGTH_SHORT).show();
                    newqst();
                }
            }
        });



        btnopt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnopt3.getText() == ans){
                    score= score+1;
                    newScore(score);
                    newqst();
                    Toast.makeText(MainActivity.this,"Right Selection",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Wrong Selection",Toast.LENGTH_SHORT).show();
                    newqst();
                }
            }
        });




        btnopt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnopt4.getText() == ans){
                    score= score+1;
                    newScore(score);
                    newqst();
                    Toast.makeText(MainActivity.this,"Right Selection",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Wrong Selection",Toast.LENGTH_SHORT).show();
                    newqst();
                }
            }
        });
    }

    private void newqst(){
        textqust.setText(objquiz.getquiz(index));
        btnopt1.setText(objquiz.getopt1(index));
        btnopt2.setText(objquiz.getopt2(index));
        btnopt3.setText(objquiz.getopt3(index));
        btnopt4.setText(objquiz.getopt4(index));


        ans = objquiz.getcorrectans(index);
        index++;
    }


    private void newScore(int point) {
        textscore.setText("" + score);
    }

}

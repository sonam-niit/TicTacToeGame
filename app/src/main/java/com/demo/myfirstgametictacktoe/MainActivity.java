package com.demo.myfirstgametictacktoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,reset;
    int turn;
    int draw;
    boolean end=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1= (Button) findViewById(R.id.btn1);
        button2= (Button) findViewById(R.id.btn2);
        button3= (Button) findViewById(R.id.btn3);
        button4= (Button) findViewById(R.id.btn4);
        button5= (Button) findViewById(R.id.btn5);
        button6= (Button) findViewById(R.id.btn6);
        button7= (Button) findViewById(R.id.btn7);
        button8= (Button) findViewById(R.id.btn8);
        button9= (Button) findViewById(R.id.btn9);
        reset= (Button) findViewById(R.id.reset);
        turn=1;
        draw=1;
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        button1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button1.setText("0");
                    }
                }
                endGame();
                draw++;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        button2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button2.setText("0");
                    }
                }
                endGame();
                draw++;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        button3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button3.setText("0");
                    }
                }
                endGame();
                draw++;
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        button4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button4.setText("0");
                    }
                }
                endGame();
                draw++;
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        button5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button5.setText("0");
                    }
                }
                endGame();
                draw++;
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        button6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button6.setText("0");
                    }
                }
                endGame();
                draw++;
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        button7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button7.setText("0");
                    }
                }
                endGame();
                draw++;
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        button8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button8.setText("0");
                    }
                }
                endGame();
                draw++;
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        button9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        button9.setText("0");
                    }
                }
                endGame();
                draw++;
            }
        });
    }
    public void endGame(){
        String a= button1.getText().toString();
        String b= button2.getText().toString();
        String c= button3.getText().toString();
        String d= button4.getText().toString();
        String e= button5.getText().toString();
        String f= button6.getText().toString();
        String g= button7.getText().toString();
        String h= button8.getText().toString();
        String i= button9.getText().toString();

        if((a.equals("X") && b.equals("X")&& c.equals("X")) ||
                (a.equals("X") && d.equals("X")&& g.equals("X"))||
                (a.equals("X") && e.equals("X")&& i.equals("X"))||
                (b.equals("X") && e.equals("X")&& h.equals("X"))||
                (c.equals("X") && f.equals("X")&& i.equals("X"))||
                (d.equals("X") && e.equals("X")&& f.equals("X"))||
                (g.equals("X") && h.equals("X")&& i.equals("X"))||
                (g.equals("X") && e.equals("X")&& c.equals("X"))
        ){
//            button1.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.red));
//            button2.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.red));
//            button3.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.red));
            Toast.makeText(this, "Winner Player X", Toast.LENGTH_SHORT).show();
            end = true;
        }
        if((a.equals("0") && b.equals("0")&& c.equals("0")) ||
                (a.equals("0") && d.equals("0")&& g.equals("0"))||
                (a.equals("0") && e.equals("0")&& i.equals("0"))||
                (b.equals("0") && e.equals("0")&& h.equals("0"))||
                (c.equals("0") && f.equals("0")&& i.equals("0"))||
                (d.equals("0") && e.equals("0")&& f.equals("0"))||
                (g.equals("0") && h.equals("0")&& i.equals("0"))||
                (g.equals("0") && e.equals("0")&& c.equals("0"))
        ){
//            button1.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.red));
//            button2.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.red));
//            button3.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.red));
            Toast.makeText(this, "Winner Player 0", Toast.LENGTH_SHORT).show();
            end = true;
        }
        if(end){
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
        if(draw == 9 && !end){
            Toast.makeText(this, "Draw Game!", Toast.LENGTH_SHORT).show();
        }
    }



}
package com.square.trivia2;

import android.opengl.Visibility;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Item it;
    TextView t;Button toggle;Button bButton;Button cButton;Button dButton;Button eButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        it=new Item();
    	String answer="";
        answer=it.getAnswer();
        if(answer.length()>1)answer=it.getAnswer().substring(0,1);
        t= (TextView) findViewById(R.id.textview);
        t.setText(it.getQuestion());
       
         toggle = (Button) findViewById(R.id.button);
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer("a");
            }
        });
         bButton = (Button) findViewById(R.id.button2);
        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              checkAnswer("b");
            }
        });
        
         cButton = (Button) findViewById(R.id.button3);
        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer("c");
            }
        });
        
        
         dButton = (Button) findViewById(R.id.button4);
        dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               checkAnswer("d");
            }
        });
        
        
        
         eButton = (Button) findViewById(R.id.button5);
        eButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer("e");
            }
        });cButton.setVisibility(0);dButton.setVisibility(0);eButton.setVisibility(0);
        if(Integer.valueOf(it.getBtnNb())==2){cButton.setVisibility(4);dButton.setVisibility(4);eButton.setVisibility(4);}
        else if(Integer.valueOf(it.getBtnNb())==3){dButton.setVisibility(4); eButton.setVisibility(4);}
        else if(Integer.valueOf(it.getBtnNb())==4){eButton.setVisibility(4);}

    }

    private void checkAnswer(String a) {
        String answer="";
        answer=it.getAnswer();
        if(answer.length()>1)answer=it.getAnswer().substring(0,1);
        if(answer.equals(a)){it=new Item();
        t.setText(it.getQuestion());cButton.setVisibility(0);dButton.setVisibility(0);eButton.setVisibility(0);
        if(Integer.valueOf(it.getBtnNb())==2){cButton.setVisibility(4);dButton.setVisibility(4);eButton.setVisibility(4);}
        else if(Integer.valueOf(it.getBtnNb())==3){dButton.setVisibility(4); eButton.setVisibility(4);}
        else if(Integer.valueOf(it.getBtnNb())==4){eButton.setVisibility(4);}}
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

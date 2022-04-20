package com.example.flames20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.*;
import java.io.*;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button2);

        //  button.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //  public void onClick(View view) {

        //    }
        //  });
    }
    public void flames(View view){
        String p,q,r,x,y,z;
        DataInputStream d=new DataInputStream(System.in);
        //System.out.println("\n your name = ");
        //a=editText.getText().toString();
        //System.out.print("\n your comrade's name = \n");
        // b=editText.getText().toString();
        EditText a= (EditText) findViewById(R.id.fetch);
        EditText b= (EditText) findViewById(R.id.fetch2);
        TextView textView = (TextView) findViewById(R.id.textView);
        int i=a.length();
        int o=b.length();
        int t=i-o;
        p=("*****Friends*****\n <<...........THE FOUNDATION OF ANY RELATIONSHIP IS FRIENDSHIP ...........>>\n<<..a.........EVERYTHING IS BASED ON THIS ONE TERM CALLED FRIENDSHIP..........>>");
        q=("*****Lovers *****\n <<............YOU DON'T FALL IN LOVE .....YOU RISE IN LOVE............>>");
        r=("*****Antipodals*****\n<<...........TOM AND JERRY COUPLE..........>>\n<<........... OPPOSITE POLES ATTRACTS MORE..........>>");
        x=("*****Marry each other*****\n<<............ MADE FOR EACH OTHER .............>>\n<<............HEAVEN'S BROUGHT YOU TOGETHER...........>> ");
        y=("*****Endearment******\n<<............IT LASTS UNTIL YOUR LAST BREATH...........>>");
        z=("*****Soulmates*****\n<<............CONSISTS ONLY ONE SOUL...........>>");
        //T IS IN - VALUES ...................
        if(t<1) // FIRST CONTROL STARTS
        {
            t=o-i;
            if(t==0)
                textView.setText("\n you are born into"+z);
            else if(t==1) //NESTED IF
                textView.setText("\n you are born into" +p);
            else if(t==2)
                textView.setText("\n you are born to" +x);
            else if(t==3)
                textView.setText("\n you are born into"+q);
            else if(t==4)
                textView.setText("\n you are born into" +p);
            else if(t==5)
                textView.setText("\n you are" +r);
            else if(t==6)
                textView.setText("\n you are born to" +x);
            else if(t==7)
                textView.setText("\n you are" +r);
            else if(t==8)
                textView.setText("\n you are born into" +q);
            else if(t==9)
                textView.setText("\n you are born as" +z);
            else if(t==10)
                textView.setText("\n you are in" +y);
            else
                textView.setText("\n name too long ");
        }
        // T IS IN + VALUES ....................
        else //ELSE STARTS
        {
            if(t==1) //NESTED IFS
                textView.setText("\n you are born into" +p);
            else if(t==2)
                textView.setText("\n you are born to" +x);
            else if(t==3)
                textView.setText("\n you are born into"+q);
            else if(t==4)
                textView.setText("\n you are born into" +p);
            else if(t==5)
                textView.setText("\n you are" +r);
            else if(t==6)
                textView.setText("\n you are born to" +x);
            else if(t==7)
                textView.setText("\n you are" +r);
            else if(t==8)
                textView.setText("\n you are born into" +q);
            else if(t==9)
                textView.setText("\n you are born as" +z);
            else if(t==10)
                textView.setText("\n you are in" +y);
            else
                textView.setText("\n  NOTE : enter appropriate name.large type of string is not supported");
        }

    }

}
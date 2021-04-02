package com.example.funulate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button  btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btneql,btnsum,btnsub,btnmul,btnstop,log,pwr,del,clear,btndiv;
    TextView av;
    EditText qv;
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                openActivity2();
            }

        });


    btn0=findViewById(R.id.btn0);
    btn0.setOnClickListener(this);

        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3=findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        btn4=findViewById(R.id.btn4);
        btn4.setOnClickListener(this);

        btn5=findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

        btn6=findViewById(R.id.btn6);
        btn6.setOnClickListener(this);

        btn7=findViewById(R.id.btn7);
        btn7.setOnClickListener(this);

        btn8=findViewById(R.id.btn8);
        btn8.setOnClickListener(this);

        btn9=findViewById(R.id.btn9);
        btn9.setOnClickListener(this);

        btn0=findViewById(R.id.btn0);
        btn0.setOnClickListener(this);

        btneql=findViewById(R.id.btneql);
        btneql.setOnClickListener(this);

        btnstop=findViewById(R.id.btnstop);
        btnstop.setOnClickListener(this);

        btnsum=findViewById(R.id.btnsum);
        btnsum.setOnClickListener(this);

        btnsub=findViewById(R.id.btnsub);
        btnsub.setOnClickListener(this);

        btnmul=findViewById(R.id.btnmul);
        btnmul.setOnClickListener(this);

        btndiv=findViewById(R.id.btndiv);
        btndiv.setOnClickListener(this);

        pwr=findViewById(R.id.pwr);
        pwr.setOnClickListener(this);

        log=findViewById(R.id.log);
        log.setOnClickListener(this);

        clear=findViewById(R.id.clear);
        clear.setOnClickListener(this);

        del=findViewById(R.id.del);
        del.setOnClickListener(this);

        av=findViewById(R.id.av);
        av.setOnClickListener(this);

        qv=findViewById(R.id.qv);
        qv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.btn0:
                qv.append("0");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.btn1:
                qv.append("1");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.btn2:
                qv.append("2");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.btn3:
                qv.append("3");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.btn4:
                qv.append("4");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.btn5:
                qv.append("5");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.btn6:
                qv.append("6");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.btn7:
                qv.append("7");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.btn8:
                qv.append("8");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.btn9:
                qv.append("9");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.btnsum:
                qv.append("+");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;

            case R.id.btnsub:
                qv.append("-");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.btnmul:
                qv.append("*");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.btndiv:
                qv.append("/");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.btnstop:
                qv.append(".");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                e.printStackTrace();
                }
                break;
            case R.id.pwr:
                qv.append("^");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;

            case R.id.log:
                qv.append("Ln");
                try{
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.del:
                try{
                    String text=qv.getText().toString();
                    if(text.length()>0)
                    {
                        text=text.substring(0,text.length()-1);
                                qv.setText(text);
                    }
                    OperationCalculation();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                break;
            case R.id.clear:
                qv.setText("");
                av.setText("");
                break;
            case R.id.btneql:

                break;

        }


    }


    public void OperationCalculation()
    {
        double ans=0,num,preans=0;
        String Value="";
        int ascii,length;
        char op=' ',ch=' ';
        String str=qv.getText().toString();
        length=str.length();
        for(int i=0;i<length;i++)
        {
            ch= str.charAt(i);
            ascii=(int)ch;
            if(ascii>=48 && ascii<=57 || ascii==46 )
            {

                Value=Value+ch;
                Value=Value.trim();
                ans=preans;

            }
            if(ch=='+' || ch=='-' ||ch=='*' ||ch=='/' ||ch=='^' ||ch=='L' )
            {
                op=ch;
                Value="";
                preans=ans;
            }
            if(op==' ')
            {
                if(!Value.isEmpty())
                {
                    num=Double.parseDouble(Value);
                    ans=num;
                    av.setText(""+ans);
                }
            }
            if(op=='+')
            {
                if(!Value.isEmpty())
                {
                    num=Double.parseDouble(Value);
                    ans=ans+num;
                    av.setText(""+ans);
                }
            }

            if(op=='/')
            {
                if(!Value.isEmpty())
                {
                    num=Double.parseDouble(Value);
                    ans=ans/num;
                    av.setText(""+ans);
                }
            }

            if(op=='-')
            {
                if(!Value.isEmpty())
                {
                    num=Double.parseDouble(Value);
                    ans=ans-num;
                    av.setText(""+ans);
                }
            }

            if(op=='*')
            {
                if(!Value.isEmpty())
                {
                    num=Double.parseDouble(Value);
                    ans=ans*num;
                    av.setText(""+ans);
                }
            }

            if(op=='^')
            {
                if(!Value.isEmpty())
                {
                    num=Double.parseDouble(Value);
                    double tempvalue=ans;
                    for(int j=1;j<num;j++)
                    {
                        ans=ans*tempvalue;
                    }
                    av.setText(""+ans);
                }
            }
            if(op=='L')
            {
                if(!Value.isEmpty())
                {
                    num=Double.parseDouble(Value);
                    ans=Math.log(num);
                    av.setText(""+ans);
                }
            }

        }


    }
    public void openActivity2()
    {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }



}
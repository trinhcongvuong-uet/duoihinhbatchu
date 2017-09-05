package com.t3h.DuoiHinhBatChu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MyActivity extends Activity implements View.OnClickListener{
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16;
    private Button btnkq1,btnkq2,btnkq3,btnkq4,btnkq5,btnkq6,btnkq7,btnkq8,btnkq9;
    private TextView tvNext,tvAgain;
    private TextView tvheart,tvscore;
    private ImageView ivImage;
    private String result = "";
    private int Score = 0,count = 0,heart = 5,size;
    private Random rd  = new Random();
    private ArrayList<String> ABC = new ArrayList<String>();
    private ArrayList<Integer> arrayImages = new ArrayList<Integer>();
    private ArrayList<String> arrayResult = new ArrayList<String>();
    private int[] replay = new int[9];
    private String myString;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initViews();
        initArrayResult();
        initImage();
        startGame();
    }


    private void initViews() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        btn10 = (Button) findViewById(R.id.btn10);
        btn10.setOnClickListener(this);
        btn11 = (Button) findViewById(R.id.btn11);
        btn11.setOnClickListener(this);
        btn12 = (Button) findViewById(R.id.btn12);
        btn12.setOnClickListener(this);
        btn13 = (Button) findViewById(R.id.btn13);
        btn13.setOnClickListener(this);
        btn14 = (Button) findViewById(R.id.btn14);
        btn14.setOnClickListener(this);
        btn15 = (Button) findViewById(R.id.btn15);
        btn15.setOnClickListener(this);
        btn16 = (Button) findViewById(R.id.btn16);
        btn16.setOnClickListener(this);

        btnkq1 = (Button) findViewById(R.id.btnkq1);
        btnkq2 = (Button) findViewById(R.id.btnkq2);
        btnkq3 = (Button) findViewById(R.id.btnkq3);
        btnkq4 = (Button) findViewById(R.id.btnkq4);
        btnkq5 = (Button) findViewById(R.id.btnkq5);
        btnkq6 = (Button) findViewById(R.id.btnkq6);
        btnkq7 = (Button) findViewById(R.id.btnkq7);
        btnkq8 = (Button) findViewById(R.id.btnkq8);
        btnkq9 = (Button) findViewById(R.id.btnkq9);

        btnkq1.setOnClickListener(this);
        btnkq2.setOnClickListener(this);
        btnkq3.setOnClickListener(this);
        btnkq4.setOnClickListener(this);
        btnkq5.setOnClickListener(this);
        btnkq6.setOnClickListener(this);
        btnkq7.setOnClickListener(this);
        btnkq8.setOnClickListener(this);
        btnkq9.setOnClickListener(this);

        tvNext = (TextView) findViewById(R.id.tvnext);
        tvNext.setOnClickListener(this);
        tvNext.setVisibility(View.INVISIBLE);

        tvAgain = (TextView) findViewById(R.id.tvAgain);
        tvAgain.setOnClickListener(this);
        tvAgain.setVisibility(View.INVISIBLE);

        ivImage = (ImageView) findViewById(R.id.iv_image);

        tvheart = (TextView) findViewById(R.id.tvheart);

        tvscore = (TextView) findViewById(R.id.tvscore);
    }

    public void initArrayResult(){
        arrayResult.add("aomua");
        arrayResult.add("baocao");
        arrayResult.add("canthiep");
        arrayResult.add("cattuong");
        arrayResult.add("chieutre");
        arrayResult.add("danhlua");
        arrayResult.add("danong");
        arrayResult.add("giapdiep");
        arrayResult.add("giangmai");
        arrayResult.add("songsong");
        arrayResult.add("hongtam");
        arrayResult.add("khoailang");
        arrayResult.add("lancan");
        arrayResult.add("masat");
        arrayResult.add("nambancau");
        arrayResult.add("oto");
        arrayResult.add("quyhang");
        arrayResult.add("thattinh");
        arrayResult.add("thothe");
        arrayResult.add("tichphan");
        arrayResult.add("tohoai");
        arrayResult.add("totien");
        arrayResult.add("tranhthu");
        arrayResult.add("xakep");
        arrayResult.add("xaphong");
        arrayResult.add("xedapdien");
        arrayResult.add("hoidong");

        ABC.add("A");
        ABC.add("B");
        ABC.add("C");
        ABC.add("D");
        ABC.add("E");
        ABC.add("F");
        ABC.add("G");
        ABC.add("H");
        ABC.add("I");
        ABC.add("K");
        ABC.add("L");
        ABC.add("M");
        ABC.add("N");
        ABC.add("O");
        ABC.add("P");
        ABC.add("Q");
        ABC.add("R");
        ABC.add("S");
        ABC.add("T");
        ABC.add("U");
        ABC.add("V");
        ABC.add("X");
        ABC.add("Y");

    }

    public void setChoose(){
        String[] temp = new String[16];
        for(int i= 0;i<16;i++){
            temp[i] = "";
        }

        int j=0;
        while(j<result.length()){
            int r = rd.nextInt(16);
                if(temp[r].equals("")){
                    temp[r] = (result.charAt(j) +"").toUpperCase();
                    j++;
            }
        }

        for(int i=0;i<16;i++){
            if(temp[i].equals("")){
                temp[i] = ABC.get(rd.nextInt(23));
            }
        }

        btn1.setText(temp[0]);
        btn2.setText(temp[1]);
        btn3.setText(temp[2]);
        btn4.setText(temp[3]);
        btn5.setText(temp[4]);
        btn6.setText(temp[5]);
        btn7.setText(temp[6]);
        btn8.setText(temp[7]);
        btn9.setText(temp[8]);
        btn10.setText(temp[9]);
        btn11.setText(temp[10]);
        btn12.setText(temp[11]);
        btn13.setText(temp[12]);
        btn14.setText(temp[13]);
        btn15.setText(temp[14]);
        btn16.setText(temp[15]);
    }

    public void chooseButton(Button button,String myString,int i){
        switch (count){
            case 1:
                btnkq1.setText(button.getText().toString());
                replay[0] = i;
                break;
            case 2:
                btnkq2.setText(button.getText().toString());
                replay[1] = i;
                break;
            case 3:
                btnkq3.setText(button.getText().toString());
                replay[2] = i;
                break;
            case 4:
                btnkq4.setText(button.getText().toString());
                replay[3] = i;
                break;
            case 5:
                btnkq5.setText(button.getText().toString());
                replay[4] = i;
                break;
            case 6:
                btnkq6.setText(button.getText().toString());
                replay[5] = i;
                break;
            case 7:
                btnkq7.setText(button.getText().toString());
                replay[6] = i;
                break;
            case 8:
                btnkq8.setText(button.getText().toString());
                replay[7] = i;
                break;
            case 9:
                btnkq9.setText(button.getText().toString());
                replay[8] = i;
                break;
        }

        if(count==result.length()){

            myString = test();

            if(myString.equals(result.toUpperCase())){
                setBackgroundRecource(R.drawable.wincolor);
                Score+=1;
                tvNext.setVisibility(View.VISIBLE);
                return;
            }
            else{
                setBackgroundRecource(R.drawable.losecolor);
                heart--;
                tvheart.setText(heart+"");
                tvNext.setVisibility(View.INVISIBLE);
                tvAgain.setVisibility(View.VISIBLE);
                setVisible(View.INVISIBLE);
                return;
            }
        }
    }

    public String test(){
        switch (count){
            case 1:
                myString += btnkq1.getText();
                break;
            case 2:
                myString += btnkq1.getText();
                myString += btnkq2.getText();
                break;
            case 3:
                myString += btnkq1.getText();
                myString += btnkq2.getText();
                myString += btnkq3.getText();
                break;
            case 4:
                myString += btnkq1.getText();
                myString += btnkq2.getText();
                myString += btnkq3.getText();
                myString += btnkq4.getText();
                break;
            case 5:
                myString += btnkq1.getText();
                myString += btnkq2.getText();
                myString += btnkq3.getText();
                myString += btnkq4.getText();
                myString += btnkq5.getText();
                break;
            case 6:
                myString += btnkq1.getText();
                myString += btnkq2.getText();
                myString += btnkq3.getText();
                myString += btnkq4.getText();
                myString += btnkq5.getText();
                myString += btnkq6.getText();
                break;
            case 7:
                myString += btnkq1.getText();
                myString += btnkq2.getText();
                myString += btnkq3.getText();
                myString += btnkq4.getText();
                myString += btnkq5.getText();
                myString += btnkq6.getText();
                myString += btnkq7.getText();
                break;
            case 8:
                myString += btnkq1.getText();
                myString += btnkq2.getText();
                myString += btnkq3.getText();
                myString += btnkq4.getText();
                myString += btnkq5.getText();
                myString += btnkq6.getText();
                myString += btnkq7.getText();
                myString += btnkq8.getText();
                break;
            case 9:
                myString += btnkq1.getText();
                myString += btnkq2.getText();
                myString += btnkq3.getText();
                myString += btnkq4.getText();
                myString += btnkq5.getText();
                myString += btnkq6.getText();
                myString += btnkq7.getText();
                myString += btnkq8.getText();
                myString += btnkq9.getText();
                break;
        }
        return  myString;
    }

    public void setBackgroundRecource(int id){
        btnkq1.setBackgroundResource(id);
        btnkq2.setBackgroundResource(id);
        btnkq3.setBackgroundResource(id);
        btnkq4.setBackgroundResource(id);
        btnkq5.setBackgroundResource(id);
        btnkq6.setBackgroundResource(id);
        btnkq7.setBackgroundResource(id);
        btnkq8.setBackgroundResource(id);
        btnkq9.setBackgroundResource(id);
    }

    public void setVisible(int status){
        btn1.setVisibility(status);
        btn2.setVisibility(status);
        btn3.setVisibility(status);
        btn4.setVisibility(status);
        btn5.setVisibility(status);
        btn6.setVisibility(status);
        btn7.setVisibility(status);
        btn8.setVisibility(status);
        btn9.setVisibility(status);
        btn10.setVisibility(status);
        btn11.setVisibility(status);
        btn12.setVisibility(status);
        btn13.setVisibility(status);
        btn14.setVisibility(status);
        btn15.setVisibility(status);
        btn16.setVisibility(status);
    }

    public void setBtnKqNull(){
        btnkq1.setText("");
        btnkq2.setText("");
        btnkq3.setText("");
        btnkq4.setText("");
        btnkq5.setText("");
        btnkq6.setText("");
        btnkq7.setText("");
        btnkq8.setText("");
        btnkq9.setText("");
    }

    public boolean isLose(int heart){
        if(heart==0){
            return true;
        }
        return false;
    }

    public void initImage(){
        arrayImages.add(R.drawable.aomua);
        arrayImages.add(R.drawable.baocao);
        arrayImages.add(R.drawable.canthiep);
        arrayImages.add(R.drawable.cattuong);
        arrayImages.add(R.drawable.chieutre);
        arrayImages.add(R.drawable.danhlua);
        arrayImages.add(R.drawable.danong);
        arrayImages.add(R.drawable.giandiep);
        arrayImages.add(R.drawable.giangmai);
        arrayImages.add(R.drawable.songsong);
        arrayImages.add(R.drawable.hongtam);
        arrayImages.add(R.drawable.khoailang);
        arrayImages.add(R.drawable.lancan);
        arrayImages.add(R.drawable.masat);
        arrayImages.add(R.drawable.nambancau);
        arrayImages.add(R.drawable.oto);
        arrayImages.add(R.drawable.quyhang);
        arrayImages.add(R.drawable.thattinh);
        arrayImages.add(R.drawable.thothe);
        arrayImages.add(R.drawable.tichphan);
        arrayImages.add(R.drawable.tohoai);
        arrayImages.add(R.drawable.totien);
        arrayImages.add(R.drawable.tranhthu);
        arrayImages.add(R.drawable.xakep);
        arrayImages.add(R.drawable.xaphong);
        arrayImages.add(R.drawable.xedapdien);
        arrayImages.add(R.drawable.hoidong);
    }

    public void setVisibleResult(int count){
        switch (count){
            case 0:
                btnkq1.setVisibility(View.INVISIBLE);
                btnkq2.setVisibility(View.INVISIBLE);
                btnkq3.setVisibility(View.INVISIBLE);
                btnkq4.setVisibility(View.INVISIBLE);
                btnkq5.setVisibility(View.INVISIBLE);
                btnkq6.setVisibility(View.INVISIBLE);
                btnkq7.setVisibility(View.INVISIBLE);
                btnkq8.setVisibility(View.INVISIBLE);
                btnkq9.setVisibility(View.INVISIBLE);
                break;
            case 1:
                btnkq1.setVisibility(View.VISIBLE);
                btnkq2.setVisibility(View.INVISIBLE);
                btnkq3.setVisibility(View.INVISIBLE);
                btnkq4.setVisibility(View.INVISIBLE);
                btnkq5.setVisibility(View.INVISIBLE);
                btnkq6.setVisibility(View.INVISIBLE);
                btnkq7.setVisibility(View.INVISIBLE);
                btnkq8.setVisibility(View.INVISIBLE);
                btnkq9.setVisibility(View.INVISIBLE);
                break;

            case 2:
                btnkq1.setVisibility(View.VISIBLE);
                btnkq2.setVisibility(View.VISIBLE);
                btnkq3.setVisibility(View.INVISIBLE);
                btnkq4.setVisibility(View.INVISIBLE);
                btnkq5.setVisibility(View.INVISIBLE);
                btnkq6.setVisibility(View.INVISIBLE);
                btnkq7.setVisibility(View.INVISIBLE);
                btnkq8.setVisibility(View.INVISIBLE);
                btnkq9.setVisibility(View.INVISIBLE);
                break;
            case 3:
                btnkq1.setVisibility(View.VISIBLE);
                btnkq2.setVisibility(View.VISIBLE);
                btnkq3.setVisibility(View.VISIBLE);
                btnkq4.setVisibility(View.INVISIBLE);
                btnkq5.setVisibility(View.INVISIBLE);
                btnkq6.setVisibility(View.INVISIBLE);
                btnkq7.setVisibility(View.INVISIBLE);
                btnkq8.setVisibility(View.INVISIBLE);
                btnkq9.setVisibility(View.INVISIBLE);
                break;
            case 4:
                btnkq1.setVisibility(View.VISIBLE);
                btnkq2.setVisibility(View.VISIBLE);
                btnkq3.setVisibility(View.VISIBLE);
                btnkq4.setVisibility(View.VISIBLE);
                btnkq5.setVisibility(View.INVISIBLE);
                btnkq6.setVisibility(View.INVISIBLE);
                btnkq7.setVisibility(View.INVISIBLE);
                btnkq8.setVisibility(View.INVISIBLE);
                btnkq9.setVisibility(View.INVISIBLE);
                break;
            case 5:
                btnkq1.setVisibility(View.VISIBLE);
                btnkq2.setVisibility(View.VISIBLE);
                btnkq3.setVisibility(View.VISIBLE);
                btnkq4.setVisibility(View.VISIBLE);
                btnkq5.setVisibility(View.VISIBLE);
                btnkq6.setVisibility(View.INVISIBLE);
                btnkq7.setVisibility(View.INVISIBLE);
                btnkq8.setVisibility(View.INVISIBLE);
                btnkq9.setVisibility(View.INVISIBLE);
                break;
            case 6:
                btnkq1.setVisibility(View.VISIBLE);
                btnkq2.setVisibility(View.VISIBLE);
                btnkq3.setVisibility(View.VISIBLE);
                btnkq4.setVisibility(View.VISIBLE);
                btnkq5.setVisibility(View.VISIBLE);
                btnkq6.setVisibility(View.VISIBLE);
                btnkq7.setVisibility(View.INVISIBLE);
                btnkq8.setVisibility(View.INVISIBLE);
                btnkq9.setVisibility(View.INVISIBLE);
                break;
            case 7:
                btnkq1.setVisibility(View.VISIBLE);
                btnkq2.setVisibility(View.VISIBLE);
                btnkq3.setVisibility(View.VISIBLE);
                btnkq4.setVisibility(View.VISIBLE);
                btnkq5.setVisibility(View.VISIBLE);
                btnkq6.setVisibility(View.VISIBLE);
                btnkq7.setVisibility(View.VISIBLE);
                btnkq8.setVisibility(View.INVISIBLE);
                btnkq9.setVisibility(View.INVISIBLE);
                break;
            case 8:
                btnkq1.setVisibility(View.VISIBLE);
                btnkq2.setVisibility(View.VISIBLE);
                btnkq3.setVisibility(View.VISIBLE);
                btnkq4.setVisibility(View.VISIBLE);
                btnkq5.setVisibility(View.VISIBLE);
                btnkq6.setVisibility(View.VISIBLE);
                btnkq7.setVisibility(View.VISIBLE);
                btnkq8.setVisibility(View.VISIBLE);
                btnkq9.setVisibility(View.INVISIBLE);
                break;
            case 9:
                btnkq1.setVisibility(View.VISIBLE);
                btnkq2.setVisibility(View.VISIBLE);
                btnkq3.setVisibility(View.VISIBLE);
                btnkq4.setVisibility(View.VISIBLE);
                btnkq5.setVisibility(View.VISIBLE);
                btnkq6.setVisibility(View.VISIBLE);
                btnkq7.setVisibility(View.VISIBLE);
                btnkq8.setVisibility(View.VISIBLE);
                btnkq9.setVisibility(View.VISIBLE);
        }
    }

    public void setCountResultButton(int size){
        switch (size){
            case 1:
                setVisibleResult(1);
                break;
            case 2:
                setVisibleResult(2);
                break;
            case 3:
                setVisibleResult(3);
                break;
            case 4:
                setVisibleResult(4);
                break;
            case 5:
                setVisibleResult(5);
                break;
            case 6:
                setVisibleResult(6);
                break;
            case 7:
                setVisibleResult(7);
                break;
            case 8:
                setVisibleResult(8);
                break;
            case 9:
                setVisibleResult(9);
                break;
        }
    }
    public void startGame(){
        myString = "";
        tvscore.setText(""+Score);
        tvheart.setText(""+heart);
        int i = rd.nextInt(arrayImages.size());
        ivImage.setBackground(getResources().getDrawable(arrayImages.get(i)));
        result = arrayResult.get(i);
        setCountResultButton(result.length());
        arrayResult.remove(i);
        arrayImages.remove(i);
        setBackgroundRecource(R.drawable.colorbtn);
        tvAgain.setVisibility(View.INVISIBLE);
        setChoose();
    }

    public void replay(int i){
        switch (i){
            case 1:
                btn1.setVisibility(View.VISIBLE);
                break;
            case 2:
                btn2.setVisibility(View.VISIBLE);
                break;
            case 3:
                btn3.setVisibility(View.VISIBLE);
                break;
            case 4:
                btn4.setVisibility(View.VISIBLE);
                break;
            case 5:
                btn5.setVisibility(View.VISIBLE);
                break;
            case 6:
                btn6.setVisibility(View.VISIBLE);
                break;
            case 7:
                btn7.setVisibility(View.VISIBLE);
                break;
            case 8:
                btn8.setVisibility(View.VISIBLE);
                break;
            case 9:
                btn9.setVisibility(View.VISIBLE);
                break;
            case 10:
                btn10.setVisibility(View.VISIBLE);
                break;
            case 11:
                btn11.setVisibility(View.VISIBLE);
                break;
            case 12:
                btn12.setVisibility(View.VISIBLE);
                break;
            case 13:
                btn13.setVisibility(View.VISIBLE);
                break;
            case 14:
                btn14.setVisibility(View.VISIBLE);
                break;
            case 15:
                btn15.setVisibility(View.VISIBLE);
                break;
            case 16:
                btn16.setVisibility(View.VISIBLE);
                break;
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tvnext:
                count = 0;
                startGame();

                tvNext.setVisibility(View.INVISIBLE);
                setVisible(View.VISIBLE);
                setBtnKqNull();
                if(isLose(heart)){
                    Toast.makeText(this,"Lose",Toast.LENGTH_LONG).show();
                    finish();
                }
                break;

            case R.id.tvAgain:
                myString="";
                setVisible(View.VISIBLE);
                setBtnKqNull();
                count =0;
                break;

            case R.id.btn1:
//                myString+=btn1.getText().toString();
                btn1.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn1,myString,1);
                }
                break;
            case R.id.btn2:
//                myString+=btn2.getText();
                btn2.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn2,myString,2);
                }
                break;
            case R.id.btn3:
//                myString+=btn3.getText();
                btn3.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn3,myString,3);
                }
                break;
            case R.id.btn4:
//                myString+=btn4.getText();
                btn4.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn4,myString,4);
                }
                break;
            case R.id.btn5:
//                myString+=btn5.getText();
                btn5.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn5,myString,5);
                }
                break;
            case R.id.btn6:
//                myString+=btn6.getText();
                btn6.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn6,myString,6);
                }
                break;
            case R.id.btn7:
//                myString+=btn7.getText();
                btn7.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn7,myString,7);
                }
                break;
            case R.id.btn8:
//                myString+=btn8.getText();
                btn8.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn8,myString,8);
                }
                break;
            case R.id.btn9:
//                myString+=btn9.getText();
                btn9.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn9,myString,9);
                }
                break;
            case R.id.btn10:
//                myString+=btn10.getText().toString();
                btn10.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn10,myString,10);
                }
                break;
            case R.id.btn11:
//                myString+=btn11.getText();
                btn11.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn11,myString,11);
                }
                break;
            case R.id.btn12:
//                myString+=btn12.getText();
                btn12.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn12,myString,12);
                }
                break;
            case R.id.btn13:
//                myString+=btn13.getText();
                btn13.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn13,myString,13);
                }
                break;
            case R.id.btn14:
//                myString+=btn14.getText();
                btn14.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn14,myString,14);
                }
                break;
            case R.id.btn15:
//                myString+=btn15.getText();
                btn15.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn15,myString,15);
                }
                break;
            case R.id.btn16:
//                myString+=btn16.getText();
                btn16.setVisibility(View.INVISIBLE);
                count++;
                tvscore.setText(""+Score);
                if(count>result.length()){
                    return;
                }
                if(count<=result.length()){
                    chooseButton(btn16,myString,16);
                }
                break;

            case R.id.btnkq1:
                replay(replay[0]);
                btnkq1.setText("");
                count--;
                break;
            case R.id.btnkq2:
                replay(replay[1]);
                btnkq2.setText("");
                count--;
                break;
            case R.id.btnkq3:
                replay(replay[2]);
                btnkq3.setText("");
                count--;
                break;
            case R.id.btnkq4:
                replay(replay[3]);
                btnkq4.setText("");
                count--;
                break;
            case R.id.btnkq5:
                replay(replay[4]);
                btnkq5.setText("");
                count--;
                break;
            case R.id.btnkq6:
                replay(replay[5]);
                btnkq6.setText("");
                count--;
                break;
            case R.id.btnkq7:
                replay(replay[6]);
                btnkq7.setText("");
                count--;
                break;
            case R.id.btnkq8:
                replay(replay[7]);
                btnkq8.setText("");
                count--;
                break;
            case R.id.btnkq9:
                replay(replay[8]);
                btnkq9.setText("");
                count--;
                break;

        }


     }
}

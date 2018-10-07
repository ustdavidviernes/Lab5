package com.viernes.david;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = new Intent(this, myCustomService.class);
        startService(i);
    }

    public void processB(View v) {
        Intent i =null, chooser =null;
        if(v.getId() == R.id.button3){
            i = new Intent(this,MainActivity.class);
            startActivity(i);
        }else if(v.getId() == R.id.button4) {
            i =new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5915334,120.9714459"));
            chooser = Intent.createChooser(i,"Choose a Map App");
            startActivity(chooser);
        }
    }
}

package ru.pvolan.tgp;

import android.app.*;
import android.os.Bundle;

import ru.pvolan.somelibrary.*;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ClassA classA = new ClassA();
        classA.doSomething();
    }



}

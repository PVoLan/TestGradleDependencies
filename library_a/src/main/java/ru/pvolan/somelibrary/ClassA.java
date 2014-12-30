package ru.pvolan.somelibrary;

import android.util.*;

import ru.pvolan.library_b.*;

public class ClassA
{
    public void doSomething(){
        Log.i("Test", "Done A!");

        ClassB classB = new ClassB();
        classB.doSomething();
    }
}

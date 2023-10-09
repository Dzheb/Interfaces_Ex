package org.example.task4;

public class Frontender extends Developer {

    @Override
    void drink() {
        System.out.println("drink coffee");
    }

    @Override
    void go() {
        System.out.println("go skateboarding");
    }


    public void developGUI() {
        System.out.println("create GUI");
    }


}
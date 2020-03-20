package com.design.observer;

public class Gupiao implements Observer {

    @Override
    public void happy() {
        System.out.println("股民开心");
    }

    @Override
    public void terrible() {
        System.out.println("股民难受");
    }
}
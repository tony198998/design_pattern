package com.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 股票上涨，股民开心，股票下跌股民伤心
 * 股票情况为目标类
 * 股民为观察者
 **/

//subject目标类,观察者观察的对象（抽象类）
//定义观察者集合。提供接口增加或删除观察者对象，定义通知方法。
//一般我们会在在目标中定义一个观察者集合，用来管理观察者。
//一个观察目标可以接受任意数量的观察者来观察，它提供一系列方法来增加和删除观察者对象，
// 如attach()方法与detach()方法；同时也会定义通知方法notify()。
public abstract class Subject {

    //定义一个观察者集合，用于管理观察者
    protected List<Observer> observers = new ArrayList<>();


    //向观察者集合中增加一个观察者对象
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //向观察者中删除一个观察者对象
    public void delattach(Observer observer) {
        observers.remove(observer);
    }

    //抽象通知方法(股票上涨)
    public abstract void increase();

    //抽像通知方法（股票下跌）
    public abstract void decrease();

}

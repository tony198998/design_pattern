package com.design.observer;

//观察者（接口）
//对所观察的目标的改变做出反应。
//观察者角色一般是一个接口，它会有一个update方法，
// 当目标对象的状态发生改变时，这个方法就会被调用。
public interface Observer {
     public void happy();
     public void terrible();
}

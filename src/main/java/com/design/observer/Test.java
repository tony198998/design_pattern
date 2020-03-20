package com.design.observer;

//测试类
public class Test {
    public static void main(String[] args) {
        Subject s=new changjiangzehngquan();
        s.attach( new Gupiao() );
        s.increase();
        s.decrease();

    }
}
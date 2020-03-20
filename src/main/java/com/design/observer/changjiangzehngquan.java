package com.design.observer;

//具体目标对象，某一之股票，长江证券股票
//具体目标是目标类的子类(接口的实现者)，通常它包含有经常发生改变的数据，
// 当它的状态发生改变时，向它的各个观察者发出通知；
// 同时它还实现了在目标类中定义的抽象业务逻辑方法
public class changjiangzehngquan extends Subject {
    @Override
    public void increase() {
        System.out.println("股票上涨了");
        //遍历观察者集合，调用每个观察者的响应方法
        for (Observer o : observers) {//子类继承父类的对象observers
            o.happy();//目标对象发生变化，调用观察者的方法更新数据
        }
    }

    @Override
    public void decrease() {
        System.out.println("股票下跌了");
        for (Observer o : observers) {
            o.terrible();
        }
    }


}

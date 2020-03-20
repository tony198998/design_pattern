package com.design.observer.event;

import org.slf4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 短信监听（异步执行）
 */
@Component
public class SmsListener implements ApplicationListener<OrderEvent> {


    @Override
    @Async  //异步
    public void onApplicationEvent(OrderEvent event) {
        System.out.println(Thread.currentThread() + "...短信监听到..." + event.getMessage()+ "......" + event.getSource());
    }
}
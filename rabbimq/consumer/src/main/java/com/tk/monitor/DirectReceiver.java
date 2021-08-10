package com.tk.monitor;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
//@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
public class DirectReceiver {

//    @RabbitHandler
    public void process(Map<String, Object> testMessage) {
        System.out.println("DirectReceiver消费者一收到消息  : " + testMessage.toString());
    }

}
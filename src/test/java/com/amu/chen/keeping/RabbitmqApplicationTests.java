package com.amu.chen.keeping;

import com.amu.chen.keeping.rabbitmq.MQSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {
    @Autowired
    MQSender mqSender;

    @Test
    public void contextLoads(){
        mqSender.sendDirect();
        mqSender.sendTopic();
        mqSender.sendFanout();
        mqSender.sendHeaders();
    }
}

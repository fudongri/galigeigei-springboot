package org.galigeigei.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationEventListener implements ApplicationListener<MyApplicationEvent> {

    public void onApplicationEvent(MyApplicationEvent event) {
        System.out.println("source-->" + event.getSource());
    }

}
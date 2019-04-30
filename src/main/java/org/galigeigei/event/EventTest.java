package org.galigeigei.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // context.addApplicationListener(new MyApplicationEventListener());
        context.register(MyApplicationEventListener.class);
        context.refresh();

        context.publishEvent(new MyApplicationEvent("hello,fdr"));
        context.publishEvent(new MyApplicationEvent("hello,aaa"));
        context.publishEvent(new MyApplicationEvent("hello,bbb"));
    }
}

package org.galigeigei.event;

import org.springframework.context.ApplicationEvent;

public class MyApplicationEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1535498341366980436L;

    public MyApplicationEvent(Object source) {
        super(source);
    }

}

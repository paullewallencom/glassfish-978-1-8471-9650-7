package com.programmingstuff.jms.beans;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(mappedName = "jms/PSQueue", activationConfig =  {
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
    })
public class SimpleMDB implements MessageListener {
    private Logger logger = Logger.getLogger("com.programmingstuff.jms.beans.SimpleMDB");

    public SimpleMDB() {
    }

    public void onMessage(Message message) {
        try {
        TextMessage msg = (TextMessage)message;
        logger.info("==== The message says: " + msg.getText());
        } catch(JMSException e) {
            logger.warning("**** Error occured: " + e.getMessage());
        }
    }
    
}

package com.programmingstuff.jms.beans;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author xkou
 */
@MessageDriven(mappedName = "jms/AMQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class AMQBean implements MessageListener {

    private Logger logger = Logger.getLogger("com.programmingstuff.jms.beans.AMQBean");

    public AMQBean() {
    }

    public void onMessage(Message message) {
        try {
            TextMessage msg = (TextMessage) message;
            logger.info("==== The AMQ message says: " + msg.getText());
        } catch (JMSException e) {
            logger.warning("**** AMQ Error occured: " + e.getMessage());
        }
    }
}

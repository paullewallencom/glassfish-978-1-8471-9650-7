/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
@MessageDriven(mappedName = "jms/AMGQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class AMGBean implements MessageListener {

    private Logger logger = Logger.getLogger("com.programmingstuff.jms.beans.AMGBean");

    public AMGBean() {
    }

    public void onMessage(Message message) {
        try {
            TextMessage msg = (TextMessage) message;
            logger.info("==== The AMGBean message says: " + msg.getText());
        } catch (JMSException e) {
            logger.warning("**** AMGBean Error occured: " + e.getMessage());
        }
    }
}

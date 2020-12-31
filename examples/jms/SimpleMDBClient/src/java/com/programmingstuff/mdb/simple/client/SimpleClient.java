package com.programmingstuff.mdb.simple.client;

import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

public class SimpleClient {

    @Resource(mappedName = "jms/PSConnectionFactory")
    private static ConnectionFactory qcf;
    @Resource(mappedName = "jms/PSQueue")
    private static Destination queue;

    public static void main(String[] args) throws Exception {
        Context ctx = new InitialContext();
        sendMessage(ctx);
    }

    public static void sendMessage(Context ctx) throws Exception {
        Connection qc = null;
        Session session = null;
        MessageProducer sender = null;
        TextMessage message = null;
        final int NUM_MSGS = 3;
        qc = qcf.createConnection();
        session = qc.createSession(false, Session.AUTO_ACKNOWLEDGE);
        sender = session.createProducer(queue);
        message = session.createTextMessage();
        for (int i = 0; i < NUM_MSGS; i++) {
            message.setText("From AppClient - This is message " + (i + 1));
            sender.send(message);
        }
        qc.close();
    }
}

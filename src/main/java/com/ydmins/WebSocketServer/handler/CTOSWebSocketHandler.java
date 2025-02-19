package com.ydmins.WebSocketServer.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class CTOSWebSocketHandler extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception{
        String receivedMessage = message.getPayload();
        System.out.println("Received : "+receivedMessage);

        session.sendMessage(new TextMessage("Server received following message : "+receivedMessage));
    }
}

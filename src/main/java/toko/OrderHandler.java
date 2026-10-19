package toko;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class OrderHandler extends TextWebSocketHandler {

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("[WS] Connected: " + session.getId());

        session.sendMessage(new TextMessage("Pesanan #1: diproses"));
        Thread.sleep(2000);
        session.sendMessage(new TextMessage("Pesanan #1: dikemas"));
        Thread.sleep(2000);
        session.sendMessage(new TextMessage("Pesanan #1: dikirim ke kurir"));
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        System.out.println("[WS] Message received: " + message.getPayload());
        session.sendMessage(new TextMessage("Server terima: " + message.getPayload()));
    }
}

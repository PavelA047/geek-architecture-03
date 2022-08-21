package ru.geekbrains.service;

import java.net.Socket;

public class ServerSocketServiceFactory {

    public static ServerSocketService create(Socket socket) {
        return new SocketService(socket);
    }
}

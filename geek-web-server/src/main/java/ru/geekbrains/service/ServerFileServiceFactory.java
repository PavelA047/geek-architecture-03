package ru.geekbrains.service;

import java.net.Socket;

public class ServerFileServiceFactory {
    public static ServerFileService create(String rootDir) {
        return new FileService(rootDir);
    }
}

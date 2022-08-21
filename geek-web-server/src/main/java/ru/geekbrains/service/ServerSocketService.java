package ru.geekbrains.service;

import java.io.Closeable;
import java.util.Deque;

public interface ServerSocketService extends Closeable {

    Deque<String> readRequest();

    void writeResponse(String rawResponse);
}

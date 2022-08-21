package ru.geekbrains.service;

public interface ServerFileService {
    boolean exists(String filename);

    boolean isDirectory(String filename);

    String readFile(String filename);
}

package ru.geekbrains.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileServiceTest {

    public FileService fileService = new FileService("C:\\Users\\Павлик\\Desktop\\geek-architecture-02 (3)\\geek-architecture-02\\geek-web-server\\src\\test\\resources");

    @Test
    public void exists() {
        Assert.assertTrue(fileService.exists("server.properties"));
    }

    @Test
    public void isDirectory() {
        Assert.assertFalse(fileService.isDirectory("server.properties"));
    }

    @Test
    public void readFile() {
        String response = fileService.readFile("server.properties");
        Assert.assertEquals("www.home=D:\\wwwport=1234", response);
    }
}
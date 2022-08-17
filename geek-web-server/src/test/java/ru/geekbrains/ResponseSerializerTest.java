package ru.geekbrains;

import org.junit.Assert;
import org.junit.Test;
import ru.geekbrains.domain.HttpResponse;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ResponseSerializerTest {

    public HttpResponse httpResponse = new HttpResponse();
    public ResponseSerializer responseSerializer = new ResponseSerializer();

    @Test
    public void serialize() {
        httpResponse.setStatusCode(200);
        httpResponse.setStatusCodeName("OK");
        httpResponse.setHeaders(new HashMap<>(Map.of("Content-Type", "text/html; charset=utf-8")));
        httpResponse.setBody("TestOfResponse");

        String serialize = responseSerializer.serialize(httpResponse);

        Assert.assertEquals(serialize, "HTTP/1.1 200 OK\n" +
                "Content-Type: text/html; charset=utf-8\n" +
                "\n" +
                "TestOfResponse");
    }
}
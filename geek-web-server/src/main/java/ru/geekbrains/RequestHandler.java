package ru.geekbrains;

import ru.geekbrains.domain.HttpRequest;
import ru.geekbrains.domain.HttpResponse;
import ru.geekbrains.service.ServerFileService;
import ru.geekbrains.service.ServerSocketService;

import java.io.IOException;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class RequestHandler implements Runnable {

    private final ServerSocketService socketService;
    private final ServerFileService fileService;
    private final RequestParser requestParser;
    private final ResponseSerializer responseSerializer;

    public RequestHandler(ServerSocketService socketService,
                          ServerFileService fileService,
                          RequestParser requestParser,
                          ResponseSerializer responseSerializer) {
        this.socketService = socketService;
        this.fileService = fileService;
        this.requestParser = requestParser;
        this.responseSerializer = responseSerializer;
    }

    @Override
    public void run() {
        Deque<String> rawRequest = socketService.readRequest();
        HttpRequest req = requestParser.parse(rawRequest);

        if (!fileService.exists(req.getUrl())) {
            HttpResponse resp = HttpResponse.createBuilder()
                    .withStatusCode(404)
                    .withStatusCodeName("NOT_FOUND")
                    .withHeaders(new HashMap<>(Map.of("Content-Type", "text/html; charset=utf-8")))
                    .build();
            socketService.writeResponse(responseSerializer.serialize(resp));
            return;
        }

        HttpResponse resp = HttpResponse.createBuilder()
                .withStatusCode(200)
                .withStatusCodeName("OK")
                .withHeaders(new HashMap<>(Map.of("Content-Type", "text/html; charset=utf-8")))
                .withBody(fileService.readFile(req.getUrl()))
                .build();
        socketService.writeResponse(responseSerializer.serialize(resp));

        try {
            socketService.close();
        } catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
        System.out.println("Client disconnected!");
    }
}

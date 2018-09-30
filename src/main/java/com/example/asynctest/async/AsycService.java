package com.example.asynctest.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Service
public class AsycService {

    @Async
    public CompletableFuture<String> asyncMethodWithReturnType() throws InterruptedException {
        System.out.println("Enter the srvice");

        String message = "Itt az eredmény..talán már Dockerből :)   ";
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(3000L);

        return CompletableFuture.completedFuture(message);

    }
}

package com.example.asynctest.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;


@RestController
@RequestMapping("/rs")
public class ControllerAsync {

    @Autowired
    private AsycService asycService;

    @Async
    @GetMapping("/as")
    public CompletableFuture<String> callAsync() throws InterruptedException {
      return   asycService.asyncMethodWithReturnType();
    }
}

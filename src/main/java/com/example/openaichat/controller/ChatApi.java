package com.example.openaichat.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/chat-api")
public interface ChatApi {

    @PostMapping("/request")
    String createChatCompletion(@RequestBody String request);
}

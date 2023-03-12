package com.example.openaichat.controller;

import com.example.openaichat.models.ChatCompletionResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/chat-api")
public interface ChatApi {

    @PostMapping("/request")
    ChatCompletionResult createChatCompletion(@RequestBody String request);
}

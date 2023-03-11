package com.example.openai.controller;

import com.example.openai.models.ChatCompletionResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/chat-api")
public interface ChatApi {

    @PostMapping("/request")
    ChatCompletionResult sendRequest(@RequestBody String request);
}

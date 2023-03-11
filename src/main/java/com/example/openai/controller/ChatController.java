package com.example.openai.controller;

import com.example.openai.models.ChatCompletionResult;
import com.example.openai.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatController implements ChatApi {
    
    private final ChatService chatService;
    
    @Override
    public ChatCompletionResult sendRequest(String request) {
        return chatService.createChatCompletion(request);
    }
}

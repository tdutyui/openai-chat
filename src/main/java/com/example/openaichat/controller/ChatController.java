package com.example.openaichat.controller;

import com.example.openaichat.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatController implements ChatApi {
    
    private final ChatService chatService;
    
    @Override
    public String createChatCompletion(String request) {
        return chatService.createChatCompletion(request);
    }
}

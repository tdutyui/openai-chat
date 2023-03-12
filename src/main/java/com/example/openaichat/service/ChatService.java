package com.example.openaichat.service;

import com.example.openaichat.models.ChatCompletionResult;

public interface ChatService {
    
    ChatCompletionResult createChatCompletion(String request);
}

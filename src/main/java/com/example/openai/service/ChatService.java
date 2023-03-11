package com.example.openai.service;

import com.example.openai.models.ChatCompletionResult;

public interface ChatService {
    
    ChatCompletionResult createChatCompletion(String request);
}

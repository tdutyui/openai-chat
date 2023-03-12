package com.example.openaichat.service.impl;

import com.example.openaichat.client.ChatClient;
import com.example.openaichat.models.ChatCompletionRequest;
import com.example.openaichat.models.ChatCompletionResult;
import com.example.openaichat.models.ChatMessage;
import com.example.openaichat.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {
    
    private final ChatClient chatClient;
    
    private static final String TOKEN = System.getenv("OPENAI_TOKEN");
    
    @Override
    public ChatCompletionResult createChatCompletion(String request) {
        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest.builder()
                .model("gpt-3.5-turbo")
                .messages(List.of(new ChatMessage("user", request)))
                .temperature(1.0)
                .topP(1.0)
                .n(1)
                .stream(false)
                .stop(null)
                .presencePenalty(0.0)
                .frequencyPenalty(0.0)
                .user("user")
                .build();
        return chatClient.createChatCompletion(chatCompletionRequest, TOKEN);
    }
}
package com.example.openai.client;

import com.example.openai.models.ChatCompletionRequest;
import com.example.openai.models.ChatCompletionResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "openAiApi", url = "https://api.openai.com/v1/chat/completions")
public interface ChatClient {
    
    @PostMapping
    ChatCompletionResult createChatCompletion(@RequestBody ChatCompletionRequest request, @RequestHeader("Authorization") String token);
}

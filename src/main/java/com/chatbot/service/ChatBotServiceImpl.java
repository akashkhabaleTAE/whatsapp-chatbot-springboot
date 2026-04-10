package com.chatbot.service;

import com.chatbot.model.MessageResponse;
import org.springframework.stereotype.Service;

@Service
public class ChatBotServiceImpl implements ChatBotService
{
    @Override
    public MessageResponse sendMessage(String message) {
        if (message == null) return new  MessageResponse("Invalid message");

        return switch (message.toLowerCase()) {
            case "hi" -> new MessageResponse("Hello");
            case "bye" -> new MessageResponse("good bye");
            default -> new MessageResponse("I don't understand");
        };
    }
}

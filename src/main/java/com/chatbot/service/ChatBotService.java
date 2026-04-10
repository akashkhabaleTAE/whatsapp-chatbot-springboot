package com.chatbot.service;

import com.chatbot.model.MessageResponse;
import org.springframework.stereotype.Service;

@Service
public interface ChatBotService {
    MessageResponse sendMessage(String message);
}

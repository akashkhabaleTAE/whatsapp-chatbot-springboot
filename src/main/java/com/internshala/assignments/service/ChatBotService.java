package com.internshala.assignments.service;

import com.internshala.assignments.model.MessageResponse;
import org.springframework.stereotype.Service;

@Service
public interface ChatBotService {
    MessageResponse sendMessage(String message);
}

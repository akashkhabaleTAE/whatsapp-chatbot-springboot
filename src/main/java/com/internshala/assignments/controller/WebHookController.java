package com.internshala.assignments.controller;

import com.internshala.assignments.model.MessageRequest;
import com.internshala.assignments.model.MessageResponse;
import com.internshala.assignments.service.ChatBotService;
import com.internshala.assignments.service.ChatBotServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/webhook")
@Slf4j
public class WebHookController
{
    private final ChatBotService chatBotService;
    private static final Logger logger = Logger.getLogger(WebHookController.class.getName());

    public WebHookController(ChatBotService chatBotService) {
        this.chatBotService = new ChatBotServiceImpl();
    }

    @PostMapping
    public ResponseEntity<MessageResponse> receiveMessage(@RequestBody MessageRequest messageRequest) {
        logger.info("Incoming message  " + messageRequest.getMessage());
        final MessageResponse messageResponse = this.chatBotService.sendMessage(messageRequest.getMessage());
        return new ResponseEntity<>(messageResponse, HttpStatus.OK);
    }
}

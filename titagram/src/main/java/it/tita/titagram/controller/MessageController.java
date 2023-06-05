package it.tita.titagram.controller;

import it.tita.titagram.model.Message;
import it.tita.titagram.model.User;
import it.tita.titagram.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public ResponseEntity<Message> createMessage(@RequestParam String content, @RequestParam User sender, @RequestParam User receiver) {
        Message message = messageService.createMessage(content, sender, receiver);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }
}

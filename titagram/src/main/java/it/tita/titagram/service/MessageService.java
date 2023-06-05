package it.tita.titagram.service;

import it.tita.titagram.model.Message;
import it.tita.titagram.model.User;
import it.tita.titagram.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message createMessage(String content, User sender, User receiver) {
        Message message = new Message();
        message.setContent(content);
        message.setSender(sender);
        message.setReceiver(receiver);
        return messageRepository.save(message);
    }
}

package com.example.demo3.controller;

import com.example.demo3.model.MyNotes;
import com.example.demo3.repo.MessageRepo;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Node;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("message")
public class MessageController {

    private final MessageRepo messageRepo;

    @Autowired
    public MessageController(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<MyNotes> list(@RequestParam(value = "textNote", required = false) String textNote) {
        return messageRepo.findAllText(textNote);
    }

    @GetMapping("{id}")
//    @JsonView(Views.FullMessage.class)
    @CrossOrigin(origins = "http://localhost:3000")
    public MyNotes getOne(@PathVariable("id") MyNotes message) {
        return message;
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public MyNotes create(@RequestBody MyNotes message) {
        message.setDateNote(LocalDateTime.now());
        return messageRepo.save(message);
    }

    @PutMapping("{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public MyNotes update(@PathVariable("id") MyNotes messageFromDb,
                          @RequestBody MyNotes message) {
        BeanUtils.copyProperties(message, messageFromDb, "id");

        return messageRepo.save(messageFromDb);
    }

    @DeleteMapping("{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public void delete(@PathVariable("id") MyNotes message) {
        messageRepo.delete(message);

    }


}

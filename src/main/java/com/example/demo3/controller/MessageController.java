package com.example.demo3.controller;

import com.example.demo3.model.Notes;
import com.example.demo3.repo.MessageRepo;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<Notes> list() {
        return messageRepo.findAll();
    }

    @GetMapping("{id}")
//    @JsonView(Views.FullMessage.class)
    @CrossOrigin(origins = "http://localhost:3000")
    public Notes getOne(@PathVariable("id") Notes message) {
        return message;
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public Notes create(@RequestBody Notes message) {
        return messageRepo.save(message);
    }

    @PutMapping("{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Notes update(@PathVariable("id") Notes messageFromDb,
                          @RequestBody Notes message) {
        BeanUtils.copyProperties(message, messageFromDb, "id");

        return messageRepo.save(message);
    }

    @DeleteMapping("{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public void delete(@PathVariable("id") Notes message) {
        messageRepo.delete(message);

    }


}

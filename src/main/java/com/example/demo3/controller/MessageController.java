package com.example.demo3.controller;

import com.example.demo3.model.MyNotes;
import com.example.demo3.repo.MessageRepo;
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
    public List<MyNotes> list() {
        return messageRepo.findAll();
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
        return messageRepo.save(message);
    }

    @PutMapping("{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public MyNotes update(@PathVariable("id") MyNotes messageFromDb,
                          @RequestBody MyNotes message) {
        BeanUtils.copyProperties(message, messageFromDb, "id");

        return messageRepo.save(message);
    }

    @DeleteMapping("{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public void delete(@PathVariable("id") MyNotes message) {
        messageRepo.delete(message);

    }


}

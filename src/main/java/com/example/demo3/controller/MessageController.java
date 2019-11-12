package com.example.demo3.controller;

import com.example.demo3.Demo3Application;
import exceptions.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("message")
public class MessageController {

    private int counter = 4;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Map<String, String>> list() {
        return Demo3Application.messages;
    }

    @GetMapping("{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Map<String, String> getOne(@PathVariable String id) {
        return getMessage(id);
    }


    private Map<String, String> getMessage(@PathVariable String id) {
        return Demo3Application.messages.stream()
                .filter(message -> message.get("idNote").equals(id))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }


    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public Map<String, String> create(@RequestBody Map<String, String> message) {

        message.put("idNote", String.valueOf(counter++));
        //messageRepo.save(message);

        Demo3Application.messages.add(message);
        return message;
    }

    @PutMapping("{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Map<String, String> update(@PathVariable String id, @RequestBody Map<String, String> message) {
        Map<String, String> messageFromDb = getMessage(id);
        messageFromDb.putAll(message);
        messageFromDb.put("idNote", id);

        return messageFromDb;
    }

    @DeleteMapping("{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public void delete(@PathVariable String id){
        Map<String,String>  message = getMessage(id);
        Demo3Application.messages.remove(message);

    }




}

package com.example.demo3.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("message")

public class MessageController {
    public List<Map<String, String>> messages = new ArrayList<>();

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Map<String, String>> list() {
        messages.clear();
        messages.add(new HashMap<String, String>() {{
            put("idNote", "1");
            put("dateNote", "01.01.01");
            put("urgencyNote", "1");
            put("textNote", "First message 111111111111111111111111111111 111111111111111 1 111111111111111111111111111111111 1 1 1 11 11111111111111111111 1");

        }});

        messages.add(new HashMap<String, String>() {{
            put("idNote", "2");
            put("dateNote", "02.02.02");
            put("urgencyNote", "2");
            put("textNote", "Second message 22222222222222222222222   2 22 22222222222222222222222222222 22222222222222222222222222222222222 2 2");

        }});

        messages.add(new HashMap<String, String>() {{
            put("idNote", "3");
            put("dateNote", "03.03.03");
            put("urgencyNote", "3");
            put("textNote", "third message 33333333333333333333333333333333333333333 333333333333333333333 333333333333333333333333 33333333333333333333 3");

        }});

        System.out.println(messages);
        return messages;
    }

}

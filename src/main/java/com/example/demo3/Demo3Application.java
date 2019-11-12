package com.example.demo3;

import com.example.demo3.model.Notes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Demo3Application {

    public static List<Map<String, String>> messages = new ArrayList<>();

    public static Notes notes = new Notes();


    public static void main(String[] args) {

        SpringApplication.run(Demo3Application.class, args);

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


    }

}

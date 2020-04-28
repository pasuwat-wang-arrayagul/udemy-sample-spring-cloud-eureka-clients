package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerbController {

    @Value("${words}")
    private String verbTxt;

    @GetMapping("/")
    public @ResponseBody
    String getWord() {
        String[] wordArray = verbTxt.split(",");
        int i = (int)Math.round(Math.random() * (wordArray.length - 1));
        return wordArray[i];
    }
}

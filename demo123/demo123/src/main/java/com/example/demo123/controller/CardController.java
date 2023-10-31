package com.example.demo123.controller;

import com.example.demo123.model.Card;
import com.example.demo123.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/card")
@CrossOrigin("*")
public class CardController {
    @Autowired
    private ICardService iCardService;

    @GetMapping("/list")
    public ResponseEntity<List<Card>> list(){
        var result= iCardService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

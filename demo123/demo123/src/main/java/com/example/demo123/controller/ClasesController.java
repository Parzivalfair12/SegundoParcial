package com.example.demo123.controller;

import com.example.demo123.model.ServiceResponse;
import com.example.demo123.model.Clases;
import com.example.demo123.service.IClaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/clase")
@CrossOrigin("*")
public class ClasesController {
    @Autowired
    private IClaseService iCardService;

    @GetMapping("/list")
    public ResponseEntity<List<Clases>> list(){
        var result= iCardService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<ServiceResponse> save(@RequestBody Clases clases){
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = iCardService.save(clases);
        if(result ==1){
            serviceResponse.setMessage("Item saved with success");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<ServiceResponse> update(@RequestBody Clases clases){
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = iCardService.update(clases);
        if(result == 1){
            serviceResponse.setMessage("Item update with success");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<ServiceResponse> update(@PathVariable int id){
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = iCardService.deleteById(id);
        if(result == 1){
            serviceResponse.setMessage("Item removed with success");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

}

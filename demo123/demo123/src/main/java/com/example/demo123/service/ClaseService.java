package com.example.demo123.service;

import com.example.demo123.model.Card;
import com.example.demo123.model.Clases;
import com.example.demo123.repository.ICardRepository;
import com.example.demo123.repository.IClasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaseService implements IClaseService{
    @Autowired
    private IClasesRepository iCardRepository;
    @Override
    public List<Clases> findAll() {
        List<Clases> list ;
        try{
            list = iCardRepository.findAll();
        }catch (Exception ex){
            throw ex;
        }
        return list;
    }

    @Override
    public int save(Clases clases) {
        int row;
        try{
            row = iCardRepository.save(clases);
        }catch (Exception ex){
            throw ex;
        }
        return row;
    }

    @Override
    public int update(Clases clases) {
        int row;
        try{
            row = iCardRepository.update(clases);
        }catch (Exception ex){
            throw ex;
        }
        return row;
    }

    @Override
    public int deleteById(int id) {
        int row;
        try{
            row = iCardRepository.deleteById(id);
        }catch (Exception ex){
            throw ex;
        }
        return row;
    }
}

package com.example.demo123.service;

import com.example.demo123.model.Card;
import com.example.demo123.repository.ICardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService implements ICardService{
    @Autowired
    private ICardRepository iCardRepository;

    @Override
    public List<Card> findAll() {
        List<Card> list ;
        try{
            list = iCardRepository.findAll();
        }catch (Exception ex){
            throw ex;
        }
        return list;
    }

    @Override
    public int save(Card card) {
        return 0;
    }

    @Override
    public int update(Card card) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }
}

package com.example.demo123.repository;

import com.example.demo123.model.Card;
import com.example.demo123.model.Clases;

import java.util.List;

public interface IClasesRepository {
    public List<Clases> findAll();
    public int save(Clases clases);
    public int update(Clases clases);
    public int deleteById(int id);
}

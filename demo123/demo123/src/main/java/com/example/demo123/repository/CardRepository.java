package com.example.demo123.repository;

import com.example.demo123.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.SQL;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardRepository implements ICardRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Card> findAll() {
        String SQL =  " SELECT * FROM Tarjetas WHERE status = 1 ";
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Card.class));
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

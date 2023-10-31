package com.example.demo123.repository;

import com.example.demo123.model.Card;
import com.example.demo123.model.Clases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClasesRepository implements IClasesRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Clases> findAll() {
        String SQL =  " SELECT * FROM Clases WHERE EstadoClase = 1 ";
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Clases.class));
    }

    @Override
    public int save(Clases clases) {
        String SQL = "INSERT INTO Clases VALUES(?,?,?,?,?)";
        return jdbcTemplate.update(SQL, new Object[]{clases.getNombreClase(), clases.getHorario(), clases.getDocente(),
                clases.getSalonClase(),clases.getEstadoClase()});
    }

    @Override
    public int update(Clases clases) {
        String SQL = "UPDATE Clases SET NombreClase =?, Horario = ?, Docente=?, SalonClase=?, EstadoClase=? where IdClases = ?";
        return jdbcTemplate.update(SQL, new Object[]{clases.getNombreClase(), clases.getHorario(), clases.getDocente(),
                clases.getSalonClase(),clases.getEstadoClase()});
    }

    @Override
    public int deleteById(int id) {
        String SQL = "UPDATE Clases SET EstadoClase=0 WHERE IdClases = ?";
        return jdbcTemplate.update(SQL, new Object[]{id});
    }
}

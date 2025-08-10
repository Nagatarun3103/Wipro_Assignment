package com.example.Spring_jdbc;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAOImpl implements PersonDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Person> rowMapper = new RowMapper<Person>() {
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Person(
                rs.getInt("id"),
                rs.getInt("age"),
                rs.getString("firstName"),
                rs.getString("lastName")
            );
        }
    };

    public List<Person> getAll() {
        return jdbcTemplate.query("SELECT * FROM person", rowMapper);
    }

    public Person getById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM person WHERE id=?", rowMapper, id);
    }

    public void create(Person person) {
        jdbcTemplate.update("INSERT INTO person(age, firstName, lastName) VALUES (?, ?, ?)",
            person.getAge(), person.getFirstName(), person.getLastName());
    }

    public void update(Person person) {
        jdbcTemplate.update("UPDATE person SET age=?, firstName=?, lastName=? WHERE id=?",
            person.getAge(), person.getFirstName(), person.getLastName(), person.getId());
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM person WHERE id=?", id);
    }
}

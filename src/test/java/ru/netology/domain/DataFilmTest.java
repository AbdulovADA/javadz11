package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataFilmTest {
    @Test
    void idDataFilm() {
        DataFilm data = new DataFilm(100,"test","drama");
        assertEquals(100,data.getId());
    }
    @Test
    void genreDataFilm() {
        DataFilm data = new DataFilm(100,"test","drama");
        assertEquals("drama",data.getGenre());
    }
    @Test
    void nameDataFilm() {
        DataFilm data = new DataFilm(100,"test","drama");
        assertEquals("test",data.getName());
    }
}

package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmManagerTest {
    FilmManager manager = new FilmManager();
    DataFilm first = new DataFilm(1, "first", "drama");
    DataFilm second = new DataFilm(2, "second", "drama");
    DataFilm third = new DataFilm(3, "third", "horror");
    DataFilm fourth = new DataFilm(4, "fourth", "action");
    DataFilm fifth = new DataFilm (5, "fifth", "action");
    DataFilm sixth = new DataFilm (6, "sixth", "action");
    DataFilm seventh = new DataFilm (7, "seventh", "action");
    DataFilm eighth = new DataFilm (8, "eighth", "action");
    DataFilm ninth = new DataFilm (9, "ninth", "action");
    DataFilm tenth = new DataFilm (10, "tenth", "action");
    DataFilm eleventh = new DataFilm (11, "eleventh", "action");

    @Test
    void getFilmManager() {
        assertEquals(10, manager.getLimit());
    }

    @Test
    void getFilmManager2() {
        FilmManager manager = new FilmManager(4);
        assertEquals(4, manager.getLimit());
    }

    @Test
    public void newFilmAndFindAll() {
        manager.plus(first);
        manager.plus(second);

        DataFilm[] actual = manager.findAll();
        DataFilm[] expected = {first, second};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void listFilmAndFindLast() {
        manager.plus(first);
        manager.plus(second);
        manager.plus(third);
        manager.plus(fourth);
        manager.plus(fifth);
        manager.plus(sixth);
        manager.plus(seventh);
        manager.plus(eighth);
        manager.plus(ninth);
        manager.plus(tenth);
        manager.plus(eleventh);

        DataFilm[] actual = manager.findLast();
        DataFilm[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void listFilmAndFindLast2() {
        FilmManager manager = new FilmManager(4);
        manager.plus(first);
        manager.plus(second);
        manager.plus(third);
        manager.plus(fourth);
        manager.plus(fifth);
        manager.plus(sixth);
        manager.plus(seventh);
        manager.plus(eighth);
        manager.plus(ninth);
        manager.plus(tenth);
        manager.plus(eleventh);

        DataFilm[] actual = manager.findLast();
        DataFilm[] expected = {eleventh, tenth, ninth, eighth};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void listFilmAndFindLast3() {
        manager.plus(first);
        manager.plus(second);
        manager.plus(third);

        DataFilm[] actual = manager.findLast();
        DataFilm[] expected = {third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }
}




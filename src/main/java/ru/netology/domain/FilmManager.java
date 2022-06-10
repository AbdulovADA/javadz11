package ru.netology.domain;


public class FilmManager {

    private DataFilm[] films = new DataFilm[0];
    private int limit = 10;

    public FilmManager() {
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void plus(DataFilm newDataFilm) {
        int length = films.length + 1;
        DataFilm[] newFilm = new DataFilm[length];
        for (int i = 0; i < films.length; i++) {
            newFilm[i] = films[i];
        }

        int lastIndex = newFilm.length - 1;
        newFilm[lastIndex] = newDataFilm;
        films = newFilm;
    }

    public DataFilm[] findAll() {
        return films;
    }

    public DataFilm[] findLast() {
        if (limit < films.length) {
            DataFilm[] resultLength = new DataFilm[limit];
            for (int i = 0; i < limit; i++) {
                int index = films.length - i - 1;
                resultLength[i] = films[index];
            }
            return resultLength;
        } else {
            DataFilm[] resultLength = new DataFilm[films.length];
            for (int i = 0; i < films.length; i++) {
                int index = films.length - i - 1;
                resultLength[i] = films[index];
            }
            return resultLength;
        }
    }
}


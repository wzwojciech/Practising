package org.example;

public class Game {
    String title;
    int year;

    public Game(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}

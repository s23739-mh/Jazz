package pj.pjatk.movie.classes;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Movie {

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public filmCategory getCategory() {
        return category;
    }

    public void setCategory(filmCategory category) {
        this.category = category;
    }

    private Integer ID;
    private String name;
    private int year;
    private filmCategory category;

    public enum filmCategory{
        ACTION,
        FANTASY,
        COMEDY,
        ROMANCE,
        DEATH
    }

    public Movie(Integer ID, String name, int year, filmCategory category) {
        this.ID = ID;
        this.name = name;
        this.year = year;
        this.category=category;
    }
}

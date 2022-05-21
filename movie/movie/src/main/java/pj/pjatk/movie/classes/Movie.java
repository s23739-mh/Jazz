package pj.pjatk.movie.classes;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer ID;
    @Column
    private String NAME;
    @Column
    private int MINIMUM_AGE;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('ACTION', 'FANTASY', 'COMEDY', 'ROMANCE','DEATH")
    private filmCategory CATEGORY;

    public Movie() {

    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String name) {
        this.NAME = name;
    }

    public int getMINIMUM_AGE() {
        return MINIMUM_AGE;
    }

    public void setMINIMUM_AGE(int year) {
        this.MINIMUM_AGE = year;
    }

    public filmCategory getCATEGORY() {
        return CATEGORY;
    }

    public void setCATEGORY(filmCategory category) {
        this.CATEGORY = category;
    }

    public enum filmCategory {
        ACTION,
        FANTASY,
        COMEDY,
        ROMANCE,
        DEATH
    }

    public Movie(Integer ID, String name, int year, filmCategory category) {
        this.ID = ID;
        this.NAME = name;
        this.MINIMUM_AGE = year;
        this.CATEGORY = category;
    }
}

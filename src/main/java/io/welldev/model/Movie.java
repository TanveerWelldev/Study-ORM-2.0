package io.welldev.model;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @ManyToMany
    @JoinTable(name = "movie_genre",
            joinColumns = { @JoinColumn(name = "fk_movie") },
            inverseJoinColumns = { @JoinColumn(name = "fk_genre") })
    private Set<Genre> genres = new HashSet<Genre>();
    private String rating;
    @ManyToOne
    @JoinColumn(name = "fk_director")
    private Director director;

    @ManyToMany
    @JoinTable(name = "movie_actors",
            joinColumns = { @JoinColumn(name = "fk_movie") },
            inverseJoinColumns = { @JoinColumn(name = "fk_actor") })
    private Set<Actor> actors = new HashSet<Actor>();

    private int year;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }
}

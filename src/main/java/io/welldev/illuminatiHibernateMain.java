package io.welldev;

import io.welldev.dao.*;

import io.welldev.model.Actor;
import io.welldev.model.Director;
import io.welldev.model.Genre;
import io.welldev.model.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class illuminatiHibernateMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("io.welldev.config");

        ActorDAO actorDAO = context.getBean(ActorDAO.class);
        DirectorDAO directorDAO = context.getBean(DirectorDAO.class);
        ExtendedDirectorDAO extendedDirectorDAO = context.getBean(ExtendedDirectorDAO.class);
        GenreDAO genreDAO = context.getBean(GenreDAO.class);
        MovieDAO movieDAO = context.getBean(MovieDAO.class);



        List<Genre> genreList = Arrays.asList(
                new Genre("Crime"),
                new Genre("Mystery")
        );
        List<Actor> actorList = Arrays.asList(
                new Actor("Brad Pitt"),
                new Actor("Morgan Freeman"),
                new Actor("Kevin Spacey"),
                new Actor("Gwyneth Paltrow")
        );

        actorDAO.addAll(actorList);

        genreDAO.addAll(genreList);
        Director director = new Director("David Fincher");

        directorDAO.add(director);

        Movie movie = new Movie("Se7en", new HashSet<Genre>(genreList),
                "R", director, new HashSet<Actor>(actorList), 1995);

        movieDAO.add(movie);













    }
}

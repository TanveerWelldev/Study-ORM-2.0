package io.welldev;

import io.welldev.dao.ActorDAO;

import io.welldev.dao.DirectorDAO;
import io.welldev.dao.GenreDAO;
import io.welldev.dao.MovieDAO;
import io.welldev.model.Actor;
import io.welldev.model.Director;
import io.welldev.model.Genre;
import io.welldev.model.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.HashSet;

public class illuminatiHibernateMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("io.welldev.config");

        ActorDAO actorDAO = context.getBean(ActorDAO.class);
        DirectorDAO directorDAO = context.getBean(DirectorDAO.class);
        GenreDAO genreDAO = context.getBean(GenreDAO.class);
        MovieDAO movieDAO = context.getBean(MovieDAO.class);

//        Movie movie = new Movie("Atomic Blonde", new HashSet<>()
//                .addAll(Arrays.asList(
//                        new Genre("")
//                )))









    }
}

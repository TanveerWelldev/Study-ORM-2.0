package io.welldev;

import io.welldev.dao.*;

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
        ExtendedDirectorDAO extendedDirectorDAO = context.getBean(ExtendedDirectorDAO.class);
        GenreDAO genreDAO = context.getBean(GenreDAO.class);
        MovieDAO movieDAO = context.getBean(MovieDAO.class);

        Actor actor = new Actor("Brad Pitt");
        Actor actor1 = new Actor("Morgan Freeman");
        Actor actor2 = new Actor("Kevin Spacey");
        Actor actor3 = new Actor("Gwyneth Paltrow");

        Movie movie = new Movie("Se7en", new HashSet<>().addAll(Arrays.asList(new Genre("Crime"), new Genre("Mystery")))

        ))













    }
}

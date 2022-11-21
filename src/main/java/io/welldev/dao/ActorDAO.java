package io.welldev.dao;

import io.welldev.model.Actor;
import io.welldev.model.Movie;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Component
@Transactional
public class ActorDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void add(Actor actor) {
        entityManager.persist(actor);
    }

    public Actor get(Long id) {
        return entityManager.find(Actor.class, id);
    }

    public void delete(Actor actor) {
        entityManager.remove(actor);
    }

    public List<Actor> getAll() {
        List<Actor> resultList = entityManager.createQuery("from Actor").getResultList();

        return resultList;
    }

    public void update(Actor actor) {
        entityManager.merge(actor);
    }
}

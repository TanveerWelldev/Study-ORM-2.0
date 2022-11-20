package io.welldev.dao;

import io.welldev.model.Illuminati;

import java.util.List;

public interface IlluminatiDAO {

    public void insertIlluminati(Illuminati illuminati);

    public List<Illuminati> listIlluminati();
}

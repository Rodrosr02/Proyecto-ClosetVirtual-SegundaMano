package com.mercadoprendas.usuario.service;

import com.mercadoprendas.usuario.domain.Publicacion;
import java.util.List;

public interface IPublicacionService {
    void create(Publicacion publicacion);
    List<Publicacion> selectAll();
    Publicacion selectById(int id);
    boolean update(Publicacion publicacion);
    boolean delete(int id);
}
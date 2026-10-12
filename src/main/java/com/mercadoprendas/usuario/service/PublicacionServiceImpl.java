package com.mercadoprendas.usuario.service;

import com.mercadoprendas.usuario.domain.Publicacion;
import java.util.ArrayList;
import java.util.List;

public class PublicacionServiceImpl implements IPublicacionService {

    // Lista simulada en memoria para gestionar las publicaciones
    private List<Publicacion> listaPublicaciones = new ArrayList<>();

    @Override
    public void create(Publicacion publicacion) {
        listaPublicaciones.add(publicacion);
        System.out.println("Publicación registrada con éxito.");
    }

    @Override
    public List<Publicacion> selectAll() {
        return listaPublicaciones;
    }

    @Override
    public Publicacion selectById(int id) {
        for (Publicacion pub : listaPublicaciones) {
            if (pub.getIdPublicacion() == id) {
                return pub;
            }
        }
        return null;
    }

    @Override
    public boolean update(Publicacion publicacionActualizada) {
        for (int i = 0; i < listaPublicaciones.size(); i++) {
            if (listaPublicaciones.get(i).getIdPublicacion() == publicacionActualizada.getIdPublicacion()) {
                listaPublicaciones.set(i, publicacionActualizada);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        return listaPublicaciones.removeIf(pub -> pub.getIdPublicacion() == id);
    }
}
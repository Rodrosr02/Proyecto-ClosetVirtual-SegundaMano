package com.mercadoprendas.usuario;

import com.mercadoprendas.usuario.Usuario;
import com.mercadoprendas.prenda.Prenda;
import java.util.Date;

public class Publicacion {

    private int idPublicacion;
    private Usuario usuario;
    private Prenda prenda;
    private Date fechaPublicacion;
    private String estadoPublicacion;

    public Publicacion() {
    }

    public Publicacion(int idPublicacion, Usuario usuario, Prenda prenda,
                       Date fechaPublicacion, String estadoPublicacion) {
        this.idPublicacion = idPublicacion;
        this.usuario = usuario;
        this.prenda = prenda;
        this.fechaPublicacion = fechaPublicacion;
        this.estadoPublicacion = estadoPublicacion;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEstadoPublicacion() {
        return estadoPublicacion;
    }

    public void setEstadoPublicacion(String estadoPublicacion) {
        this.estadoPublicacion = estadoPublicacion;
    }

    public void create() {
    }

    public void selectAll() {
    }

    public void selectById(int id) {
    }

    public void update(int id) {
    }

    public void delete(int id) {
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "idPublicacion=" + idPublicacion +
                ", usuario=" + usuario +
                ", prenda=" + prenda +
                ", fechaPublicacion=" + fechaPublicacion +
                ", estadoPublicacion='" + estadoPublicacion + '\'' +
                '}';
    }
}

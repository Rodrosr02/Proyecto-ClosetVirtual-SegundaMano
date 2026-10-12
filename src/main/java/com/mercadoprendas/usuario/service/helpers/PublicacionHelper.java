package com.mercadoprendas.usuario.service.helpers;

public class PublicacionHelper {

    // Valida que el estado de la publicación no esté vacío o en blanco
    public static boolean validarEstado(String estado) {
        if (estado == null || estado.trim().isEmpty()) {
            System.out.println("Error: El estado de la publicación no puede estar vacío.");
            return false;
        }
        return true;
    }

    // Valida que el ID sea mayor a cero
    public static boolean validarId(int id) {
        if (id <= 0) {
            System.out.println("Error: El ID debe ser un número entero mayor a 0.");
            return false;
        }
        return true;
    }
}
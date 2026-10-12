package com.mercadoprendas.usuario.view;

import com.mercadoprendas.usuario.domain.Publicacion;
import com.mercadoprendas.usuario.service.IPublicacionService;
import com.mercadoprendas.usuario.service.PublicacionServiceImpl;
import com.mercadoprendas.usuario.service.helpers.PublicacionHelper;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PublicacionView {

    private final IPublicacionService publicacionService;
    private final Scanner scanner;

    public PublicacionView() {
        this.publicacionService = new PublicacionServiceImpl();
        this.scanner = new Scanner(System.in);
    }

    public void menuPublicacion() {
        int opcion;
        do {
            System.out.println("\n===== GESTIÓN DE PUBLICACIONES =====");
            System.out.println("1. Crear publicación");
            System.out.println("2. Listar todas las publicaciones");
            System.out.println("3. Buscar publicación por ID");
            System.out.println("4. Eliminar publicación");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearNuevaPublicacion();
                    break;
                case 2:
                    listarTodas();
                    break;
                case 3:
                    buscarPorId();
                    break;
                case 4:
                    eliminarPublicacion();
                    break;
                case 5:
                    System.out.println("Saliendo del módulo de publicaciones...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    private void crearNuevaPublicacion() {
        System.out.println("\n--- Crear Nueva Publicación ---");

        int id = 0;
        while (true) {
            System.out.print("Ingrese ID de la Publicación (número positivo): ");
            if (scanner.hasNextInt()) {
                id = scanner.nextInt();
                scanner.nextLine();
                if (PublicacionHelper.validarId(id)) {
                    break;
                }
            } else {
                System.out.println("Error: Debe ingresar un número entero válido.");
                scanner.next();
            }
        }

        String estado;
        while (true) {
            System.out.print("Ingrese Estado de la Publicación (ej: Disponible / Vendido): ");
            estado = scanner.nextLine();
            if (PublicacionHelper.validarEstado(estado)) {
                break;
            }
        }

        Publicacion nuevaPublicacion = new Publicacion(id, null, null, new Date(), estado);
        publicacionService.create(nuevaPublicacion);
    }

    private void listarTodas() {
        System.out.println("\n--- Lista de Publicaciones ---");
        List<Publicacion> publicaciones = publicacionService.selectAll();
        if (publicaciones.isEmpty()) {
            System.out.println("No hay publicaciones registradas.");
        } else {
            for (Publicacion p : publicaciones) {
                System.out.println(p);
            }
        }
    }

    private void buscarPorId() {
        System.out.print("\nIngrese ID de la publicación a buscar: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Ingrese un número de ID válido.");
            scanner.next();
            System.out.print("Ingrese ID de la publicación a buscar: ");
        }
        int id = scanner.nextInt();
        scanner.nextLine();

        Publicacion pub = publicacionService.selectById(id);
        if (pub != null) {
            System.out.println("Publicación encontrada: " + pub);
        } else {
            System.out.println("No se encontró ninguna publicación con el ID " + id);
        }
    }

    private void eliminarPublicacion() {
        System.out.print("\nIngrese ID de la publicación a eliminar: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Ingrese un número de ID válido.");
            scanner.next();
            System.out.print("Ingrese ID de la publicación a eliminar: ");
        }
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean eliminado = publicacionService.delete(id);
        if (eliminado) {
            System.out.println("Publicación eliminada correctamente.");
        } else {
            System.out.println("No se encontró la publicación a eliminar.");
        }
    }
}
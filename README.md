Prendas Segunda Mano
(Cascarón inicial)
===

Creación de cascarón de clases generado en base al diagrama UML para un aplicativo orientado al comercio de prendas de segunda mano.


## Estructura del proyecto

```
src/main/java/com/mercadoprendas/
├── usuario/
│   └── Usuario.java
├── perfil/
│   └── Perfil.java        (extiende Usuario)
├── prenda/
│   └── Prenda.java         (usa Categoria)
├── categoria/
│   └── Categoria.java
└── publicacion/
    └── Publicacion.java     (usa Usuario y Prenda)
```

## Detalles de diseño

* Cada clase se ubicó en su propio paquete/carpeta, tal como se pidió.
* Todos los atributos son privados, con sus respectivos **getters y setters**.
* Se incluyeron los métodos del diagrama como cascarón (`create`, `selectAll`,
`selectById(int id)`, `update(int id)`, `delete(int id)`), listos para
implementar la lógica de persistencia (JDBC, JPA, etc.).
* `Perfil` extiende de `Usuario` (herencia), tal como indica el diagrama.
* `Prenda` referencia a `Categoria` (composición).
* `Publicacion` referencia a `Usuario` y a `Prenda`.
* Se agregó un constructor vacío y uno con todos los parámetros en cada clase,
además de un `toString()` para facilitar la depuración.

## Próximos pasos sugeridos

1. Definir la capa de persistencia (DAO/Repository) y conectar los métodos
`create`, `selectAll`, `selectById`, `update`, `delete` a una base de datos.
2. Decidir si los métodos de consulta (`selectAll`, `selectById`) deberían
devolver datos (por ejemplo `List<Usuario>` o `Usuario`) en lugar de `void`,
ya que en el diagrama original están definidos como `void`.
3. Agregar validaciones (por ejemplo, formato de correo, contraseña segura).
4. Evaluar el uso de un framework como Spring Boot para exponer estas
entidades como una API REST.

## Compilar el proyecto

```bash
mvn compile
```


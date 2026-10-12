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


# Proyecto API REST de Gestión Académica

Este proyecto consiste en el desarrollo de una API REST para la gestión académica de una institución educativa. Incluye funcionalidades CRUD para entidades como estudiantes, materias, paralelos, inscripciones y autenticación de usuarios mediante JWT.

## Estructura del Código Fuente

```
controller/
- Contiene los controladores REST que reciben peticiones HTTP (GET, POST, etc.).
- Usan anotaciones como @RestController y @RequestMapping.
- Se encargan de interactuar con la capa de servicio.
- Devuelven respuestas en formato JSON.
- Sirven como punto de entrada a la API.

service/
- Define la lógica de negocio de la aplicación.
- Las clases de esta capa procesan datos antes de enviarlos al repositorio o al controlador.
- Se anotan con @Service.
- Actúan como intermediarios entre controlador y repositorio.
- Permiten centralizar la lógica y facilitar pruebas unitarias.

model/
- Contiene las entidades JPA que representan las tablas de la base de datos.
- Cada clase suele tener anotaciones como @Entity, @Id y @Column.
- Define las relaciones entre tablas (@OneToMany, @ManyToOne, etc.).
- Modela los datos persistentes del sistema.
- Es usada por la capa de repositorio.

registro/
- Maneja procesos de registro de usuarios.
- Contiene controladores, servicios y DTOs específicos para el registro.
- Vinculado a validaciones de formularios de alta.
- Gestiona los flujos de creación de cuentas o formularios iniciales.

repository/
- Define interfaces que acceden a la base de datos (e.g., UsuarioRepository).
- Extienden JpaRepository, CrudRepository u otros.
- Permiten consultas automáticas por nombre (findByEmail, etc.).
- Separan el acceso a datos de la lógica de negocio.

dto/
- Agrupa clases que sirven para transportar datos entre capas.
- No contienen lógica de negocio ni están mapeadas a la BD.
- Ayudan a evitar exponer entidades directamente al cliente.

validation/
- Contiene clases o anotaciones personalizadas para validar datos.
- Se usa junto con @Valid o @Validated en controladores.
- Incluye lógica para validar contraseñas, correos, etc.

config/
- Aloja clases que configuran aspectos globales del proyecto.
- Puede incluir seguridad (Spring Security), CORS, beans personalizados.
- Se anotan con @Configuration.
```

## Pruebas de Funcionamiento

Para verificar los endpoints se utilizó **Swagger UI**. La interfaz queda disponible en:
```
http://localhost:8080/swagger-ui/index.html
```
Desde allí se probaron operaciones CRUD para todas las entidades principales, garantizando respuestas JSON correctas.

## Base de Datos

La estructura de la base de datos se generó automáticamente con Spring Boot. Incluye tablas como:
- PERSONA, ESTUDIANTE, DOCENTE, ROL, USUARIO, MATERIA, MENCION, MATERIA_MENCION, PARALELO, INSCRIPCION, EVALUACION, NOTA.

El script de inicialización se encuentra en `CodigoBD.sql`.

# **API de Gestión de Tareas**

Esta API está diseñada para gestionar tareas de manera eficiente, proporcionando las siguientes operaciones básicas:

- **Listar Tareas**: Recupera todas las tareas disponibles.
- **Buscar Tareas**: Encuentra una tarea específica mediante su ID.
- **Agregar Tareas**: Crea nuevas tareas con un título, descripción y estado inicial.
- **Actualizar Tareas**: Modifica los detalles de una tarea existente, incluido su estado.
- **Eliminar Tareas**: Elimina una tarea específica mediante su ID.

### **Propósito**
Este sistema es ideal para el manejo de listas de tareas en proyectos personales, educativos o profesionales. Simplifica la gestión de actividades al ofrecer una interfaz RESTful clara y fácil de usar.

### **Características Técnicas**
- **Lenguaje**: Java con Spring Boot.
- **Base de Datos**: MySQL para almacenamiento de datos.
- **Arquitectura**: Modelo-Vista-Controlador (MVC).
- **Endpoints RESTful**:
  - `GET /tasks` - Listar todas las tareas.
  - `POST /tasks` - Agregar una nueva tarea.
  - `PUT /tasks/{id}` - Actualizar una tarea existente.
  - `DELETE /tasks/{id}` - Eliminar una tarea por ID.
##

##
Requisitos Tecnicos
##
- **JDK 21.0.2**
- **Gradle 8.12.1**
- **Conexion a internet(para la Base de datos)**

##
###  **Documentacion**
- **Swagger**: http://localhost:8080/swagger-ui/index.html#/

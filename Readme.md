# TOPDECK

## Descripcion

### Prerrequisitos 📋
Para instalar y ejecutar este proyecto, necesitarás asegurarte de contar con las siguientes herramientas y software, junto con las versiones específicas indicadas:
- Oracle
- Java
- Springboot

### Instalación 🔧
A continuación, se presenta una guía paso a paso para configurar el entorno de desarrollo y realizar la instalación de todas las dependencias necesarias:
1. Clona el repositorio del backend
  - https://github.com/Deimonlay13/topDeck.git

## Ejecutando las Pruebas ⚙
  *Rutas Stage*
- GET: Devuelve todos los Stage.
  - http://localhost:8090/api/stage
- POST: Recibe los datos de un nuevo Stage y los almacena en la BBDD.
  - http://localhost:8090/api/stage
- DELETE: Recibe el id de un Stage registrado y lo elimina.
  - http://localhost:8090/api/stage?id=da13038a-a845-46da-a5e3-af8755d3ec31
- PUT: Recibe los datos de un Stage registrado y los actualiza.
  - http://localhost:8090/api/stage?id=da13038a-a845-46da-a5e3-af8755d3ec31
- GETALL: Recibe todos los Stage registrado.
  - http://localhost:8090/api/stage?id=da13038a-a845-46da-a5e3-af8755d3ec31

*Rutas Edicion*
- GETBYID: Devuelve una Edicion por Id.
  - http://localhost:8091/api/edicion/getById/
- POST: Recibe los datos de una nueva edicion y los almacena en la BBDD.
  - http://localhost:8091/api/edicion/insert
- DELETE: Recibe el id de una Edicion registrado y lo elimina.
  - http://localhost:8091/api/edicion/delete/{id}
- PUT: Recibe los datos de una Edicion registrado y los actualiza.
  - http://localhost:8091/api/edicion/update/{id}
- GETALL: Recibe todos los Edicion registrado.
  - http://localhost:8091/api/edicion

## Construido Con 🛠
- [Java](https://www.java.com/es/) - El lenguaje utilizado
- [Oracle](https://www.oracle.com/) - Sistema de base de datos
- [Springboot](https://spring.io/projects/spring-boot) - Framework de Java

## Versionado 📌

Usamos [Git](https://git-scm.com) para el versionado.

⌨ con ❤ por [Geraldine Becerra](https://github.com/andgerald),
[Luis Muñoz](https://github.com/Luis-Munoz-soto),
[Diego Pizarro](https://github.com/Deimonlay13)

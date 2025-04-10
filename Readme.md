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

*Rutas Condicion*
- GET: Devuelve la condicion segun el ID.
  - http://localhost:8010/api/condicion/getById/6d3dc4b7-eccb-4f10-8241-b0351eaea657
- POST: Recibe los datos de una Condicion y los almacena en la BBDD.
  - http://localhost:8010/api/condicion/insert
- DELETE: Recibe el id de una Condicion registrada y la elimina.
  - http://localhost:8010/api/condicion/delete/dcddccc7-b160-4bb6-a481-abce8a6c57f3
- PUT: Recibe los datos de una Condicion registrada y los actualiza.
  - http://localhost:8010/api/condicion/update/6d3dc4b7-eccb-4f10-8241-b0351eaea657
- GETALL: Recibe todas las Condiciones registradas.
  - http://localhost:8010/api/condicion

## Construido Con 🛠
- [Java](https://www.java.com/es/) - El lenguaje utilizado
- [Oracle](https://www.oracle.com/) - Sistema de base de datos
- [Springboot](https://spring.io/projects/spring-boot) - Framework de Java

## Versionado 📌

Usamos [Git](https://git-scm.com) para el versionado.

⌨ con ❤ por [Geraldine Becerra](https://github.com/andgerald),
[Luis Muñoz](https://github.com/Luis-Munoz-soto),
[Diego Pizarro](https://github.com/Deimonlay13)

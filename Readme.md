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


  *Rutas Tipo*
- GET: Devuelve todos los Tipos.
  - http://localhost:8092/api/tipo/getbyid/ec418962-c43b-4485-8da0-fb1ffaf1be38
- POST: Recibe los datos de un nuevo Tipo y los almacena en la BBDD.
  - http://localhost:8092/api/tipo/insert
- DELETE: Recibe el id de un Tipo registrado y lo elimina.
  - http://localhost:8092/api/tipo/delete/ec418962-c43b-4485-8da0-fb1ffaf1be38
- PUT: Recibe los datos de un Tipo registrado y los actualiza.
  - http://localhost:8092/api/tipo/update/21073bb9-7b82-4291-8cdf-a26e77b25144
- GETALL: Recibe todos los Stage registrado.
  - http://localhost:8092/api/tipo


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

*Rutas Energia*
- GET: Devuelve la Energia segun el ID.
  - http://localhost:8096/api/energia/getbyid/34d85e47-8930-4095-8142-ac8b9a788cc3
- POST: Recibe los datos de una Energia y los almacena en la BBDD.
  - http://localhost:8096/api/energia/insert
- DELETE: Recibe el id de una CoEnergia registrada y la elimina.
  - http://localhost:8096/api/energia/delete/83d90ca5-87b6-4b9b-82b8-db771e809203
- PUT: Recibe los datos de una Energia registrada y los actualiza.
  - http://localhost:8096/api/energia/update/34d85e47-8930-4095-8142-ac8b9a788cc3
- GETALL: Recibe todas las Energias registradas.
  - http://localhost:8096/api/energia

*Rutas Categoria*
- GET: Devuelve la Categoria segun el ID.
  - http://localhost:8094/api/categoria/getbyid/f88f34b8-c0be-4443-afec-c04b47bf9705
- POST: Recibe los datos de una Categoria y los almacena en la BBDD.
  - http://localhost:8094/api/categoria/insert
- DELETE: Recibe el id de una Categoria registrada y la elimina.
  - http://localhost:8094/api/categoria/delete/f88f34b8-c0be-4443-afec-c04b47bf9705
- PUT: Recibe los datos de una Categoria registrada y los actualiza.
  - http://localhost:8094/api/categoria/update/f88f34b8-c0be-4443-afec-c04b47bf9705
- GETALL: Recibe todas las Categoria registradas.
  - http://localhost:8094/api/categoria

*Rutas Categoria*
- GET: Devuelve la Regiones segun el ID.
  - http://localhost:8071/api/region/getbyid/524e7bc6-8894-40b7-b1b5-3854fde0a4b9
- POST: Recibe los datos de una Region y los almacena en la BBDD.
  - http://localhost:8071/api/region/insert
- DELETE: Recibe el id de una Region registrada y la elimina.
  - http://localhost:8071/api/region/delete/5d45279b-dac0-4330-af8b-f5716a52cfcd
- PUT: Recibe los datos de una Region registrada y los actualiza.
  - http://localhost:8071/api/region/update/5d45279b-dac0-4330-af8b-f5716a52cfcd
- GETALL: Recibe todas las Region registradas.
  - http://localhost:8071/api/region



## Construido Con 🛠
- [Java](https://www.java.com/es/) - El lenguaje utilizado
- [Oracle](https://www.oracle.com/) - Sistema de base de datos
- [Springboot](https://spring.io/projects/spring-boot) - Framework de Java

## Versionado 📌

Usamos [Git](https://git-scm.com) para el versionado.

⌨ con ❤ por [Geraldine Becerra](https://github.com/andgerald),
[Luis Muñoz](https://github.com/Luis-Munoz-soto),
[Diego Pizarro](https://github.com/Deimonlay13)

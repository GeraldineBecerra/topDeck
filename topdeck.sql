
CREATE TABLE stage(
    id_stage RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    stage VARCHAR(20) NOT NULL
)

CREATE TABLE edicion(
    id_edicion RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    edicion VARCHAR(20) NOT NULL
)

CREATE TABLE tipo(
    id_tipo RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    tipo VARCHAR(20) NOT NULL
)

CREATE TABLE condicion(
    id_condicion RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    condicion VARCHAR(20) NOT NULL
)

CREATE TABLE categoria(
    id_categoria RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    categoria VARCHAR(20) NOT NULL
)

CREATE TABLE rareza(
    id_rareza RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    rareza VARCHAR(20) NOT NULL
)

CREATE TABLE energia(
    id_energia RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    energia VARCHAR(20) NOT NULL
)

CREATE TABLE idioma(
    id_idioma RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    idioma VARCHAR(20) NOT NULL
)

CREATE TABLE marca(
    id_marca RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    marca VARCHAR(20) NOT NULL
)

CREATE TABLE medio_de_pago(
    id_medio_de_pago RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    medio_de_pago VARCHAR(20) NOT NULL
)

CREATE TABLE region(
    id_region RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    region VARCHAR(20) NOT NULL
)

CREATE TABLE estado(
    id_estado RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    estado VARCHAR(20) NOT NULL
)

CREATE TABLE COMUNA (
    id_comuna RAW(16) DEFAULT SYS_GUID() NOT NULL,
    nombre_comuna VARCHAR2(30) NOT NULL,
    CONSTRAINT PK_COMUNA PRIMARY KEY (id_comuna),
    CONSTRAINT UQ_COMUNA_NOMBRE UNIQUE (nombre_comuna)
);

CREATE TABLE rol(
    id_rol RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    rol VARCHAR(20) NOT NULL
    descripcion VARCHAR(255) NOT NULL
    disabled boolean 
)

CREATE TABLE persona(
    id_persona RAW(16) DEFAULT SYS_GUID() PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    apellidos VARCHAR(20) NOT NULL,
    email VARCHAR(20) NOT NULL,
    contrasena VARCHAR(20) NOT NULL,
    telefono VARCHAR(20) NOT NULL
    token VARCHAR(20) NOT NULL
)
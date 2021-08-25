CREATE TABLE estadoOrdenes(
-- OneToMany()
    idEstadoOrden int not null,
    estadoOrden varchar(100)

    primary key(idEstadoOrden)
);

CREATE TABLE ordenes(
    idOrden int not null AUTO_INCREMENT,
    fechaOrden DATETIME,
    idCliente int not null,
    idEstadoOrden int not null,

    primary key(idOrden),
    foreign key(idCliente) REFERENCES clientes (idCliente),
    foreign key(idEstadoOrden) REFERENCES estadoOrdenes(idEstadoOrden)
);

CREATE TABLE ordenesEnCurso(
    idOrdenEnCurso int not null AUTO_INCREMENT,
    idOrden int not null,
);

CREATE TABLE repartidores(
    idRepartidor int not null,
    nombreRepartidor varchar(255),
    correoRepartidor varchar(100),

    primary key(idRepartidor)
);

CREATE TABLE repartidorZonaEntregas(
   idRepartidorZonaEntrega int not null AUTO_INCREMENT,
-- @ManyToOne
   idRepartidor int not null,
   idMunicipioZona int not null,
   latitudRepartidorZona decimal(10, 8),
   longitudRepartidorZona decimal(10, 8),
   ocupado boolean,

   PRIMARY key(idRepartidorZona)
);

CREATE TABLE ubicacionesRepartidores(
    idUbicacionRepartidor int not null AUTO_INCREMENT,
    latitud decimal(10, 8),
    longitud decimal(10, 8),

);

CREATE TABLE ordenesEntregas(
idOrdenEntrega,

);

CREATE TABLE clientes(
    idCliente int not null AUTO_INCREMENT,
    nombreCliente VARCHAR(255),
    correoCliente varchar(100),

    PRIMARY KEY(idCliente)
);

CREATE TABLE municipios(
    idMunicipio int not null AUTO_INCREMENT,
    nombreMunicipio varchar(100),

    primary key(idMunicipio)
);

CREATE TABLE municipioZonas(
    idMunicipioZona int not null AUTO_INCREMENT,
    zona TINYINT,
    idMunicipio int not null,

    primary key(idMunicipioZona),
    foreign key(idMunicipio) references municipios(idMunicipio)
);

CREATE TABLE direccionesClientes(
    idDireccionCliente int not null AUTO_INCREMENT,
    direccionCliente int not null,
    idCliente int not null,
    idMunicipio int not null,

    primary key(idDireccionCliente),
    foreign key(idCliente) references clientes(idCliente),
    foreign key(idMunicipio) REFERENCES municipios(idMunicipio)
);
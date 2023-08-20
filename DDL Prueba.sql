CREATE SCHEMA sistema_votaciones AUTHORIZATION postgres;

CREATE TABLE sistema_votaciones.votante (
                                            dpi numeric(13) NOT NULL,
                                            no_empradronamiento varchar(50) NOT NULL,
                                            domicilio varchar(200) NOT NULL,
                                            estado_votacion bool NOT NULL,
                                            etnia varchar(30) NOT NULL,
                                            analfabeta bool NOT NULL,
                                            discapacidad varchar(100) NULL,
                                            CONSTRAINT votante_pkey PRIMARY KEY (dpi)
);

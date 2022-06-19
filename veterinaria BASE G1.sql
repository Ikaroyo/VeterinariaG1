-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-06-2022 a las 23:45:06
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `veterinaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` tinyint(4) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `nombre_duenio` varchar(30) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `contacto_alternativo` varchar(20) DEFAULT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `dni`, `apellido`, `nombre_duenio`, `direccion`, `telefono`, `contacto_alternativo`, `activo`) VALUES
(1, 23456789, 'Francella', 'Guillermo', 'Avenida Siempre viva 123', '12345678', 'Pedrito rulito', 1),
(2, 13690269, 'Martinez', 'Hector Antonio', 'Juan Gilberto Funes 178 (Cerro de Oro)', '266450330', 'Liliana', 1),
(3, 12592708, 'Arias', 'Lidia', 'Cipres 12', '473330', 'no tiene', 1),
(4, 9530567, 'Fiorentino', 'Gilda', 'Los Cesares 20 ', '1145903478', 'Hector', 1),
(5, 25678234, 'Borrello', 'Barbara', 'Sarmiento 4206', '456789', '', 1),
(6, 5530976, 'Borrello', 'Hector', 'Avenida Los Incas 425', '266470842', 'Pancho', 1),
(7, 23567456, 'Saez', 'Juan Jose', 'Juan de Azurduy 2920', '423678', 'Michi', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `id_mascota` tinyint(4) NOT NULL,
  `alias` varchar(20) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `especie` varchar(15) NOT NULL,
  `raza` varchar(15) NOT NULL,
  `color_pelaje` varchar(40) NOT NULL,
  `fecha_nac` date NOT NULL,
  `peso_actual` double NOT NULL,
  `id_cliente` tinyint(4) NOT NULL,
  `peso_promedio` double NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`id_mascota`, `alias`, `sexo`, `especie`, `raza`, `color_pelaje`, `fecha_nac`, `peso_actual`, `id_cliente`, `peso_promedio`, `activo`) VALUES
(1, 'Pedro', 'macho', 'perro', 'golden', 'dorado', '2020-04-29', 40, 2, 50.5, 1),
(2, 'Lola', 'hembra', 'perro', 'shitsu', 'blanco', '2015-06-23', 7, 5, 7.5, 1),
(3, 'Tincho', 'macho', 'gato', 'angora', 'negro y marron', '2012-03-12', 7, 5, 7.5, 1),
(4, 'Pablo', 'macho', 'gato', 'siames', 'negro', '2016-03-12', 5, 1, 4.5, 1),
(5, 'JuanJo', 'hembra', 'perro', 'bul dog frances', 'gris attigrado', '2021-03-12', 15.6, 2, 16.5, 1),
(6, 'Sasha', 'macho', 'perro', 'pitbull', 'negro y marron', '2010-03-12', 35, 3, 38.5, 1),
(7, 'Mabel', 'hembra', 'gato', 'persa', 'blanco y gris', '2022-03-12', 7, 6, 6.5, 1),
(8, 'Fran', 'macho', 'gato', 'tricolor', 'tricolor/ BNG', '2017-03-12', 7, 7, 7.5, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `id_tratamiento` tinyint(4) NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `medicamento` varchar(40) DEFAULT NULL,
  `importe` double NOT NULL,
  `activo` tinyint(1) NOT NULL,
  `tipo_tratamiento` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`id_tratamiento`, `descripcion`, `medicamento`, `importe`, `activo`, `tipo_tratamiento`) VALUES
(1, ' se aplica una dosis', 'antirrabica', 1900, 1, 'Vacunacion'),
(2, 'se aplica una dosis', 'quintuple', 1800, 1, 'Vacunacion'),
(3, ' hongos en las orejas', 'gotas Otovier NF', 590, 1, 'Enfermedad'),
(4, 'ataque de jabali', 'antibiticos / analgesicos ', 3500, 1, 'Curaciones'),
(5, 'Baño y Corte de Pelo', ' ', 1500, 1, 'Estetica'),
(6, 'tamaño medio: se retiran solo ovarios', ' material quirurjico y analgesicos ', 6700, 1, 'Castracion'),
(7, '1 sola toma, cada 6 meses en adultos', ' triplex comprimidos ', 170, 1, 'Desparacitacion');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita`
--

CREATE TABLE `visita` (
  `id_visita` tinyint(4) NOT NULL,
  `id_tratamiento` tinyint(4) NOT NULL,
  `fecha_visita` date NOT NULL,
  `id_mascota` tinyint(4) NOT NULL,
  `peso` double NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `visita`
--

INSERT INTO `visita` (`id_visita`, `id_tratamiento`, `fecha_visita`, `id_mascota`, `peso`, `activo`) VALUES
(1, 1, '2020-04-29', 5, 5.7, 1),
(2, 5, '2022-08-13', 5, 29.8, 1),
(3, 1, '2020-04-30', 6, 32.8, 1),
(4, 3, '2019-09-12', 3, 15.7, 1),
(5, 2, '2012-09-01', 1, 3.7, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`id_mascota`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`id_tratamiento`);

--
-- Indices de la tabla `visita`
--
ALTER TABLE `visita`
  ADD PRIMARY KEY (`id_visita`),
  ADD KEY `id_mascota` (`id_mascota`),
  ADD KEY `id_tratamiento` (`id_tratamiento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `id_mascota` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `id_tratamiento` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `visita`
--
ALTER TABLE `visita`
  MODIFY `id_visita` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);

--
-- Filtros para la tabla `visita`
--
ALTER TABLE `visita`
  ADD CONSTRAINT `visita_ibfk_1` FOREIGN KEY (`id_mascota`) REFERENCES `mascota` (`id_mascota`),
  ADD CONSTRAINT `visita_ibfk_2` FOREIGN KEY (`id_tratamiento`) REFERENCES `tratamiento` (`id_tratamiento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

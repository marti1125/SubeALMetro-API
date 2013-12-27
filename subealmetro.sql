-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 26-12-2013 a las 18:20:28
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

use subealmetro;

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `subealmetro`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `distrito`
--

CREATE TABLE IF NOT EXISTS `Distrito` (
  `codigoPostal` varchar(255) NOT NULL,
  `nombreDelDistrito` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigoPostal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estacion`
--

CREATE TABLE IF NOT EXISTS `Estacion` (
  `codigo` varchar(255) NOT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `nombreEstacion` varchar(255) DEFAULT NULL,
  `posicionLatitud` double NOT NULL,
  `posicionLongitud` double NOT NULL,
  `distrito_codigoPostal` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FK8E955F00EFA42CA7` (`distrito_codigoPostal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario`
--

CREATE TABLE IF NOT EXISTS `Horario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `domingosYFeriados` bit(1) NOT NULL,
  `lunesAViernes` bit(1) NOT NULL,
  `rumboAGrau` varchar(255) DEFAULT NULL,
  `rumboAVes` varchar(255) DEFAULT NULL,
  `sabados` bit(1) NOT NULL,
  `estacion_codigo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKA49EDFC211C006DC` (`estacion_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `Usuario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `clave` varchar(255) DEFAULT NULL,
  `esAdministrador` bit(1) NOT NULL,
  `nombreCompleto` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;
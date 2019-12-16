-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 16, 2019 at 05:15 PM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inscription`
--

--
-- Dumping data for table `departement`
--

INSERT INTO `departement` (`id`, `abreviation`, `libelle`, `responsable`) VALUES
(6, 'Chim', 'Chimie', NULL),
(7, 'PhyApp', 'Physique Appliquée', NULL),
(8, 'Info', 'Informatique', NULL),
(9, 'Bio', 'Biologie', NULL);

--
-- Dumping data for table `etudiant`
--

INSERT INTO `etudiant` (`id`, `adresse`, `cne`, `cni`, `date_naissance`, `nom`, `prenom`, `ville`) VALUES
(12, ' Av MED 6 Rue 15', 'a123', 'ee1452', NULL, 'ahmed', 'ali', 'marrakech'),
(13, ' Av MED 6 Rue 15', 'b123', 'ar1452', NULL, 'xxx', 'xxx', 'marrakech');

--
-- Dumping data for table `piece`
--

INSERT INTO `piece` (`id`, `libelle`) VALUES
(1, 'photo'),
(2, 'photocopie CNI'),
(3, 'Attestation originale du baccalaur?at'),
(4, 'photocopie certifi?e conforme du baccalaur?at'),
(5, 'Dossier medical'),
(6, 'photocopies certifi?es conforme du DEUST ou ?quivalent'),
(7, 'enveloppe format A4');
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

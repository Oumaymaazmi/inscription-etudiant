-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 16, 2019 at 04:52 PM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

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

-- --------------------------------------------------------

--
-- Table structure for table `departement`
--

CREATE TABLE `departement` (
  `id` bigint(20) NOT NULL,
  `abreviation` varchar(255) DEFAULT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `responsable` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `departement`
--

INSERT INTO `departement` (`id`, `abreviation`, `libelle`, `responsable`) VALUES
(6, 'Chim', 'Chimie', NULL),
(7, 'PhyApp', 'Physique Appliquée', NULL),
(8, 'Info', 'Informatique', NULL),
(9, 'Bio', 'Biologie', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `departement_filiere`
--

CREATE TABLE `departement_filiere` (
  `departement_id` bigint(20) NOT NULL,
  `filiere` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `etudiant`
--

CREATE TABLE `etudiant` (
  `id` bigint(20) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `cne` varchar(255) DEFAULT NULL,
  `cni` varchar(255) DEFAULT NULL,
  `date_naissance` date DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `etudiant`
--

INSERT INTO `etudiant` (`id`, `adresse`, `cne`, `cni`, `date_naissance`, `nom`, `prenom`, `ville`) VALUES
(12, ' Av MED 6 Rue 15', 'a123', 'ee1452', NULL, 'ahmed', 'ali', 'marrakech'),
(13, ' Av MED 6 Rue 15', 'b123', 'ar1452', NULL, 'xxx', 'xxx', 'marrakech');

-- --------------------------------------------------------

--
-- Table structure for table `filiere`
--

CREATE TABLE `filiere` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `departement` bigint(20) DEFAULT NULL,
  `responsable` bigint(20) DEFAULT NULL,
  `type_filiere` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(10),
(10),
(10),
(10),
(10),
(10),
(10),
(10),
(10);

-- --------------------------------------------------------

--
-- Table structure for table `inscription`
--

CREATE TABLE `inscription` (
  `id` bigint(20) NOT NULL,
  `date_inscription` date DEFAULT NULL,
  `nbr_entree` int(11) NOT NULL,
  `nbr_exige` int(11) NOT NULL,
  `etudiant` bigint(20) DEFAULT NULL,
  `filiere` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `piece`
--

CREATE TABLE `piece` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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

-- --------------------------------------------------------

--
-- Table structure for table `piece_filiere`
--

CREATE TABLE `piece_filiere` (
  `id` bigint(20) NOT NULL,
  `nombre_exige` int(11) NOT NULL,
  `filiere` bigint(20) DEFAULT NULL,
  `piece` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `piece_inscription`
--

CREATE TABLE `piece_inscription` (
  `id` bigint(20) NOT NULL,
  `nombre_presente` int(11) NOT NULL,
  `inscription` bigint(20) DEFAULT NULL,
  `piece` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `responsable`
--

CREATE TABLE `responsable` (
  `id` bigint(20) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `cni` varchar(255) DEFAULT NULL,
  `date_naissance` date DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `type_filiere`
--

CREATE TABLE `type_filiere` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `departement`
--
ALTER TABLE `departement`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKiquo5gdbva8cyvlvhtmk93q18` (`responsable`);

--
-- Indexes for table `departement_filiere`
--
ALTER TABLE `departement_filiere`
  ADD UNIQUE KEY `UK_4v3yyofbetr7mtd28nhiarg48` (`filiere`),
  ADD KEY `FKmioui8stvx4mwufb4a2dt0iyl` (`departement_id`);

--
-- Indexes for table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `filiere`
--
ALTER TABLE `filiere`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKljhoh4l3pi1bf7q2esd300lqq` (`departement`),
  ADD KEY `FKoulq158r5vs9t65eay23d8dq1` (`responsable`),
  ADD KEY `FKogaon4oyy8ggocjr3b147bu04` (`type_filiere`);

--
-- Indexes for table `inscription`
--
ALTER TABLE `inscription`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKm28kdvf4qdc4c092fggfbqi8t` (`etudiant`),
  ADD KEY `FKhhdbeaggyj73jh3y3bgcynpuf` (`filiere`);

--
-- Indexes for table `piece`
--
ALTER TABLE `piece`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `piece_filiere`
--
ALTER TABLE `piece_filiere`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKhsaqu9u3m9bce7k5y283claxv` (`filiere`),
  ADD KEY `FKqgvi1cpyy8sb1grs1fmk1xleo` (`piece`);

--
-- Indexes for table `piece_inscription`
--
ALTER TABLE `piece_inscription`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3h2r195mya9tdl8w9ga6tjg59` (`inscription`),
  ADD KEY `FK59wfex71lkf4hbgd3l5e6kgnh` (`piece`);

--
-- Indexes for table `responsable`
--
ALTER TABLE `responsable`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `type_filiere`
--
ALTER TABLE `type_filiere`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

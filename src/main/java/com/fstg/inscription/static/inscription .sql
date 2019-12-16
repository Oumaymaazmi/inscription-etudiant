-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  lun. 09 déc. 2019 à 18:18
-- Version du serveur :  10.4.8-MariaDB
-- Version de PHP :  7.1.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `inscription`
--

-- --------------------------------------------------------

--
-- Structure de la table `departement`
--

CREATE TABLE `departement` (
  `id` bigint(20) NOT NULL,
  `abreviation` varchar(255) DEFAULT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `responsable` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `departement`
--

INSERT INTO `departement` (`id`, `abreviation`, `libelle`, `responsable`) VALUES
(7, 'INF', 'Informatique', 1),
(8, 'MATH', 'Mathematiques', 10);

-- --------------------------------------------------------

--
-- Structure de la table `departement_filiere`
--

CREATE TABLE `departement_filiere` (
  `departement_id` bigint(20) NOT NULL,
  `filiere` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
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
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`id`, `adresse`, `cne`, `cni`, `date_naissance`, `nom`, `prenom`, `ville`) VALUES
(14, ' Av MED 6 Rue 15', 'c123', 'ar145252', NULL, 'imane', 'xxppx', 'marrakech');

-- --------------------------------------------------------

--
-- Structure de la table `filiere`
--

CREATE TABLE `filiere` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `departement` bigint(20) DEFAULT NULL,
  `formation` bigint(20) DEFAULT NULL,
  `responsable` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `filiere`
--

INSERT INTO `filiere` (`id`, `libelle`, `departement`, `formation`, `responsable`) VALUES
(13, 'IRISI', 7, 12, 3);

-- --------------------------------------------------------

--
-- Structure de la table `formation`
--

CREATE TABLE `formation` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `formation`
--

INSERT INTO `formation` (`id`, `libelle`) VALUES
(11, 'Licence Sciences et Techniques'),
(12, 'Cycle Ingénieur');

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(15),
(15),
(15),
(15),
(15),
(15),
(15),
(15),
(15);

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

CREATE TABLE `inscription` (
  `id` bigint(20) NOT NULL,
  `date_inscription` date DEFAULT NULL,
  `etudiant` bigint(20) DEFAULT NULL,
  `filiere` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `piece`
--

CREATE TABLE `piece` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `piece_filiere`
--

CREATE TABLE `piece_filiere` (
  `id` bigint(20) NOT NULL,
  `niveau_filiere` int(11) NOT NULL,
  `nombre_exige` int(11) NOT NULL,
  `filiere` bigint(20) DEFAULT NULL,
  `piece` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `piece_inscription`
--

CREATE TABLE `piece_inscription` (
  `id` bigint(20) NOT NULL,
  `nombre_presente` int(11) NOT NULL,
  `inscription` bigint(20) DEFAULT NULL,
  `piece` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `responsable`
--

CREATE TABLE `responsable` (
  `id` bigint(20) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `cni` varchar(255) DEFAULT NULL,
  `date_naissance` date DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `responsable`
--

INSERT INTO `responsable` (`id`, `adresse`, `cni`, `date_naissance`, `nom`, `prenom`, `ville`) VALUES
(1, 'xx-xx-xx', 'ii123', NULL, 'ahmed', 'ahmed', 'marrakech'),
(2, 'xx-xx-xx', 'ii147', NULL, 'hassan', 'hassan', 'marrakech'),
(3, 'xx-xx-xx', 'cc147', NULL, 'ali', 'ali', 'marrakech'),
(4, 'xx-xx-xx', 'cc247', NULL, 'name', 'name', 'marrakech'),
(6, 'xx-xx-xx', 'ab159', NULL, 'name', 'name', 'marrakech');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `departement`
--
ALTER TABLE `departement`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKiquo5gdbva8cyvlvhtmk93q18` (`responsable`);

--
-- Index pour la table `departement_filiere`
--
ALTER TABLE `departement_filiere`
  ADD UNIQUE KEY `UK_4v3yyofbetr7mtd28nhiarg48` (`filiere`),
  ADD KEY `FKmioui8stvx4mwufb4a2dt0iyl` (`departement_id`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `filiere`
--
ALTER TABLE `filiere`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKljhoh4l3pi1bf7q2esd300lqq` (`departement`),
  ADD KEY `FKnmq19uysujyh1ip1acykiuhq2` (`formation`),
  ADD KEY `FKoulq158r5vs9t65eay23d8dq1` (`responsable`);

--
-- Index pour la table `formation`
--
ALTER TABLE `formation`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `inscription`
--
ALTER TABLE `inscription`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKm28kdvf4qdc4c092fggfbqi8t` (`etudiant`),
  ADD KEY `FKhhdbeaggyj73jh3y3bgcynpuf` (`filiere`);

--
-- Index pour la table `piece`
--
ALTER TABLE `piece`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `piece_filiere`
--
ALTER TABLE `piece_filiere`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKhsaqu9u3m9bce7k5y283claxv` (`filiere`),
  ADD KEY `FKqgvi1cpyy8sb1grs1fmk1xleo` (`piece`);

--
-- Index pour la table `piece_inscription`
--
ALTER TABLE `piece_inscription`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3h2r195mya9tdl8w9ga6tjg59` (`inscription`),
  ADD KEY `FK59wfex71lkf4hbgd3l5e6kgnh` (`piece`);

--
-- Index pour la table `responsable`
--
ALTER TABLE `responsable`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

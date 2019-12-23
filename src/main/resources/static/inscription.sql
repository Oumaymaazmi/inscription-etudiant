-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  lun. 16 déc. 2019 à 17:24
-- Version du serveur :  10.4.8-MariaDB
-- Version de PHP :  7.1.32

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
-- Base de données :  `inscription`
--

--
-- Déchargement des données de la table `departement`
--

INSERT INTO `departement` (`id`, `abreviation`, `libelle`, `responsable`) VALUES
(6, 'Chim', 'Chimie', NULL),
(7, 'PhyApp', 'Physique Appliquée', NULL),
(8, 'Info', 'Informatique', NULL),
(9, 'Bio', 'Biologie', NULL);

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`id`, `adresse`, `cne`, `cni`, `date_naissance`, `nom`, `prenom`, `ville`) VALUES
(12, ' Av MED 6 Rue 15', 'a123', 'ee1452', NULL, 'ahmed', 'ali', 'marrakech'),
(13, ' Av MED 6 Rue 15', 'b123', 'ar1452', NULL, 'xxx', 'xxx', 'marrakech');

--
-- Déchargement des données de la table `filiere`
--

INSERT INTO `filiere` (`id`, `libelle`, `departement`, `responsable`, `type_filiere`) VALUES
(1, 'IRISI', NULL, NULL, NULL),
(2, 'IFA', NULL, NULL, NULL),
(3, 'GC', NULL, NULL, NULL),
(5, 'GC', NULL, NULL, 4);

--
-- Déchargement des données de la table `inscription`
--

INSERT INTO `inscription` (`id`, `date_inscription`, `nbr_entree`, `nbr_exige`, `etudiant`, `filiere`) VALUES
(7, NULL, 0, 0, NULL, NULL);

--
-- Déchargement des données de la table `piece`
--

INSERT INTO `piece` (`id`, `libelle`) VALUES
(1, 'photo'),
(2, 'photocopie CNI'),
(3, 'Attestation originale du baccalauréat'),
(4, 'photocopie certifiée conforme du baccalauréat'),
(5, 'Dossier medical'),
(6, 'photocopies certifiées conforme du DEUST ou équivalent'),
(7, 'enveloppe format A4');

--
-- Déchargement des données de la table `type_filiere`
--

INSERT INTO `type_filiere` (`id`, `libelle`) VALUES
(4, 'mastre'),
(6, 'GC');
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

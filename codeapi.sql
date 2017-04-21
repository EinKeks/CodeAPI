-- phpMyAdmin SQL Dump
-- version 4.0.10.18
-- https://www.phpmyadmin.net
--
-- Host: localhost:3306
-- Generation Time: Apr 21, 2017 at 07:31 AM
-- Server version: 10.1.22-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `nickwde_codeapi`
--

-- --------------------------------------------------------

--
-- Table structure for table `c_s`
--

CREATE TABLE IF NOT EXISTS `c_s` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `is_competence` tinyint(1) NOT NULL DEFAULT '0',
  `name` varchar(200) NOT NULL,
  `description` text,
  `parentID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `name` (`name`),
  KEY `parentID` (`parentID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `interest`
--

CREATE TABLE IF NOT EXISTS `interest` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `description` text NOT NULL,
  `parentID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `name` (`name`),
  KEY `parentID` (`parentID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `nm_user_cs`
--

CREATE TABLE IF NOT EXISTS `nm_user_cs` (
  `userID` int(11) NOT NULL,
  `csID` int(11) NOT NULL,
  `level` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`userID`,`csID`),
  KEY `nm_user_ci` (`csID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `nm_user_interest`
--

CREATE TABLE IF NOT EXISTS `nm_user_interest` (
  `userID` int(11) NOT NULL,
  `interestID` int(11) NOT NULL,
  PRIMARY KEY (`userID`,`interestID`),
  KEY `nm_user_interest` (`interestID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `first_name` varchar(200) NOT NULL,
  `mail` varchar(200) NOT NULL,
  `slack_link` varchar(200) NOT NULL,
  `icon` varchar(100) DEFAULT NULL,
  `semester` int(11) NOT NULL,
  `password` varchar(64) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `mail` (`mail`),
  UNIQUE KEY `slack_link` (`slack_link`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

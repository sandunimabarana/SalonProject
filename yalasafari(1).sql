-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 09, 2018 at 03:55 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `yalasafari`
--

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `resev_No` int(11) NOT NULL,
  `date` varchar(255) NOT NULL,
  `reg_No` int(11) NOT NULL,
  `res_No` int(11) DEFAULT NULL,
  `time` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`resev_No`, `date`, `reg_No`, `res_No`, `time`) VALUES
(4, '2018-08-07', 1, 2, '22:10'),
(5, '2018-08-13', 1, 2, '10:40'),
(6, '2018-08-06', 5, 2, '14:01'),
(7, '2018-08-14', 5, 5, '13:20'),
(8, '2018-07-29', 1, 7, '00:02'),
(13, '2018-04-19', 5, 7, '15:05'),
(14, '2018-08-21', 5, 10, '00:12'),
(15, '2018-08-07', 5, 1, '00:30'),
(16, '2018-08-07', 5, 100, '00:12'),
(17, '2018-08-14', 5, 7, '00:12'),
(18, '2018-08-14', 5, 10, '00:12');

-- --------------------------------------------------------

--
-- Table structure for table `resources`
--

CREATE TABLE `resources` (
  `reso_No` int(11) NOT NULL,
  `description` varchar(50) NOT NULL,
  `authPerson` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `maxCount` int(11) NOT NULL,
  `charges` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `resources`
--

INSERT INTO `resources` (`reso_No`, `description`, `authPerson`, `type`, `maxCount`, `charges`) VALUES
(13, 'Safari Jeep 2', 'Kamal', 'Vehicle', 10, 10000),
(5, 'safari jeep', 'amal', 'Vehicle', 10, 2500),
(10, 'Bungalow 1', 'Saman', 'Bungalow', 12, 10000),
(11, 'Bungalow 2', 'kamal', 'Bungalow', 4, 5000),
(12, 'Bungalow 3', 'kasun', 'Bungalow', 15, 15000);

-- --------------------------------------------------------

--
-- Table structure for table `userdetails`
--

CREATE TABLE `userdetails` (
  `reg_No` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `nic` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userdetails`
--

INSERT INTO `userdetails` (`reg_No`, `address`, `email`, `name`, `nic`, `password`, `tel`, `title`, `type`) VALUES
(1, 'ganemulla', 'abcd@gmail.com', 'sachithre', '123456789V', 'abc', '+94719212040', 'Mr.', 'admin'),
(7, 'gamaha', 'sachithre@gmail.com', 'Sachithre', '943462224V', 'abc', '+99999999999', 'Mr', 'user'),
(3, 'gampaha', 'sahan@gamil.com', 'sahan', '943462224V', 'qwer', '+94123456789', 'mr.', 'user'),
(4, 'gampaha', 'scheyazide@gmail.com', 'sahan', '943462224V', 'asdf', '+94714597876', 'mr.', 'user'),
(5, 'asd', 'kapila@gmail.com', 'Kapila', '123456789V', 'abc', '+94711212123', 'mr', 'user'),
(6, 'asd', 'asd@asd', 'asd', '111111111V', 'asd', '+94123456789', 'asd', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`resev_No`);

--
-- Indexes for table `resources`
--
ALTER TABLE `resources`
  ADD PRIMARY KEY (`reso_No`);

--
-- Indexes for table `userdetails`
--
ALTER TABLE `userdetails`
  ADD PRIMARY KEY (`reg_No`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `resev_No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `resources`
--
ALTER TABLE `resources`
  MODIFY `reso_No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `userdetails`
--
ALTER TABLE `userdetails`
  MODIFY `reg_No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

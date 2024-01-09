-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 09, 2024 at 10:26 AM
-- Server version: 8.0.30
-- PHP Version: 8.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `techin`
--

-- --------------------------------------------------------

--
-- Table structure for table `detail`
--

CREATE TABLE `detail` (
  `id` int NOT NULL,
  `namaPelanggan` varchar(50) NOT NULL,
  `namaKurir` varchar(50) NOT NULL,
  `beratSampah` float NOT NULL,
  `jumlahSampah` int NOT NULL,
  `hargaSampah` float NOT NULL,
  `poinSampah` int NOT NULL,
  `idPermintaan` int DEFAULT NULL,
  `idPelanggan` int DEFAULT NULL,
  `alamatPenjemputan` varchar(100) NOT NULL,
  `noKendaraan` varchar(12) NOT NULL,
  `idSampah` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `detail`
--

INSERT INTO `detail` (`id`, `namaPelanggan`, `namaKurir`, `beratSampah`, `jumlahSampah`, `hargaSampah`, `poinSampah`, `idPermintaan`, `idPelanggan`, `alamatPenjemputan`, `noKendaraan`, `idSampah`) VALUES
(7, 'Ainan Bau', 'Malwi', 10, 5, 50000, 10, 87, 5, 'Lembang', 'AA 4545 ASW', 10);

-- --------------------------------------------------------

--
-- Table structure for table `kurir`
--

CREATE TABLE `kurir` (
  `idKurir` int NOT NULL,
  `namaKurir` text NOT NULL,
  `noKendaraan` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `kurir`
--

INSERT INTO `kurir` (`idKurir`, `namaKurir`, `noKendaraan`) VALUES
(1, 'Lutfi', 'D 6895 UDA'),
(2, 'Fauzi', 'Z 6969 ANJ'),
(3, 'Malwi', 'AA 4545 ASW');

-- --------------------------------------------------------

--
-- Table structure for table `lacak`
--

CREATE TABLE `lacak` (
  `id` int NOT NULL,
  `namaPelanggan` varchar(50) NOT NULL,
  `namaKurir` varchar(50) NOT NULL,
  `alamatPenjemputan` varchar(100) NOT NULL,
  `alamatTujuan` varchar(100) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `idPenjemputan` int DEFAULT NULL,
  `idKurir` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `lacak`
--

INSERT INTO `lacak` (`id`, `namaPelanggan`, `namaKurir`, `alamatPenjemputan`, `alamatTujuan`, `status`, `idPenjemputan`, `idKurir`) VALUES
(38, 'Ainan Bau', 'Malwi', 'Lembang', 'Dropbox Setiabudhi', 0, 58, 3),
(41, 'Ainan Bau', 'Fauzi', 'Cipanas', 'Dropbox Cipanas', 1, 57, 2),
(42, 'Ainan Bau', 'Fauzi', 'Cipanas', 'Dropbox Cipanas', 1, 57, 2);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `idPelanggan` int NOT NULL,
  `namaPelanggan` text NOT NULL,
  `alamatPelanggan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`idPelanggan`, `namaPelanggan`, `alamatPelanggan`) VALUES
(1, 'Lutfi', 'Jl. Sariwangi Dalam 28'),
(2, 'Gilman', 'Cileunyi'),
(3, 'Fowaz', 'Cimahi'),
(4, 'Fauzi', 'Gegerkalong'),
(5, 'Ainan Bau', 'Lembang'),
(7, 'Afandhi', 'Cipanas'),
(8, 'Wildan Bahrul', 'Kopo'),
(9, 'Adit', 'Jl. Cimahi'),
(10, 'Dwi', 'Leuwigajah');

-- --------------------------------------------------------

--
-- Table structure for table `penjemputan`
--

CREATE TABLE `penjemputan` (
  `id` int NOT NULL,
  `namaKurir` varchar(50) NOT NULL,
  `alamatPenjemputan` varchar(100) NOT NULL,
  `alamatTujuan` varchar(100) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `idPermintaan` int DEFAULT NULL,
  `idKurir` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `penjemputan`
--

INSERT INTO `penjemputan` (`id`, `namaKurir`, `alamatPenjemputan`, `alamatTujuan`, `status`, `idPermintaan`, `idKurir`) VALUES
(57, 'Fauzi', 'Cipanas', 'Dropbox Cipanas', 1, 91, 2),
(58, 'Malwi', 'Lembang', 'Dropbox Setiabudhi', 1, 87, 3),
(63, 'Lutfi', '', '', 1, NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `permintaan`
--

CREATE TABLE `permintaan` (
  `id` int NOT NULL,
  `namaPelanggan` varchar(50) NOT NULL,
  `alamatPenjemputan` varchar(100) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `idPelanggan` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `permintaan`
--

INSERT INTO `permintaan` (`id`, `namaPelanggan`, `alamatPenjemputan`, `status`, `idPelanggan`) VALUES
(86, 'Wildan Bahrul', 'Kopo', 1, 8),
(87, 'Ainan Bau', 'Lembang', 1, 5),
(91, 'Afandhi', 'Cipanas', 1, 7);

-- --------------------------------------------------------

--
-- Table structure for table `sampah`
--

CREATE TABLE `sampah` (
  `idSampah` int NOT NULL,
  `namaPelanggan` varchar(50) NOT NULL,
  `namaKurir` varchar(50) NOT NULL,
  `alamatPenjemputan` varchar(100) NOT NULL,
  `noKendaraan` varchar(12) NOT NULL,
  `jumlahSampah` int NOT NULL,
  `jenisSampah` varchar(20) NOT NULL,
  `beratSampah` float NOT NULL,
  `poin` int NOT NULL,
  `idPelanggan` int DEFAULT NULL,
  `idKurir` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `sampah`
--

INSERT INTO `sampah` (`idSampah`, `namaPelanggan`, `namaKurir`, `alamatPenjemputan`, `noKendaraan`, `jumlahSampah`, `jenisSampah`, `beratSampah`, `poin`, `idPelanggan`, `idKurir`) VALUES
(10, 'Ainan Bau', 'Malwi', 'Lembang', 'AA 4545 ASW', 5, 'Elektronik', 10, 10, 5, 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail`
--
ALTER TABLE `detail`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idPermintaan` (`idPermintaan`),
  ADD KEY `idPelanggan` (`idPelanggan`),
  ADD KEY `idSampah` (`idSampah`);

--
-- Indexes for table `kurir`
--
ALTER TABLE `kurir`
  ADD PRIMARY KEY (`idKurir`);

--
-- Indexes for table `lacak`
--
ALTER TABLE `lacak`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_ID_PENJEMPUTAN` (`idPenjemputan`),
  ADD KEY `idKurir` (`idKurir`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`idPelanggan`);

--
-- Indexes for table `penjemputan`
--
ALTER TABLE `penjemputan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_ID_PERMINTAAN` (`idPermintaan`),
  ADD KEY `idKurir` (`idKurir`);

--
-- Indexes for table `permintaan`
--
ALTER TABLE `permintaan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idPelanggan` (`idPelanggan`);

--
-- Indexes for table `sampah`
--
ALTER TABLE `sampah`
  ADD PRIMARY KEY (`idSampah`),
  ADD KEY `idPelanggan` (`idPelanggan`),
  ADD KEY `idKurir` (`idKurir`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `detail`
--
ALTER TABLE `detail`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `kurir`
--
ALTER TABLE `kurir`
  MODIFY `idKurir` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `lacak`
--
ALTER TABLE `lacak`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `idPelanggan` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `penjemputan`
--
ALTER TABLE `penjemputan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;

--
-- AUTO_INCREMENT for table `permintaan`
--
ALTER TABLE `permintaan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=92;

--
-- AUTO_INCREMENT for table `sampah`
--
ALTER TABLE `sampah`
  MODIFY `idSampah` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detail`
--
ALTER TABLE `detail`
  ADD CONSTRAINT `detail_ibfk_1` FOREIGN KEY (`idPermintaan`) REFERENCES `permintaan` (`id`),
  ADD CONSTRAINT `detail_ibfk_2` FOREIGN KEY (`idPelanggan`) REFERENCES `pelanggan` (`idPelanggan`),
  ADD CONSTRAINT `detail_ibfk_3` FOREIGN KEY (`idSampah`) REFERENCES `sampah` (`idSampah`);

--
-- Constraints for table `lacak`
--
ALTER TABLE `lacak`
  ADD CONSTRAINT `FK_ID_PENJEMPUTAN` FOREIGN KEY (`idPenjemputan`) REFERENCES `penjemputan` (`id`),
  ADD CONSTRAINT `lacak_ibfk_1` FOREIGN KEY (`idKurir`) REFERENCES `kurir` (`idKurir`);

--
-- Constraints for table `penjemputan`
--
ALTER TABLE `penjemputan`
  ADD CONSTRAINT `FK_ID_PERMINTAAN` FOREIGN KEY (`idPermintaan`) REFERENCES `permintaan` (`id`),
  ADD CONSTRAINT `penjemputan_ibfk_1` FOREIGN KEY (`idKurir`) REFERENCES `kurir` (`idKurir`);

--
-- Constraints for table `permintaan`
--
ALTER TABLE `permintaan`
  ADD CONSTRAINT `permintaan_ibfk_1` FOREIGN KEY (`idPelanggan`) REFERENCES `pelanggan` (`idPelanggan`);

--
-- Constraints for table `sampah`
--
ALTER TABLE `sampah`
  ADD CONSTRAINT `sampah_ibfk_1` FOREIGN KEY (`idPelanggan`) REFERENCES `pelanggan` (`idPelanggan`),
  ADD CONSTRAINT `sampah_ibfk_2` FOREIGN KEY (`idKurir`) REFERENCES `kurir` (`idKurir`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

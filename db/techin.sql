-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 01, 2024 at 01:28 AM
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
  `kurir_id` int DEFAULT NULL,
  `pelanggan_id` int DEFAULT NULL,
  `sampah_id` int DEFAULT NULL,
  `permintaan_id` int DEFAULT NULL,
  `penjemputan_id` int DEFAULT NULL,
  `lacak_id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `kurir`
--

CREATE TABLE `kurir` (
  `idKurir` int NOT NULL,
  `namaKurir` text NOT NULL,
  `noKendaraan` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

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
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `lacak`
--

INSERT INTO `lacak` (`id`, `namaPelanggan`, `namaKurir`, `alamatPenjemputan`, `alamatTujuan`, `status`) VALUES
(1, 'Fauzi', 'Anum Muhidin', 'Jl. Sarijadi No. 1140 RT 05/07, Kecamatan Cimahi Tengah', 'Dropbox Setiabudhi', 0),
(2, 'Gilman', 'Velvet Lovely', 'Jl. Padaasih No. 140 RT 02/04, Kecamatan Cimahi Selatan', 'Dropbox Cimindi', 0),
(3, 'Adit', 'Budi Siregar Smith', 'Jl. Cipageran No. 100 Rt 05/07, Kecamatan Cimahi Utara', 'Dropbox Lembang', 0);

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
(6, 'Haykal', 'Baleendah'),
(7, 'Afandhi', 'Cipanas'),
(8, 'Wildan Bahrul', 'Kopo'),
(9, 'Adit', 'Jl. Cimahi');

-- --------------------------------------------------------

--
-- Table structure for table `penjemputan`
--

CREATE TABLE `penjemputan` (
  `id` int NOT NULL,
  `namaKurir` varchar(50) NOT NULL,
  `alamatPenjemputan` varchar(100) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `permintaan`
--

CREATE TABLE `permintaan` (
  `id` int NOT NULL,
  `namaPelanggan` varchar(50) NOT NULL,
  `alamatPenjemputan` varchar(100) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `permintaan`
--

INSERT INTO `permintaan` (`id`, `namaPelanggan`, `alamatPenjemputan`, `status`) VALUES
(1, 'Lutfi', 'Jl. Sarijadi', 1);

-- --------------------------------------------------------

--
-- Table structure for table `sampah`
--

CREATE TABLE `sampah` (
  `idSampah` int NOT NULL,
  `jumlahSampah` int NOT NULL,
  `jenisSampah` varchar(20) NOT NULL,
  `beratSampah` float NOT NULL,
  `poin` int NOT NULL,
  `idPelanggan` int DEFAULT NULL,
  `idKurir` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail`
--
ALTER TABLE `detail`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kurir_id` (`kurir_id`),
  ADD KEY `pelanggan_id` (`pelanggan_id`),
  ADD KEY `sampah_id` (`sampah_id`),
  ADD KEY `permintaan_id` (`permintaan_id`),
  ADD KEY `penjemputan_id` (`penjemputan_id`),
  ADD KEY `lacak_id` (`lacak_id`);

--
-- Indexes for table `kurir`
--
ALTER TABLE `kurir`
  ADD PRIMARY KEY (`idKurir`);

--
-- Indexes for table `lacak`
--
ALTER TABLE `lacak`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`idPelanggan`);

--
-- Indexes for table `penjemputan`
--
ALTER TABLE `penjemputan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `permintaan`
--
ALTER TABLE `permintaan`
  ADD PRIMARY KEY (`id`);

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
-- AUTO_INCREMENT for table `kurir`
--
ALTER TABLE `kurir`
  MODIFY `idKurir` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `lacak`
--
ALTER TABLE `lacak`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `idPelanggan` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `penjemputan`
--
ALTER TABLE `penjemputan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `permintaan`
--
ALTER TABLE `permintaan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `sampah`
--
ALTER TABLE `sampah`
  MODIFY `idSampah` int NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detail`
--
ALTER TABLE `detail`
  ADD CONSTRAINT `detail_ibfk_1` FOREIGN KEY (`kurir_id`) REFERENCES `kurir` (`idKurir`),
  ADD CONSTRAINT `detail_ibfk_2` FOREIGN KEY (`pelanggan_id`) REFERENCES `pelanggan` (`idPelanggan`),
  ADD CONSTRAINT `detail_ibfk_3` FOREIGN KEY (`sampah_id`) REFERENCES `sampah` (`idSampah`),
  ADD CONSTRAINT `detail_ibfk_4` FOREIGN KEY (`permintaan_id`) REFERENCES `permintaan` (`id`),
  ADD CONSTRAINT `detail_ibfk_5` FOREIGN KEY (`penjemputan_id`) REFERENCES `penjemputan` (`id`),
  ADD CONSTRAINT `detail_ibfk_6` FOREIGN KEY (`lacak_id`) REFERENCES `lacak` (`id`);

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

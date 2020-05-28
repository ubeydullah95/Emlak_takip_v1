-- --------------------------------------------------------
-- Sunucu:                       127.0.0.1
-- Sunucu versiyonu:             5.7.24-log - MySQL Community Server (GPL)
-- Sunucu İşletim Sistemi:       Win64
-- HeidiSQL Sürüm:               9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- emlak için veritabanı yapısı dökülüyor
DROP DATABASE IF EXISTS `emlak`;
CREATE DATABASE IF NOT EXISTS `emlak` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `emlak`;


-- görünüm yapısı dökülüyor emlak.emlak_tipine_gore
DROP VIEW IF EXISTS `emlak_tipine_gore`;
-- VIEW bağımlılık sorunlarını çözmek için geçici tablolar oluşturuluyor
CREATE TABLE `emlak_tipine_gore` (
	`tip` VARCHAR(45) NULL COLLATE 'utf8_general_ci',
	`EmlakTipi` VARCHAR(7) NOT NULL COLLATE 'utf8_general_ci',
	`Adet` BIGINT(21) NOT NULL
) ENGINE=MyISAM;


-- tablo yapısı dökülüyor emlak.ilanlar
DROP TABLE IF EXISTS `ilanlar`;
CREATE TABLE IF NOT EXISTS `ilanlar` (
  `ilan_id` int(11) NOT NULL AUTO_INCREMENT,
  `durum` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `tip` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `fiyat` int(11) DEFAULT NULL,
  `metrekare` int(11) DEFAULT NULL,
  `oda_sayisi` int(11) DEFAULT NULL,
  `salon_sayisi` int(11) DEFAULT NULL,
  `bina_yasi` int(11) DEFAULT NULL,
  `kat` int(11) DEFAULT NULL,
  `isitma_turu` varchar(45) DEFAULT NULL,
  `esya` tinyint(4) DEFAULT NULL,
  `adres` varchar(150) CHARACTER SET utf8 DEFAULT NULL,
  `aciklama` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `aktif` tinyint(4) DEFAULT NULL,
  `d1` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `d2` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `d3` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `musteri_id` int(11) DEFAULT NULL,
  `musteriler_musteri_id` int(11) NOT NULL,
  PRIMARY KEY (`ilan_id`,`musteriler_musteri_id`),
  KEY `fk_ilanlar_musteriler1_idx` (`musteriler_musteri_id`),
  CONSTRAINT `fk_ilanlar_musteriler1` FOREIGN KEY (`musteriler_musteri_id`) REFERENCES `musteriler` (`musteri_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

-- emlak.ilanlar: ~18 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `ilanlar` DISABLE KEYS */;
INSERT INTO `ilanlar` (`ilan_id`, `durum`, `tip`, `fiyat`, `metrekare`, `oda_sayisi`, `salon_sayisi`, `bina_yasi`, `kat`, `isitma_turu`, `esya`, `adres`, `aciklama`, `aktif`, `d1`, `d2`, `d3`, `musteri_id`, `musteriler_musteri_id`) VALUES
	(1, 'Kiral?k', 'Daire', 4, 4, 4, 4, 4, NULL, 'Soba', 0, 'ASDAS', 'SDFASF', 0, 'Alarm', 'Alarm', 'Alarm', 1, 1),
	(4, 'Sat?l?k', 'Daire', 2, 2, 2, 2, 2, 1, 'Soba', 0, '222', '22', 0, 'Alarm', 'Alarm', 'Alarm', 1, 1),
	(5, 'Sat?l?k', 'Daire', 1, 1, 1, 1, 1, 1, 'Soba', 0, '1', '1', 0, 'Yok', 'Yok', 'Yok', 1, 1),
	(9, 'Satilik', 'Daire', 250000, 150, 2, 1, 2, 2, 'Kombi', 1, 'aaaaaaaaaa\naaaaaaaaa\naaaaaa', 'aaaaaaaaaa', 0, 'Alarm', 'Yok', 'Yok', 1, 1),
	(10, 'Kiralik', 'Apart', 150000, 111, 3, 1, 1, 1, 'Kombi', 0, 'sdfsfsfsfsfsfs', 'dfdfsfsdfsdfsf', 0, 'Havuz', 'Güvenlik', 'Alarm', 1, 1),
	(11, 'Satilik', 'Müstakil', 1, 1, 1, 1, 1, 2, 'Soba', 0, '1', '1', 0, 'Havuz', 'Havuz', 'Havuz', 1, 1),
	(17, 'Kiralik', 'Daire', 1000, 150, 2, 1, 2, 1, 'Kombi', 0, 'BBBBBBB\nBBBBB\nBBB', 'AAAAAAA', 0, 'Alarm', 'Havuz', 'Güvenlik', 1, 1),
	(18, 'Kiralik', 'Apart', 800, 100, 1, 1, 3, 2, 'Merkezi Pay Ölçer', 1, 'BBBBBBBB', 'AAAAAA', 0, 'Yok', 'Yok', 'Havuz', 1, 1),
	(19, 'Kiralik', 'Villa', 3000, 400, 5, 2, 1, 0, 'Merkezi Sistem', 1, 'BBBBBBBBAAA', 'AAAAAAAAABBB', 1, 'Alarm', 'Havuz', 'Güvenlik', 1, 1),
	(20, 'Satilik', 'Daire', 250000, 250, 3, 2, 3, 3, 'Kombi', 0, 'AAAAAAAA', 'BBBBBBBBBBB', 1, 'Alarm', 'Havuz', 'Güvenlik', 1, 1),
	(21, 'Satilik', 'Daire', 350000, 350, 4, 1, 3, 3, 'Kombi', 1, 'BBBBBBBBAAABBBB\nAAAAAA', 'AAAAAAAAABBBAAAA\nAAAA', 0, 'Alarm', 'Havuz', 'Yok', 1, 1),
	(22, 'Satilik', 'Daire', 100000, 120, 2, 1, 7, 3, 'Kombi', 1, 'BBBBBBBBAAABBBB\nAAAAAABBBB', 'AAAAAAAAABBBAAAA\nAAAAABBBBB', 1, 'Alarm', 'Yok', 'Yok', 1, 1),
	(23, 'Satilik', 'Daire', 500000, 350, 4, 2, 1, 0, 'Merkezi Sistem', 0, 'DDDDDDD', 'DDDDDDD', 0, 'Alarm', 'Havuz', 'Havuz', 1, 1),
	(24, 'Satilik', 'Daire', 1000000, 500, 6, 3, 5, 0, 'Merkezi Sistem', 1, 'EEEEEEE', 'EEEEEEEE', 0, 'Alarm', 'Havuz', 'Güvenlik', 1, 1),
	(25, 'Satilik', 'Apart', 50000, 500, 1, 1, 8, 2, 'Merkezi Sistem', 1, 'GGGGGGGG', 'GGGGGGGG', 1, 'Yok', 'Yok', 'Yok', 1, 1),
	(26, 'Satilik', 'Yali', 5000000, 540, 7, 3, 24, 0, 'Soba', 1, 'HHHHHHHH', 'HHHHHHHHH', 0, 'Alarm', 'Havuz', 'Güvenlik', 1, 1),
	(27, 'Kiralik', 'Daire', 2000, 250, 3, 1, 5, 4, 'Kombi', 1, 'DDDDDDD', 'DDDDDD', 1, 'Yok', 'Yok', 'Alarm', 1, 1),
	(28, 'Kiralik', 'Daire', 3000, 280, 4, 1, 5, 2, 'Kombi', 1, 'KKKKKKKKK', 'KKKKKKKKKK', 1, 'Havuz', 'Güvenlik', 'Alarm', 1, 1);
/*!40000 ALTER TABLE `ilanlar` ENABLE KEYS */;


-- görünüm yapısı dökülüyor emlak.isitma_turune_gore
DROP VIEW IF EXISTS `isitma_turune_gore`;
-- VIEW bağımlılık sorunlarını çözmek için geçici tablolar oluşturuluyor
CREATE TABLE `isitma_turune_gore` (
	`isitma_turu` VARCHAR(45) NULL COLLATE 'latin1_swedish_ci',
	`İsitmaTuru` VARCHAR(7) NOT NULL COLLATE 'utf8_general_ci',
	`Adet` BIGINT(21) NOT NULL
) ENGINE=MyISAM;


-- tablo yapısı dökülüyor emlak.kayitlar
DROP TABLE IF EXISTS `kayitlar`;
CREATE TABLE IF NOT EXISTS `kayitlar` (
  `musteri_id` int(11) DEFAULT NULL,
  `ilan_id` int(11) DEFAULT NULL,
  `s_tarih` varchar(150) CHARACTER SET utf8 DEFAULT NULL,
  `s_fiyat` int(11) DEFAULT NULL,
  `kayit_id` int(11) NOT NULL AUTO_INCREMENT,
  `ilanlar_ilan_id` int(11) NOT NULL,
  `musteriler_musteri_id` int(11) NOT NULL,
  PRIMARY KEY (`kayit_id`,`ilanlar_ilan_id`,`musteriler_musteri_id`),
  KEY `fk_kayitlar_ilanlar_idx` (`ilanlar_ilan_id`),
  KEY `fk_kayitlar_musteriler1_idx` (`musteriler_musteri_id`),
  CONSTRAINT `fk_kayitlar_ilanlar` FOREIGN KEY (`ilanlar_ilan_id`) REFERENCES `ilanlar` (`ilan_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_kayitlar_musteriler1` FOREIGN KEY (`musteriler_musteri_id`) REFERENCES `musteriler` (`musteri_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

-- emlak.kayitlar: ~6 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `kayitlar` DISABLE KEYS */;
INSERT INTO `kayitlar` (`musteri_id`, `ilan_id`, `s_tarih`, `s_fiyat`, `kayit_id`, `ilanlar_ilan_id`, `musteriler_musteri_id`) VALUES
	(1, 17, 'Fri Dec 07 04:21:16 EET 2018', 2000, 10, 17, 1),
	(11, 18, 'Mon Dec 03 04:23:48 EET 2018', 1000, 11, 18, 11),
	(1, 21, 'Tue Dec 04 04:23:48 EET 2018', 360000, 12, 21, 1),
	(5, 23, 'Thu Nov 15 04:23:48 EET 2018', 520000, 13, 23, 5),
	(1, 26, 'Wed Nov 14 04:23:48 EET 2018', 5200000, 14, 26, 1),
	(11, 24, 'Thu Nov 01 04:23:48 EET 2018', 110000, 15, 24, 11);
/*!40000 ALTER TABLE `kayitlar` ENABLE KEYS */;


-- görünüm yapısı dökülüyor emlak.kiralanan_ilan
DROP VIEW IF EXISTS `kiralanan_ilan`;
-- VIEW bağımlılık sorunlarını çözmek için geçici tablolar oluşturuluyor
CREATE TABLE `kiralanan_ilan` (
	`s_fiyat` INT(11) NULL,
	`fiyat` INT(11) NULL,
	`ilan_id` INT(11) NOT NULL,
	`AdSoyad` DOUBLE NULL
) ENGINE=MyISAM;


-- görünüm yapısı dökülüyor emlak.kiralik_ilan
DROP VIEW IF EXISTS `kiralik_ilan`;
-- VIEW bağımlılık sorunlarını çözmek için geçici tablolar oluşturuluyor
CREATE TABLE `kiralik_ilan` (
	`ilan_id` INT(11) NOT NULL,
	`durum` VARCHAR(45) NULL COLLATE 'utf8_general_ci',
	`tip` VARCHAR(45) NULL COLLATE 'utf8_general_ci',
	`fiyat` INT(11) NULL,
	`adres` VARCHAR(150) NULL COLLATE 'utf8_general_ci',
	`musteri_id` INT(11) NULL,
	`musteriler_musteri_id` INT(11) NOT NULL
) ENGINE=MyISAM;


-- tablo yapısı dökülüyor emlak.musteriler
DROP TABLE IF EXISTS `musteriler`;
CREATE TABLE IF NOT EXISTS `musteriler` (
  `musteri_id` int(11) NOT NULL AUTO_INCREMENT,
  `ad` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `soyad` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `mail` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `tel` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`musteri_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

-- emlak.musteriler: ~6 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `musteriler` DISABLE KEYS */;
INSERT INTO `musteriler` (`musteri_id`, `ad`, `soyad`, `mail`, `tel`) VALUES
	(1, 'Onur', 'Yildiz', 'onur@onur.com', '5394763068'),
	(5, 'Ubeydullah', 'Ubeydullah', 'ubey@ubey.com', '5347895263'),
	(11, 'Ali', 'Ali', 'ali@ali.com', '5398745421'),
	(12, 'Veli', 'Veli', 'veli@veli.com', '5364562145'),
	(13, 'Ahmet', 'Ahmet', 'ahmet@ahmet.com', '5354785124'),
	(14, 'Fatma', 'Fatma', 'fatma@fatma.com', '5387421562');
/*!40000 ALTER TABLE `musteriler` ENABLE KEYS */;


-- görünüm yapısı dökülüyor emlak.satilan_ilan
DROP VIEW IF EXISTS `satilan_ilan`;
-- VIEW bağımlılık sorunlarını çözmek için geçici tablolar oluşturuluyor
CREATE TABLE `satilan_ilan` (
	`s_fiyat` INT(11) NULL,
	`fiyat` INT(11) NULL,
	`ilan_id` INT(11) NOT NULL,
	`ad` VARCHAR(45) NULL COLLATE 'utf8_general_ci',
	`soyad` VARCHAR(45) NULL COLLATE 'utf8_general_ci'
) ENGINE=MyISAM;


-- görünüm yapısı dökülüyor emlak.satilik_ilan
DROP VIEW IF EXISTS `satilik_ilan`;
-- VIEW bağımlılık sorunlarını çözmek için geçici tablolar oluşturuluyor
CREATE TABLE `satilik_ilan` (
	`ilan_id` INT(11) NOT NULL,
	`durum` VARCHAR(45) NULL COLLATE 'utf8_general_ci',
	`tip` VARCHAR(45) NULL COLLATE 'utf8_general_ci',
	`fiyat` INT(11) NULL,
	`adres` VARCHAR(150) NULL COLLATE 'utf8_general_ci',
	`musteri_id` INT(11) NULL,
	`musteriler_musteri_id` INT(11) NOT NULL
) ENGINE=MyISAM;


-- görünüm yapısı dökülüyor emlak.emlak_tipine_gore
DROP VIEW IF EXISTS `emlak_tipine_gore`;
-- Geçici tablolar temizlenerek final VIEW oluşturuluyor
DROP TABLE IF EXISTS `emlak_tipine_gore`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `emlak_tipine_gore` AS select `ilanlar`.`tip` AS `tip`,'Satilik' AS `EmlakTipi`,count(`ilanlar`.`tip`) AS `Adet` from `ilanlar` where ((`ilanlar`.`aktif` = 0) and (`ilanlar`.`durum` = 'Satilik')) union select `ilanlar`.`tip` AS `tip`,'Kiralik' AS `EmlakTipi`,count(`ilanlar`.`tip`) AS `Adet` from `ilanlar` where ((`ilanlar`.`aktif` = 0) and (`ilanlar`.`durum` = 'Kiralik'));


-- görünüm yapısı dökülüyor emlak.isitma_turune_gore
DROP VIEW IF EXISTS `isitma_turune_gore`;
-- Geçici tablolar temizlenerek final VIEW oluşturuluyor
DROP TABLE IF EXISTS `isitma_turune_gore`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `isitma_turune_gore` AS select `ilanlar`.`isitma_turu` AS `isitma_turu`,'Satilik' AS `İsitmaTuru`,count(`ilanlar`.`isitma_turu`) AS `Adet` from `ilanlar` where ((`ilanlar`.`aktif` = 0) and (`ilanlar`.`durum` = 'Satilik')) union select `ilanlar`.`isitma_turu` AS `isitma_turu`,'Kiralik' AS `İsitmaTuru`,count(`ilanlar`.`isitma_turu`) AS `Adet` from `ilanlar` where ((`ilanlar`.`aktif` = 0) and (`ilanlar`.`durum` = 'Kiralik'));


-- görünüm yapısı dökülüyor emlak.kiralanan_ilan
DROP VIEW IF EXISTS `kiralanan_ilan`;
-- Geçici tablolar temizlenerek final VIEW oluşturuluyor
DROP TABLE IF EXISTS `kiralanan_ilan`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `kiralanan_ilan` AS select `kayitlar`.`s_fiyat` AS `s_fiyat`,`ilanlar`.`fiyat` AS `fiyat`,`ilanlar`.`ilan_id` AS `ilan_id`,((`musteriler`.`ad` + ' ') + `musteriler`.`soyad`) AS `AdSoyad` from ((`kayitlar` join `ilanlar` on((`kayitlar`.`ilan_id` = `ilanlar`.`ilan_id`))) join `musteriler` on((`kayitlar`.`musteri_id` = `musteriler`.`musteri_id`))) where ((`ilanlar`.`aktif` = 0) and (`ilanlar`.`durum` = 'Kiralik'));


-- görünüm yapısı dökülüyor emlak.kiralik_ilan
DROP VIEW IF EXISTS `kiralik_ilan`;
-- Geçici tablolar temizlenerek final VIEW oluşturuluyor
DROP TABLE IF EXISTS `kiralik_ilan`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `kiralik_ilan` AS select `ilanlar`.`ilan_id` AS `ilan_id`,`ilanlar`.`durum` AS `durum`,`ilanlar`.`tip` AS `tip`,`ilanlar`.`fiyat` AS `fiyat`,`ilanlar`.`adres` AS `adres`,`ilanlar`.`musteri_id` AS `musteri_id`,`ilanlar`.`musteriler_musteri_id` AS `musteriler_musteri_id` from `ilanlar` where (`ilanlar`.`durum` = 'kiralik');


-- görünüm yapısı dökülüyor emlak.satilan_ilan
DROP VIEW IF EXISTS `satilan_ilan`;
-- Geçici tablolar temizlenerek final VIEW oluşturuluyor
DROP TABLE IF EXISTS `satilan_ilan`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `satilan_ilan` AS select `kayitlar`.`s_fiyat` AS `s_fiyat`,`ilanlar`.`fiyat` AS `fiyat`,`ilanlar`.`ilan_id` AS `ilan_id`,`musteriler`.`ad` AS `ad`,`musteriler`.`soyad` AS `soyad` from ((`kayitlar` join `ilanlar` on((`kayitlar`.`ilan_id` = `ilanlar`.`ilan_id`))) join `musteriler` on((`kayitlar`.`musteri_id` = `musteriler`.`musteri_id`))) where ((`ilanlar`.`aktif` = 0) and (`ilanlar`.`durum` = 'Satilik'));


-- görünüm yapısı dökülüyor emlak.satilik_ilan
DROP VIEW IF EXISTS `satilik_ilan`;
-- Geçici tablolar temizlenerek final VIEW oluşturuluyor
DROP TABLE IF EXISTS `satilik_ilan`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `satilik_ilan` AS select `ilanlar`.`ilan_id` AS `ilan_id`,`ilanlar`.`durum` AS `durum`,`ilanlar`.`tip` AS `tip`,`ilanlar`.`fiyat` AS `fiyat`,`ilanlar`.`adres` AS `adres`,`ilanlar`.`musteri_id` AS `musteri_id`,`ilanlar`.`musteriler_musteri_id` AS `musteriler_musteri_id` from `ilanlar` where (`ilanlar`.`durum` = 'Satilik');
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

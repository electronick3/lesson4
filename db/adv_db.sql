-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.6.41-log - MySQL Community Server (GPL)
-- Операционная система:         Win64
-- HeidiSQL Версия:              9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Дамп структуры базы данных adv
CREATE DATABASE IF NOT EXISTS `adv` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `adv`;

-- Дамп структуры для таблица adv.ad
CREATE TABLE IF NOT EXISTS `ad` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cat_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `text` text NOT NULL,
  `phone` varchar(255) NOT NULL,
  `company_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `FK1_category_ad` (`cat_id`),
  KEY `FK2_company_ad` (`company_id`),
  CONSTRAINT `FK1_category_ad` FOREIGN KEY (`cat_id`) REFERENCES `category` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK2_company_ad` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='Объявления';

-- Дамп данных таблицы adv.ad: ~1 rows (приблизительно)
DELETE FROM `ad`;
/*!40000 ALTER TABLE `ad` DISABLE KEYS */;
INSERT INTO `ad` (`id`, `cat_id`, `name`, `text`, `phone`, `company_id`) VALUES
	(1, 1, 'Мазда 3', 'Отличный автомобиль', '+79485236982', 2);
/*!40000 ALTER TABLE `ad` ENABLE KEYS */;

-- Дамп структуры для таблица adv.category
CREATE TABLE IF NOT EXISTS `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='Категория';

-- Дамп данных таблицы adv.category: ~3 rows (приблизительно)
DELETE FROM `category`;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` (`id`, `name`) VALUES
	(1, 'Дома'),
	(2, 'Личные вещи'),
	(3, 'Автомобили');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;

-- Дамп структуры для таблица adv.company
CREATE TABLE IF NOT EXISTS `company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `descript` text NOT NULL,
  `address` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='Компания';

-- Дамп данных таблицы adv.company: ~1 rows (приблизительно)
DELETE FROM `company`;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` (`id`, `name`, `descript`, `address`) VALUES
	(2, 'Компания', 'описание', 'адрес');
/*!40000 ALTER TABLE `company` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

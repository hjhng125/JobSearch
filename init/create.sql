CREATE DATABASE IF NOT EXISTS `JobSearch`;

CREATE TABLE IF NOT EXISTS `JobSearch`.`Account` (
    `accountId` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `userName` varchar(255) NOT NULL,
    `email` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,
    `createdAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
    `deletedFlags` tinyint(4) NOT NULL DEFAULT '0',
    PRIMARY KEY (`accountId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

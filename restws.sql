/*
 Navicat Premium Data Transfer

 Source Server         : bancos
 Source Server Type    : MySQL
 Source Server Version : 100131
 Source Host           : localhost:3306
 Source Schema         : restws

 Target Server Type    : MySQL
 Target Server Version : 100131
 File Encoding         : 65001

 Date: 19/11/2018 00:19:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for pessoa
-- ----------------------------
DROP TABLE IF EXISTS `pessoa`;
CREATE TABLE `pessoa`  (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `nome` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `sobrenome` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `data_nasc` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `sexo` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `email` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `telefone` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `login` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `senha` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of pessoa
-- ----------------------------
INSERT INTO `pessoa` VALUES (1, 'Emerson', 'Ferreira', '22-02-1990', 'Masculino', 'emer@ebf.com', '(47) 9997-0000', 'emer', '123456E');
INSERT INTO `pessoa` VALUES (9, 'Andre', 'DaSilva', '12-12-2012', 'Masculino', 'andre@andre.com', '(99) 9999-9999', 'adr1', 'adr1234');
INSERT INTO `pessoa` VALUES (16, 'Joao', 'Da Silva', '12-12-2012', 'Masculino', 'andre@andre.com', '(99) 9999-9999', 'joao12', 'adr1234');
INSERT INTO `pessoa` VALUES (19, 'Joao Antonio', 'Da Silva', '12-12-2012', 'Masc', 'andre@andre.com ', '9999999999', 'adr', 'adr1234');
INSERT INTO `pessoa` VALUES (20, 'Joao Antunes', 'Da Silva', '12-12-2012', 'Masc', 'andre@andre.com ', '9999999999', 'adr', 'adr1234');
INSERT INTO `pessoa` VALUES (25, 'Pedro', 'Junio Ferreira', '01-01-2018', 'Masculino', 'pedro@gmail.com', '(48) 3030-1020', 'peTESTE', 'pe123456');
INSERT INTO `pessoa` VALUES (26, 'Maria', 'Julia', '15-12-1990', 'Feminino', 'maria@maria.com', '(46) 2020-1010', 'mari', 'mari123');
INSERT INTO `pessoa` VALUES (30, 'Ana', 'Luiza', '04-02-1992', 'Feminino', 'ana@gmail.com', '(41) 1010-1010', 'aninha', 'ana123');
INSERT INTO `pessoa` VALUES (31, 'Emerson', 'Borges Ferreira', '22-02-1990', 'Masculino', 'emer@ebf.com', '(47) 9997-0000', 'emer', 'ebf123');
INSERT INTO `pessoa` VALUES (32, 'Mario', 'Bros', '22-02-1990', 'Masculino', 'mario@bros.com', '(47) 0000-0000', 'bros1', 'bros1');
INSERT INTO `pessoa` VALUES (34, 'Emerson', 'Ferreira Edite Teste Velho', '22-02-1990', 'Masculino', 'emer@ebf.com', '(47) 9997-0000', 'emer', 'ebf123');
INSERT INTO `pessoa` VALUES (35, 'Danielly', 'Mello', '13-05-1994', 'Feminino', 'dany@gmail.com', '(47) 3040-1010', 'danymello', 'dany123');
INSERT INTO `pessoa` VALUES (36, 'Joao Carlos', 'Terra', '01-01-2001', 'Feminino', 'terra@terra.com', '(47) 3040-1010', 'terranova', 'TERRA2');
INSERT INTO `pessoa` VALUES (37, 'Carlos', 'Almeida', '22-02-1999', 'Masculino', 'joao@gmail.com', '(48) 9999-9999', 'joao', 'j1234');
INSERT INTO `pessoa` VALUES (38, 'Ana', 'Maria', '11-01-1990', 'Feminino', 'ana@mail.com', '(22) 2222-2222', 'ana3', 'YW5hMTIz');
INSERT INTO `pessoa` VALUES (39, 'Everton', 'Sobrenome Teste', '22-02-1990', 'Masculino', 'everton@gmail.com', '(44) 2222-2222', 'ever', '1234e');

SET FOREIGN_KEY_CHECKS = 1;

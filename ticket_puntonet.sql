/*
 Navicat Premium Data Transfer

 Source Server         : proyectoPuntoNet
 Source Server Type    : PostgreSQL
 Source Server Version : 90615
 Source Host           : localhost:5432
 Source Catalog        : proyectoPuntoNet
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 90615
 File Encoding         : 65001

 Date: 24/03/2021 13:47:21
*/


-- ----------------------------
-- Table structure for ticket_puntonet
-- ----------------------------
DROP TABLE IF EXISTS "public"."ticket_puntonet";
CREATE TABLE "public"."ticket_puntonet" (
  "id" serial NOT NULL,
  "detalle_ticket" varchar(100) COLLATE "pg_catalog"."default",
  "estado" varchar(100) COLLATE "pg_catalog"."default",
  "prioridad" varchar(15) COLLATE "pg_catalog"."default",
  "case_owner" varchar(100) COLLATE "pg_catalog"."default",
  "fecha_vencimiento" varchar(100) COLLATE "pg_catalog"."default",
  "ofertas" varchar(1000) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of ticket_puntonet
-- ----------------------------
INSERT INTO "public"."ticket_puntonet" VALUES (1, 'Fallo de conexion', 'Open', 'High', 'Irwin Owner', '26/12/2017', 'Mobile Deal');
INSERT INTO "public"."ticket_puntonet" VALUES (2, 'Fallo de Conexion Norte', 'Open', 'High', 'Irwin Owner', '07/11/2017', 'Mobile Deal');

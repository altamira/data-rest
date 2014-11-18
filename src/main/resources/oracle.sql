--
-- JBoss, Home of Professional Open Source
-- Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
-- contributors by the @authors tag. See the copyright.txt in the
-- distribution for a full listing of individual contributors.
--
-- Licensed under the Apache License, Version 2.0 (the 'License');
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
-- http://www.apache.org/licenses/LICENSE-2.0
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an 'AS IS' BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.
--
-- You can use this file to load seed data into the database using SQL statements

/*
DROP TABLE CM_COLOR;
DROP TABLE MN_BOM;
DROP TABLE MN_BOM_ITEM;
DROP TABLE MN_BOM_ITEM_PART;
DROP TABLE MN_CONSUME;
DROP TABLE MN_OPERATION;
DROP TABLE MN_OPERATION_SKETCH;
DROP TABLE MN_ORDER_ITEM;
DROP TABLE MN_ORDER_ITEM_PART;
DROP TABLE MN_PROCESS;
DROP TABLE MN_PRODUCE;
DROP TABLE MN_REVISION;
DROP TABLE MN_USE;
DROP TABLE MS_MAGNITUDE;
DROP TABLE MS_UNIT;
DROP TABLE PR_MATERIAL;
DROP TABLE PR_REQUEST;
DROP TABLE PR_REQUEST_ITEM;
DROP TABLE SL_ORDER_ITEM;
DROP TABLE SL_ORDER_ITEM_PART;
DROP TABLE SL_PRODUCT;
*/

DROP SEQUENCE ENTITY_SEQUENCE;
CREATE SEQUENCE  ENTITY_SEQUENCE  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
   
DELETE FROM MS_UNIT;
DELETE FROM MS_MAGNITUDE;
DELETE FROM CM_COLOR;

INSERT INTO MS_MAGNITUDE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'dimencional');
INSERT INTO MS_MAGNITUDE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224784029, '18/11/14 20:08:53,796000000', 'peso');
INSERT INTO MS_MAGNITUDE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224786661, '18/11/14 20:08:53,796000000', 'unidade');

INSERT INTO MS_UNIT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME, SYMBOL, MAGNITUDE) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'milimetro', 'mm', 1);
INSERT INTO MS_UNIT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME, SYMBOL, MAGNITUDE) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'metro', 'm', 1);
INSERT INTO MS_UNIT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME, SYMBOL, MAGNITUDE) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'quilograma', 'kg', 2);
INSERT INTO MS_UNIT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME, SYMBOL, MAGNITUDE) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'tonelada', 'TON', 2);
INSERT INTO MS_UNIT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME, SYMBOL, MAGNITUDE) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'unidade', 'un', 3);
INSERT INTO MS_UNIT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME, SYMBOL, MAGNITUDE) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'peças', 'pç', 3);

INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'GALV-F+PAD', 'GALV-F+PAD');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'GALV-E+COR', 'GALV-E+COR');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'S/ PINT', 'S/ PINT');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'AZ-IR', 'AZ-IR');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'BEGE-PAD', 'BEGE-PAD');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'BR-LB', 'BR-LB');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'GALV-E', 'GALV-E');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'BG AM-LB', 'BG AM-LB');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'GALV-F+COR', 'GALV-F+COR');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'AM-LB', 'AM-LB');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'CZ-PAD', 'CINZA TEXTURIZADO A PÓ');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'VD-LB', 'VD-LB');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'CZ CL-LB', 'CZ CL-LB');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'BEGE PAD', 'BEGE PAD');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'AZ-LB', 'AZ-LB');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'GALV-F', 'GALV-F');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'GALV-E+PAD', 'GALV-E+PAD');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'LA-LB', 'LA-LB');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'PR-LF', 'PR-LF');
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '18/11/14 20:08:53,796000000', 'S/ COR', 'S/ COR');

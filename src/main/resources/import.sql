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
INSERT INTO MS_MAGNITUDE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'dimencional')
INSERT INTO MS_MAGNITUDE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224784029, '2014-11-17 09:46:24.035', 'peso')
INSERT INTO MS_MAGNITUDE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224786661, '2014-11-17 09:46:26.666', 'unidade')

INSERT INTO MS_UNIT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME, SYMBOL, MAGNITUDE) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'milimetro', 'mm', 1)
INSERT INTO MS_UNIT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME, SYMBOL, MAGNITUDE) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'metro', 'm', 1)
INSERT INTO MS_UNIT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME, SYMBOL, MAGNITUDE) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'quilograma', 'kg', 2)
INSERT INTO MS_UNIT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME, SYMBOL, MAGNITUDE) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'tonelada', 'TON', 2)
INSERT INTO MS_UNIT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME, SYMBOL, MAGNITUDE) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'unidade', 'un', 3)
INSERT INTO MS_UNIT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, NAME, SYMBOL, MAGNITUDE) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'peças', 'pç', 3)

INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'GALV-F+PAD', 'GALV-F+PAD')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'GALV-E+COR', 'GALV-E+COR')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'S/ PINT', 'S/ PINT')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'AZ-IR', 'AZ-IR')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'BEGE-PAD', 'BEGE-PAD')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'BR-LB', 'BR-LB')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'GALV-E', 'GALV-E')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'BG AM-LB', 'BG AM-LB')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'GALV-F+COR', 'GALV-F+COR')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'AM-LB', 'AM-LB')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'CZ-PAD', 'CINZA TEXTURIZADO A PÓ')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'VD-LB', 'VD-LB')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'CZ CL-LB', 'CZ CL-LB')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'BEGE PAD', 'BEGE PAD')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'AZ-LB', 'AZ-LB')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'GALV-F', 'GALV-F')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'GALV-E+PAD', 'GALV-E+PAD')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'LA-LB', 'LA-LB')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'PR-LF', 'PR-LF')
INSERT INTO CM_COLOR (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION, CODE, NAME) VALUES (ENTITY_SEQUENCE.NEXTVAL, NULL, 1416224781473, '2014-11-17 09:46:21.495', 'S/ COR', 'S/ COR')
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


ALTER SEQUENCE "MEASUREMENT_SEQUENCE" RESTART WITH 10000;
ALTER SEQUENCE "PROCESS_SEQUENCE" RESTART WITH 10000;
ALTER SEQUENCE "PROPERTY_SEQUENCE" RESTART WITH 10000;
ALTER SEQUENCE "RELATION_SEQUENCE" RESTART WITH 10000;
ALTER SEQUENCE "RESOURCE_SEQUENCE" RESTART WITH 10000;

INSERT INTO MR_MEASUREMENT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1,    'br.com.altamira.data.model.measurement.Magnitude', '1416224781473', '2014-11-17 09:46:21.495');
INSERT INTO MR_MEASUREMENT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (2,    'br.com.altamira.data.model.measurement.Magnitude', '1416224784029', '2014-11-17 09:46:21.495');
INSERT INTO MR_MEASUREMENT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (3,    'br.com.altamira.data.model.measurement.Magnitude', '1416224786661', '2014-11-17 09:46:21.495');
INSERT INTO MR_MEASUREMENT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (4,    'br.com.altamira.data.model.measurement.Magnitude', '1416358404297', '2014-11-17 09:46:21.495');
INSERT INTO MR_MEASUREMENT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (110,  'br.com.altamira.data.model.measurement.Unit',      '1416358480370', '2014-11-17 09:46:21.495');
INSERT INTO MR_MEASUREMENT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (111,  'br.com.altamira.data.model.measurement.Unit',      '1416358494877', '2014-11-17 09:46:21.495');
INSERT INTO MR_MEASUREMENT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (112,  'br.com.altamira.data.model.measurement.Unit',      '1416358512479', '2014-11-17 09:46:21.495');
INSERT INTO MR_MEASUREMENT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (104,  'br.com.altamira.data.model.measurement.Unit',      '1416224781473', '2014-11-17 09:46:21.495');
INSERT INTO MR_MEASUREMENT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (105,  'br.com.altamira.data.model.measurement.Unit',      '1416224781473', '2014-11-17 09:46:21.495');
INSERT INTO MR_MEASUREMENT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (106,  'br.com.altamira.data.model.measurement.Unit',      '1416224781473', '2014-11-17 09:46:21.495');
INSERT INTO MR_MEASUREMENT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (107,  'br.com.altamira.data.model.measurement.Unit',      '1416224781473', '2014-11-17 09:46:21.495');
INSERT INTO MR_MEASUREMENT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (108,  'br.com.altamira.data.model.measurement.Unit',      '1416224781473', '2014-11-17 09:46:21.495');
INSERT INTO MR_MEASUREMENT (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (109,  'br.com.altamira.data.model.measurement.Unit',      '1416224781473', '2014-11-17 09:46:21.495');

INSERT INTO MS_MAGNITUDE (ID,NAME) values (1, 'dimencional');
INSERT INTO MS_MAGNITUDE (ID,NAME) values (2, 'peso');
INSERT INTO MS_MAGNITUDE (ID,NAME) values (3, 'tempo');
INSERT INTO MS_MAGNITUDE (ID,NAME) values (4, 'unidade');

INSERT INTO MS_UNIT (ID, NAME, SYMBOL, MAGNITUDE) values (110, 'minuto',        'min',  '4');
INSERT INTO MS_UNIT (ID, NAME, SYMBOL, MAGNITUDE) values (111, 'segundo',       's',    '4');
INSERT INTO MS_UNIT (ID, NAME, SYMBOL, MAGNITUDE) values (112, 'hora',          'h',    '4');
INSERT INTO MS_UNIT (ID, NAME, SYMBOL, MAGNITUDE) values (104, 'milimetro',     'mm',   '1');
INSERT INTO MS_UNIT (ID, NAME, SYMBOL, MAGNITUDE) values (105, 'metro',         'm',    '1');
INSERT INTO MS_UNIT (ID, NAME, SYMBOL, MAGNITUDE) values (106, 'quilograma',    'kg',   '2');
INSERT INTO MS_UNIT (ID, NAME, SYMBOL, MAGNITUDE) values (107, 'tonelada',      'TON',  '2');
INSERT INTO MS_UNIT (ID, NAME, SYMBOL, MAGNITUDE) values (108, 'unidade',       'un',   '3');
INSERT INTO MS_UNIT (ID, NAME, SYMBOL, MAGNITUDE) values (109, 'peças',         'pç',   '3');

INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (10,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (11,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (12,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (13,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (14,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (15,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (16,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (17,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (18,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (19,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (20,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (21,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (22,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (23,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (24,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (25,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (26,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (27,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (28,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');
INSERT INTO MR_PROPERTY (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (29,'br.com.altamira.data.model.common.Color','1416224781473','2014-11-17 09:46:21.495');

INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1049, 'br.com.altamira.data.model.manufacture.process.Process',   '1417289819895','2014-11-17 09:46:21.495');
INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1031, 'br.com.altamira.data.model.manufacture.process.Process',   '1417019817563','2014-11-17 09:46:21.495');
INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1025, 'br.com.altamira.data.model.manufacture.process.Process',   '1416600352960','2014-11-17 09:46:21.495');
INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1001, 'br.com.altamira.data.model.manufacture.process.Process',   '1417019839393','2014-11-17 09:46:21.495');
INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1019, 'br.com.altamira.data.model.manufacture.process.Process',   '1417471735242','2014-11-17 09:46:21.495');
INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1042, 'br.com.altamira.data.model.manufacture.process.Operation', '1416585330805','2014-11-17 09:46:21.495');
INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1055, 'br.com.altamira.data.model.manufacture.process.Operation', '1416588696369','2014-11-17 09:46:21.495');
INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1026, 'br.com.altamira.data.model.manufacture.process.Operation', '1416577304000','2014-11-17 09:46:21.495');
INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1050, 'br.com.altamira.data.model.manufacture.process.Operation', '1416587768576','2014-11-17 09:46:21.495');
INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1008, 'br.com.altamira.data.model.manufacture.process.Operation', '1416573564717','2014-11-17 09:46:21.495');
INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1032, 'br.com.altamira.data.model.manufacture.process.Operation', '1416579679390','2014-11-17 09:46:21.495');
INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1002, 'br.com.altamira.data.model.manufacture.process.Operation', '1416572320486','2014-11-17 09:46:21.495');
INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1014, 'br.com.altamira.data.model.manufacture.process.Operation', '1416573511980','2014-11-17 09:46:21.495');
INSERT INTO MR_PROCESS (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (1020, 'br.com.altamira.data.model.manufacture.process.Operation', '1416576952115','2014-11-17 09:46:21.495');

INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1016','br.com.altamira.data.model.manufacturing.process.Use','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1004','br.com.altamira.data.model.manufacturing.process.Use','1417020541235','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1011','br.com.altamira.data.model.manufacturing.process.Use','1416572701642','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1022','br.com.altamira.data.model.manufacturing.process.Use','1417125633620','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1028','br.com.altamira.data.model.manufacturing.process.Use','1416663586701','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1034','br.com.altamira.data.model.manufacturing.process.Use','1416579013980','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1052','br.com.altamira.data.model.manufacturing.process.Use','1417019351203','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1044','br.com.altamira.data.model.manufacturing.process.Use','1416586330789','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1057','br.com.altamira.data.model.manufacturing.process.Use','1416588736142','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1035','br.com.altamira.data.model.manufacturing.process.Use','1416579100129','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1029','br.com.altamira.data.model.manufacturing.process.Consume','1417115093941','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1058','br.com.altamira.data.model.manufacturing.process.Consume','1416588807787','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1038','br.com.altamira.data.model.manufacturing.process.Consume','1416579383397','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1007','br.com.altamira.data.model.manufacturing.process.Consume','1416572187773','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1040','br.com.altamira.data.model.manufacturing.process.Consume','1416579608775','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1041','br.com.altamira.data.model.manufacturing.process.Consume','1416585742329','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1053','br.com.altamira.data.model.manufacturing.process.Consume','1416855967818','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1059','br.com.altamira.data.model.manufacturing.process.Consume','1416589087955','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1012','br.com.altamira.data.model.manufacturing.process.Consume','1416573002740','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1037','br.com.altamira.data.model.manufacturing.process.Consume','1417013478986','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1046','br.com.altamira.data.model.manufacturing.process.Consume','1416586412094','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1047','br.com.altamira.data.model.manufacturing.process.Consume','1416586622446','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1017','br.com.altamira.data.model.manufacturing.process.Consume','1416589247274','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1023','br.com.altamira.data.model.manufacturing.process.Consume','1416598603984','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1045','br.com.altamira.data.model.manufacturing.process.Consume','1416586195952','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1054','br.com.altamira.data.model.manufacturing.process.Produce','1416588578441','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1013','br.com.altamira.data.model.manufacturing.process.Produce','1416591863378','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1039','br.com.altamira.data.model.manufacturing.process.Produce','1416585985370','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1060','br.com.altamira.data.model.manufacturing.process.Produce','1416589320613','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1018','br.com.altamira.data.model.manufacturing.process.Produce','1416573921285','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1030','br.com.altamira.data.model.manufacturing.process.Produce','1416578028706','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1006','br.com.altamira.data.model.manufacturing.process.Produce','1416571633628','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1024','br.com.altamira.data.model.manufacturing.process.Produce','1416598873350','2014-11-17 09:46:21.495');
INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1048','br.com.altamira.data.model.manufacturing.process.Produce','1417084155703','2014-11-17 09:46:21.495');

INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1016','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1004','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1011','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1022','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1028','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1034','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1052','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1044','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1057','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1035','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1029','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1058','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1038','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1007','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1040','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1041','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1053','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1059','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1012','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1037','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1046','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1047','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1017','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1023','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1045','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1054','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1013','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1039','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1060','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1018','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1030','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1006','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1024','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1048','br.com.altamira.data.model.common.Material','1416586290997','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1062','br.com.altamira.data.model.manufacture.process.Sketch','1417471767795','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1064','br.com.altamira.data.model.manufacture.process.Sketch','1417471897874','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1063','br.com.altamira.data.model.manufacture.process.Sketch','1417471860953','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1065','br.com.altamira.data.model.manufacture.process.Sketch','1417471931513','2014-11-17 09:46:21.495');
INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values ('1061','br.com.altamira.data.model.manufacture.process.Sketch','1417471742451','2014-11-17 09:46:21.495');

-- USE CASE DISTANCIADOR
--INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (10001,'br.com.altamira.data.model.manufacture.Inputs','1417471742451','2014-11-17 09:46:21.495');
--INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (10002,'br.com.altamira.data.model.manufacture.Inputs','1417471742451','2014-11-17 09:46:21.495');
--INSERT INTO MR_RESOURCE (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) values (10003,'br.com.altamira.data.model.manufacture.Inputs','1417471742451','2014-11-17 09:46:21.495');

INSERT INTO CM_COLOR (ID,CODE,NAME) values ('10','GALV-F+PAD','GALV-F+PAD');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('11','GALV-E+COR','GALV-E+COR');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('12','S/ PINT','S/ PINT');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('13','AZ-IR','AZ-IR');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('14','BEGE-PAD','BEGE-PAD');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('15','BR-LB','BR-LB');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('16','GALV-E','GALV-E');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('17','BG AM-LB','BG AM-LB');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('18','GALV-F+COR','GALV-F+COR');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('19','AM-LB','AM-LB');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('20','CZ-PAD','CINZA TEXTURIZADO A PÓ');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('21','VD-LB','VD-LB');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('22','CZ CL-LB','CZ CL-LB');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('23','BEGE PAD','BEGE PAD');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('24','AZ-LB','AZ-LB');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('25','GALV-F','GALV-F');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('26','GALV-E+PAD','GALV-E+PAD');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('27','LA-LB','LA-LB');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('28','PR-LF','PR-LF');
INSERT INTO CM_COLOR (ID,CODE,NAME) values ('29','S/ COR','S/ COR');

INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1016','LINHATRATPINT3','LINHA DE TRATAMENTO E PINTURA 3');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1004','PR 250 TON','PRENSA EXCENTRICA 250 TON CURSO 65 MM');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1011','PERFCOLPPNORMAL','PERFILADEIRA COLUNA P.PALLETS NORMAL');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1022','PERFLONGSG120','PERFILADEIRA LONGARINA SG 120');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1028','PR 250 TON1','PRENSA EXCENTRICA 250 TON CURSO 65 MM1');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1034','GABSOLDMIG-1','GABARITO DE SOLDA - CELULA');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1052','PERFTRAVPPL150','PERFILADEIRA TRAVESSA PPL');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1044','LINHATRATPINT1','LINHA DE TRATAMENTO E PINTURA1');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1057','LINHATRATPINT2','LINHA DE TRATAMENTO E PINTURA2');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1035','MAQSOLDMIG','MAQUINA DE SOLDA MIG');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1029','ALPRDE30-KG26500F200','AÇO LAMINADO PLANO FQ ROLO 30KG/MM2 DECAP 2,65 MM ESP FITA 200 MM');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1058','PPLTRATRAVE152000000-10-1','PERFIL TRAVESSA PPL 1,55');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1038','GAS00000000','MISTURA DE GAS');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1007','ALPRFQ30-KG20000F240-1','AÇO LAM. PLANO FQ PRETO ROLO 30KG/MM2 ESP FITA 240 MM-1');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1040','PPLGAR00000000000080-1','GARRA NOVA PORTA PALLET X');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1041','PPPSIG14120240000000-1','PERFIL LONG SG120 2,00 X');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1053','ALPRFQ30-KG15200F085','ACO LAMINADO PLANO FQ ROLO 30KG/MM2 1,55 ESP FITA 85 MM');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1059','TPO00000000000000000','TINTA EM PO');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1012','PPLCOL00080200000000-10-1','COLUNA NORMAL 2,00 MM - BLANK (SEM PINTURA) x');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1037','ARAMESOLDMIG15','ARAME DE SOLDA MIG ESP 1,5');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1046','PPLSIG14120L24000000-10-3','LONGARINA SIG120 2,00 3');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1047','TPO00000000000000000-1','TINTA EM PÓ-1');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1017','TPO00000000000000000-2','TINTA EM PÓ-2');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1023','ALPRFQ30-KG20000F240','AÇO LAM. PLANO FQ PRETO ROLO 30KG/MM2 ESP FITA 240 MM');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1045','PPLCOL00080200000000-20-3','PERFIL COLUNA P.PALLETS NORMAL 2,00 MM - 3');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1054','PPLTRATRAVE152000000-10','TRAVESSA PPL 1,55');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1013','PPLCOL00080200000000-20','PERFIL COLUNA P.PALLETS NORMAL 2,00 MM');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1039','PPLSIG14120L24000000-10','LONGARINA SIG120 2,00');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1060','PPLTRATRAVE155000000','TRAVESSA PPL 1,55 - X');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1018','PPLCOL00080200000000','COLUNA P.PALLETS NORMAL 2,00 MM');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1030','PPLGAR00000000000080','GARRA NOVA PORTA PALLET');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1006','PPLCOL00080200000000-10','COLUNA NORMAL 2,00 MM - BLANK (SEM PINTURA)');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1024','PPPSIG14120240000000','PERFIL LONG SG120 2,00');
INSERT INTO CM_MATERIAL (ID,CODE,DESCRIPTION) values ('1048','PPLSIG14120L24000000','LONGARINA SG120 2,00');

INSERT INTO MR_RELATION (ID, ENTITY_CLASS, LAST_MODIFIED, VERSION) VALUES (NEXTVAL('RELATION_SEQUENCE'), 'br.com.altamira.data.model.manufacturing.common.Component', 1416586290997,	'2014-11-17 09:46:21.495');

INSERT INTO CM_COMPONENT (ID, PARENT, MATERIAL, QUANTITY_VAL, QUANTITY_UNIT) VALUES (1001, 1004, 1016, 1, 108);

INSERT INTO MN_PROCESS (ID,CODE,COLOR,DESCRIPTION,FINISH,LENGTH,WEIGHT,WIDTH) values ('1049','PPLTRATRAVE155000000',null,'TRAVESSA PPL ESP 1,55',null,'0','0','0');
INSERT INTO MN_PROCESS (ID,CODE,COLOR,DESCRIPTION,FINISH,LENGTH,WEIGHT,WIDTH) values ('1031','PPLSIG14120L24000000',null,'LONGARINA SG120 2,00',null,'0','0','0');
INSERT INTO MN_PROCESS (ID,CODE,COLOR,DESCRIPTION,FINISH,LENGTH,WEIGHT,WIDTH) values ('1025','PPLGAR00000000000080',null,'GARRA NOVA PORTA PALLET',null,'0','0','0');
INSERT INTO MN_PROCESS (ID,CODE,COLOR,DESCRIPTION,FINISH,LENGTH,WEIGHT,WIDTH) values ('1001','PPLCOL00080200000000',null,'COLUNA NORMAL 2,00',null,'0','0','0');
INSERT INTO MN_PROCESS (ID,CODE,COLOR,DESCRIPTION,FINISH,LENGTH,WEIGHT,WIDTH) values ('1019','PPPSIG14120240000000',null,'PERFIL LONGARINA SG120 2,00',null,'0','0','0');

INSERT INTO MN_OPERATION (ID,DESCRIPTION,NAME,SEQ,PROCESS) values ('1042','PINTURA LONGARINA SG120 2,00','PINTURA','20','1031');
INSERT INTO MN_OPERATION (ID,DESCRIPTION,NAME,SEQ,PROCESS) values ('1055','PINTURA PERFIL TRAVESSA PPL 1,55','PINTURA','20','1049');
INSERT INTO MN_OPERATION (ID,DESCRIPTION,NAME,SEQ,PROCESS) values ('1026','ESTAMPAR GARRA NOVA PORTA PALLETS','PRENSA','10','1025');
INSERT INTO MN_OPERATION (ID,DESCRIPTION,NAME,SEQ,PROCESS) values ('1050','PERFILAR TRAVESSA PPL 1,50','PERFILADEIRA','10','1049');
INSERT INTO MN_OPERATION (ID,DESCRIPTION,NAME,SEQ,PROCESS) values ('1008','PERFILAR BLANK 240 MM LARG. ESP. 2,00 MM PARA FORMAR O PERFIL DA COLUNA P. PALLETS NORMAL 2,00 MM','PERFILADEIRA','20','1001');
INSERT INTO MN_OPERATION (ID,DESCRIPTION,NAME,SEQ,PROCESS) values ('1032','SOLDA GARRA NOVA NO PERFIL LONGARINA SG120 2,00','SOLDA','10','1031');
INSERT INTO MN_OPERATION (ID,DESCRIPTION,NAME,SEQ,PROCESS) values ('1002','ESTAMPAR BLANK (FITA) COLUNA P.PALLETS 2,00 MM','PRENSA','10','1001');
INSERT INTO MN_OPERATION (ID,DESCRIPTION,NAME,SEQ,PROCESS) values ('1014','PINTURA PERFIL COLUNA P.PALLETS NORMAL 2,00 MM','PINTURA','30','1001');
INSERT INTO MN_OPERATION (ID,DESCRIPTION,NAME,SEQ,PROCESS) values ('1020','PERFILAR LONGARINA SG120 2,00','PERFILADEIRA','10','1019');

INSERT INTO MN_USE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1016','2','1014','110','1016');
INSERT INTO MN_USE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1004','0.07','1002','110','1004');
INSERT INTO MN_USE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1011','1','1008','108','1011');
INSERT INTO MN_USE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1022','0.07','1020','110','1022');
INSERT INTO MN_USE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1028','0.07','1026','110','1028');
INSERT INTO MN_USE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1034','1','1032','108','1034');
INSERT INTO MN_USE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1052','0.07','1050','110','1052');
INSERT INTO MN_USE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1044','1','1042','110','1044');
INSERT INTO MN_USE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1057','3','1055','110','1057');
INSERT INTO MN_USE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1035','0.2','1032','110','1035');

INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1029','0.82','1026','106','1029');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1058','1000','1055','104','1058');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1038','0.01','1032','106','1038');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1007','3.77','1002','106','1007');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1040','2','1032','108','1040');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1041','1','1032','108','1041');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1053','1.03','1050','106','1053');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1059','0.02','1055','106','1059');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1012','1','1008','108','1012');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1037','0.01','1032','106','1037');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1046','1','1042','108','1046');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1047','0.09','1042','106','1047');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1017','0.08','1014','106','1017');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1023','1000.01','1020','104','1023');
INSERT INTO MN_CONSUME (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1045','1','1014','108','1045');

INSERT INTO MN_PRODUCE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1054','1000','1050','104','1054');
INSERT INTO MN_PRODUCE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1013','1','1008','108','1013');
INSERT INTO MN_PRODUCE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1039','1','1032','108','1039');
INSERT INTO MN_PRODUCE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1060','1','1055','108','1060');
INSERT INTO MN_PRODUCE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1018','1','1014','108','1018');
INSERT INTO MN_PRODUCE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1030','2','1026','108','1030');
INSERT INTO MN_PRODUCE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1006','1000','1002','104','1006');
INSERT INTO MN_PRODUCE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1024','1000','1020','104','1024');
INSERT INTO MN_PRODUCE (ID,QUANTITY_VAL,OPERATION,QUANTITY_UNIT,MATERIAL) values ('1048','1','1042','108','1048');

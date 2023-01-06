CREATE TABLE "dall_e_connector$dalle_request_dalle_response" (
	"dall_e_connector$dalle_requestid" BIGINT NOT NULL,
	"dall_e_connector$dalle_responseid" BIGINT NOT NULL,
	PRIMARY KEY("dall_e_connector$dalle_requestid","dall_e_connector$dalle_responseid"),
	CONSTRAINT "uniq_dall_e_connector$dalle_request_dalle_response_dall_e_connector$dalle_responseid" UNIQUE ("dall_e_connector$dalle_responseid"),
	CONSTRAINT "uniq_dall_e_connector$dalle_request_dalle_response_dall_e_connector$dalle_requestid" UNIQUE ("dall_e_connector$dalle_requestid"));
CREATE INDEX "idx_dall_e_connector$dalle_request_dalle_response_dall_e_connector$dalle_response_dall_e_connector$dalle_request" ON "dall_e_connector$dalle_request_dalle_response" ("dall_e_connector$dalle_responseid" ASC,"dall_e_connector$dalle_requestid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('f61d2ce6-ade7-4959-bc4c-10b3197e9b8d', 
'DALL_E_Connector.DALLE_Request_DALLE_Response', 
'dall_e_connector$dalle_request_dalle_response', 
'1dbf17aa-c3bd-483f-97a2-68f6cbf726dd', 
'44a74ba0-87b9-4a5c-97d6-b7efd00a6eaf', 
'dall_e_connector$dalle_requestid', 
'dall_e_connector$dalle_responseid', 
'idx_dall_e_connector$dalle_request_dalle_response_dall_e_connector$dalle_response_dall_e_connector$dalle_request');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_dall_e_connector$dalle_request_dalle_response_dall_e_connector$dalle_responseid', 
'f61d2ce6-ade7-4959-bc4c-10b3197e9b8d', 
'18e90bc9-752a-32eb-bc2f-7ab881f10b21');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_dall_e_connector$dalle_request_dalle_response_dall_e_connector$dalle_requestid', 
'f61d2ce6-ade7-4959-bc4c-10b3197e9b8d', 
'3e3a9db1-eebf-33ac-8698-88675dc9a0aa');
CREATE TABLE "dall_e_connector$data" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('d8881898-555a-463b-88b2-a8d7b0da9128', 
'DALL_E_Connector.Data', 
'dall_e_connector$data', 
false, 
false);
CREATE TABLE "dall_e_connector$data_dalle_response" (
	"dall_e_connector$dataid" BIGINT NOT NULL,
	"dall_e_connector$dalle_responseid" BIGINT NOT NULL,
	PRIMARY KEY("dall_e_connector$dataid","dall_e_connector$dalle_responseid"),
	CONSTRAINT "uniq_dall_e_connector$data_dalle_response_dall_e_connector$dalle_responseid" UNIQUE ("dall_e_connector$dalle_responseid"),
	CONSTRAINT "uniq_dall_e_connector$data_dalle_response_dall_e_connector$dataid" UNIQUE ("dall_e_connector$dataid"));
CREATE INDEX "idx_dall_e_connector$data_dalle_response_dall_e_connector$dalle_response_dall_e_connector$data" ON "dall_e_connector$data_dalle_response" ("dall_e_connector$dalle_responseid" ASC,"dall_e_connector$dataid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('57796b62-f856-4cba-bbb4-023e5960b0a9', 
'DALL_E_Connector.Data_DALLE_Response', 
'dall_e_connector$data_dalle_response', 
'd8881898-555a-463b-88b2-a8d7b0da9128', 
'44a74ba0-87b9-4a5c-97d6-b7efd00a6eaf', 
'dall_e_connector$dataid', 
'dall_e_connector$dalle_responseid', 
'idx_dall_e_connector$data_dalle_response_dall_e_connector$dalle_response_dall_e_connector$data');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_dall_e_connector$data_dalle_response_dall_e_connector$dalle_responseid', 
'57796b62-f856-4cba-bbb4-023e5960b0a9', 
'279b989b-bbd2-32d8-b05f-82b6f8f78067');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_dall_e_connector$data_dalle_response_dall_e_connector$dataid', 
'57796b62-f856-4cba-bbb4-023e5960b0a9', 
'b7ae2b88-515f-35c9-81b9-71cdb3bf8557');
CREATE TABLE "dall_e_connector$jsonobject" (
	"id" BIGINT NOT NULL,
	"url" VARCHAR_IGNORECASE(2147483647) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('80ed98d0-3441-4d38-b616-eaa4275137d0', 
'DALL_E_Connector.JsonObject', 
'dall_e_connector$jsonobject', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('9b0b3bd4-5e2c-47e2-b29d-9a2ec833ac21', 
'80ed98d0-3441-4d38-b616-eaa4275137d0', 
'Url', 
'url', 
30, 
0, 
'', 
false);
CREATE TABLE "dall_e_connector$jsonobject_data" (
	"dall_e_connector$jsonobjectid" BIGINT NOT NULL,
	"dall_e_connector$dataid" BIGINT NOT NULL,
	PRIMARY KEY("dall_e_connector$jsonobjectid","dall_e_connector$dataid"),
	CONSTRAINT "uniq_dall_e_connector$jsonobject_data_dall_e_connector$jsonobjectid" UNIQUE ("dall_e_connector$jsonobjectid"));
CREATE INDEX "idx_dall_e_connector$jsonobject_data_dall_e_connector$data_dall_e_connector$jsonobject" ON "dall_e_connector$jsonobject_data" ("dall_e_connector$dataid" ASC,"dall_e_connector$jsonobjectid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('f0bba71a-5bb6-4f3e-99ad-57762a182c4a', 
'DALL_E_Connector.JsonObject_Data', 
'dall_e_connector$jsonobject_data', 
'80ed98d0-3441-4d38-b616-eaa4275137d0', 
'd8881898-555a-463b-88b2-a8d7b0da9128', 
'dall_e_connector$jsonobjectid', 
'dall_e_connector$dataid', 
'idx_dall_e_connector$jsonobject_data_dall_e_connector$data_dall_e_connector$jsonobject');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_dall_e_connector$jsonobject_data_dall_e_connector$jsonobjectid', 
'f0bba71a-5bb6-4f3e-99ad-57762a182c4a', 
'1786abe0-cb9a-389d-82ad-b93ce574a258');
CREATE TABLE "dall_e_connector$dalle_response" (
	"id" BIGINT NOT NULL,
	"created" INT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('44a74ba0-87b9-4a5c-97d6-b7efd00a6eaf', 
'DALL_E_Connector.DALLE_Response', 
'dall_e_connector$dalle_response', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('f12a66c1-d425-44f9-bf2b-106b6134a91b', 
'44a74ba0-87b9-4a5c-97d6-b7efd00a6eaf', 
'Created', 
'created', 
3, 
0, 
'0', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230103 17:31:03';

CREATE TABLE "CUSTOMERS" ("ID" INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"CUSTOMER_NAME" VARCHAR(255), "CUSTOMER_EMAIL" VARCHAR(255), "PASSWORD" VARCHAR(255));
CREATE TABLE "EVENTS" ("ID" INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"CUSTOMER_NAME" VARCHAR(255), "CUSTOMER_EMAIL" VARCHAR(255), "PASSWORD" VARCHAR(255));
CREATE TABLE "REGITRATIONS" ("ID" INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"CUSTOMER_NAME" VARCHAR(255), "CUSTOMER_EMAIL" VARCHAR(255), "PASSWORD" VARCHAR(255));

ALTER TABLE "CUSTOMERS" ADD CONSTRAINT "SQL120325130144012" PRIMARY KEY ("ID");
ALTER TABLE "EVENTS" ADD CONSTRAINT "SQL120325130144013" PRIMARY KEY ("ID");
ALTER TABLE "REGISTRATIONS" ADD CONSTRAINT "SQL120325130144014" PRIMARY KEY ("ID");
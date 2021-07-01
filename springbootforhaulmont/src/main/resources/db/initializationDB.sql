
CREATE TABLE BANK (
                      BANK_ID uuid not null,
                      BANK_NAME varchar not null,
                      PRIMARY KEY (BANK_ID)
);

CREATE TABLE CLIENT (
                        CLIENT_ID uuid not null,
                        FIRST_NAME varchar not null,
                        MIDDLE_NAME varchar not null,
                        LAST_NAME varchar not null,
                        PHONE_NUMBER varchar not null,
                        EMAIL varchar not null,
                        PASSPORT_NUMBER varchar not null,
                        PRIMARY KEY (CLIENT_ID),
                        BANK_ID uuid,
                        CONSTRAINT FK_CLIENT_BANK_ID REFERENCES BANK(BANK_ID)


);

create table Credit (
                        CREDIT_ID uuid not null,
                        LIMIT_OF_MONEY numeric not null,
                        CREDIT_PERCENTAGE numeric not null,
                        TYPE_OF_CREDIT varchar not null,
                        PRIMARY KEY (CREDIT_ID),
                        BANK_ID uuid,
                        CONSTRAINT FK_CREDIT_BANK_ID REFERENCES BANK(BANK_ID)

);

create table Offer_of_credit (
                              OFFER_OF_CREDIT_ID uuid not null,
                              SUM numeric not null,
                              NAME_OF_CREDIT varchar not null,
                              SUM_OF_PERCENT numeric not null,
                              FIRST_PAYMENT numeric not null,
                              CREDIT_TERM int not null,
                              TAKE_DATE_OF_CREDIT varchar not null,
                              PRIMARY KEY (OFFER_OF_CREDIT_ID),
                              BANK_ID uuid,
                              CONSTRAINT FK_OFFER_OF_CREDIT_BANK_ID REFERENCES BANK(BANK_ID),
                              CLIENT_ID uuid
                              CONSTRAINT FK_OFFER_OF_CREDIT_CLIENT_ID REFERENCES CLIENT(CLIENT_ID),
                              CREDIT_ID uuid
                              CONSTRAINT FK_OFFER_OF_CREDIT_CREDIT_ID REFERENCES CREDIT(CREDIT_ID)

);

create table Schedule_of_payment (
                                  SCHEDULE_OF_PAYMENT_ID uuid not null,
                                  DATE_OF_PAYMENT date not null,
                                  REPAYMENT_REMAINS numeric,
                                  AMOUNT_OF_PAYMENT numeric not null,
                                  AMOUNT_OF_PAYMENT_PER_BODY numeric not null,
                                  AMOUNT_OF_REPAYMENT_PERCENT numeric not null,
                                  PRIMARY KEY (SCHEDULE_OF_PAYMENT_ID),
                                  OFFER_OF_CREDIT_ID uuid,
                                  CONSTRAINT FK_OFFER_OF_CREDIT_ID REFERENCES OFFER_OF_CREDIT(OFFER_OF_CREDIT_ID)

);
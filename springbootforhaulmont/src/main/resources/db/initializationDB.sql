
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
                        BANK_ID uuid


);

create table Credit (
                        CREDIT_ID uuid not null,
                        LIMIT_OF_MONEY numeric not null,
                        CREDIT_PERCENTAGE numeric not null,
                        BANK_OD uuid,
                        TYPE_OF_CREDIT varchar not null,
                        PRIMARY KEY (CREDIT_ID)

);

create table Offer_of_credit (
                              OFFER_OF_CREDIT_ID uuid not null,
                              CLIENT_ID uuid,
                              CREDIT_ID uuid,
                              NAME_OF_CREDIT varchar not null,
                              SUM_OF_PERCENT numeric not null,
                              FIRST_PAYMENT numeric not null,
                              CREDIT_TERM int not null,
                              BANK_ID uuid,
                              TAKE_DATE_OF_CREDIT date not null,
                              PRIMARY KEY (OFFER_OF_CREDIT_ID)

);

create table Schedule_of_payment (
                                  SCHEDULE_OF_PAYMENT_ID uuid not null,
                                  DATE_OF_PAYMENT date not null,
                                  AMOUNT_OF_PAYMENT numeric not null,
                                  AMOUNT_OF_PAYMENT_PER_BODY numeric not null,
                                  AMOUNT_OF_REPAYMENT_PERCENT numeric not null,
                                  OFFER_OF_CREDIT_ID uuid,
                                  PRIMARY KEY (SCHEDULE_OF_PAYMENT_ID)

);
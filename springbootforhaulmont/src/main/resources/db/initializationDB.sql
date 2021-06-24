DROP TABLE Schedule_of_payment IF EXISTS CASCADE;
DROP TABLE Offer_of_credit IF EXISTS CASCADE;
DROP TABLE Credit IF EXISTS;
DROP TABLE Client IF EXISTS;
DROP TABLE Bank IF EXISTS;

CREATE TABLE Bank (
                      bank_id uuid not null,
                      bank_name varchar not null,
                      PRIMARY KEY (bank_id)
);

CREATE TABLE Client (
                        client_id uuid not null,
                        first_name varchar not null,
                        last_name varchar not null,
                        phone_number int not null,
                        email varchar not null,
                        passport_number varchar not null,
                        PRIMARY KEY (client_id),
                        bank_id uuid


);

create table Credit (
                        credit_id uuid not null,
                        limit_of_money numeric not null,
                        credit_percentage numeric not null,
                        bank_id uuid,
                        type_of_credit varchar not null,
                        PRIMARY KEY (credit_id)

);

create table Offer_of_credit (
                              offer_of_credit_id uuid not null,
                              Client_id uuid,
                              Credit_id uuid,
                              name_of_credit varchar not null,
                              sum_of_percent numeric not null,
                              first_payment numeric not null,
                              credit_term int not null,
                              Bank_id uuid,
                              take_date_of_credit date not null,
                              PRIMARY KEY (offer_of_credit_id)

);

create table Schedule_of_payment (
                                  schedule_of_payment_id uuid not null,
                                  date_of_payment date not null,
                                  amount_of_payment numeric not null,
                                  amount_of_payment_per_body numeric not null,
                                  amount_of_repayment_percent numeric not null,
                                  offer_of_credit_id uuid,
                                  PRIMARY KEY (schedule_of_payment_id)

);
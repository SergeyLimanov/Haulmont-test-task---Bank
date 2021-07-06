
CREATE TABLE Bank (
                      bank_id uuid not null,
                      bank_name varchar not null,
                      PRIMARY KEY (bank_id)
);


create table Credit (
                        credit_id uuid not null,
                        type_of_credit varchar,
                        limit_of_money numeric,
                        credit_percentage numeric,
                        bank_id uuid,
                        PRIMARY KEY (credit_id)

);

CREATE TABLE Client (
                        client_id uuid not null,
                        first_name varchar,
                        middle_name varchar,
                        last_name varchar,
                        phone_number varchar,
                        email varchar,
                        passport_number varchar,
                        bank_id uuid,
                        PRIMARY KEY (client_id)


);


create table Offer_of_credit (
                                 offer_of_credit_id uuid not null,
                                 name_of_credit varchar,
                                 sum numeric,
                                 credit_term int,
                                 first_payment numeric,
                                 sum_of_percent numeric,
                                 Bank_id uuid,
                                 Client_id uuid,
                                 Credit_id uuid,
                                 PRIMARY KEY (offer_of_credit_id)

);

create table Schedule_of_payment (
                                     schedule_of_payment_id uuid not null,
                                     amount_of_payment_per_body numeric,
                                     amount_of_repayment_percent numeric,
                                     amount_of_payment numeric,
                                     date_of_payment date,
                                     repayment_remains numeric,
                                     offer_of_credit_id uuid,
                                     PRIMARY KEY (schedule_of_payment_id)

);
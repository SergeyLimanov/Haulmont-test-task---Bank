
CREATE TABLE Bank (
                      bank_id uuid not null,
                      bank_name varchar not null,
                      PRIMARY KEY (bank_id)
);


create table Credit (
                        credit_id uuid not null,
                        type_of_credit varchar not null,
                        limit_of_money numeric not null,
                        credit_percentage numeric not null,
                        bank_id uuid,
                        PRIMARY KEY (credit_id)

);

CREATE TABLE Client (
                        client_id uuid not null,
                        first_name varchar not null,
                        middle_name varchar not null,
                        last_name varchar not null,
                        phone_number varchar not null,
                        email varchar not null,
                        passport_number varchar not null,
                        bank_id uuid,
                        PRIMARY KEY (client_id)


);


create table Offer_of_credit (
                              offer_of_credit_id uuid not null,
                              name_of_credit varchar not null,
                              sum numeric  not null,
                              credit_term int not null,
                              first_payment numeric not null,
                              sum_of_percent numeric not null,
                              Bank_id uuid,
                              Client_id uuid,
                              Credit_id uuid,
                              PRIMARY KEY (offer_of_credit_id)

);

create table Schedule_of_payment (
                                  schedule_of_payment_id uuid not null,
                                  amount_of_payment_per_body numeric not null,
                                  amount_of_repayment_percent numeric not null,
                                  amount_of_payment numeric not null,
                                  date_of_payment date not null,
                                  remains numeric not null,
                                  offer_of_credit_id uuid,
                                  PRIMARY KEY (schedule_of_payment_id)

);
INSERT INTO bank(BANK_ID, BANK_NAME)

VALUES('39574515-7129-4ac7-90ad-19e063b255c1','first'),
      ('34574515-7129-4ac7-90ad-19e063b255c2','second');

INSERT INTO credit(CREDIT_ID, CREDIT_PERCENTAGE, LIMIT_OF_MONEY, TYPE_OF_CREDIT, BANK_ID)

VALUES ('15574515-7129-4ac7-90ad-19e063b255c1', 1, 22, 'okoko', '39574515-7129-4ac7-90ad-19e063b255c1'),
       ('25574515-7129-4ac7-90ad-19e063b255c1', 2, 33, 'kk', '34574515-7129-4ac7-90ad-19e063b255c2');

INSERT INTO client(client_id, email, first_name, last_name, middle_name, passport_number, phone_number, bank_id)
VALUES('15574515-7133-4ac7-90ad-19e063b255c1', 'mail', 'ser', 'mer', 'per', 'sd3232w', 8999,'39574515-7129-4ac7-90ad-19e063b255c1'),
      ('15574515-7134-4ac7-90ad-19e063b255c1', 'mail.ru', 'sergey', 'viktorovich', 'loimanov', 'sd3232w', 898899,'34574515-7129-4ac7-90ad-19e063b255c2');

INSERT INTO offer_of_credit(offer_of_credit_id, credit_term, first_payment, name_of_credit, sum, sum_of_percent, take_date_of_credit, bank_id, client_id, credit_id)
VALUES ('35574515-7129-4ac8-90ad-19e063b255c2', 5, 222, 'ipoteca', 12222, 2, DATE '2021-01-01', '39574515-7129-4ac7-90ad-19e063b255c1', '15574515-7133-4ac7-90ad-19e063b255c1', '15574515-7129-4ac7-90ad-19e063b255c1');

INSERT INTO schedule_of_payment(schedule_of_payment_id, date_of_payment, amount_of_payment, amount_of_payment_per_body, amount_of_repayment_percent, repayment_remains, offer_of_credit_id)

VALUES('35574515-7129-4ac8-91ad-19e063b255c2', DATE '2021-09-01', 11, 2, 1, 13, '35574515-7129-4ac8-90ad-19e063b255c2')



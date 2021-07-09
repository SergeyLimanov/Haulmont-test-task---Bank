INSERT INTO bank(BANK_ID, BANK_NAME)
values ('11a80fb6-1ca4-435c-8fb3-2215d145db41', 'VTB'),
       ('21a80fb6-1ca4-435c-8fb3-2215d145db41', 'SBER'),
       ('31a80fb6-1ca4-435c-8fb3-2215d145db41', 'TINKOF'),
       ('41a80fb6-1ca4-435c-8fb3-2215d145db41', 'ALFA');


INSERT INTO CREDIT (CREDIT_ID, TYPE_OF_CREDIT, LIMIT_OF_MONEY, CREDIT_PERCENTAGE, BANK_ID)

values ('51a10fb6-1ca7-435c-8fb3-2215d145db41', 'Mortgage', 15000000, 8,'11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('61a20fb6-1ca8-435c-8fb3-2215d135db41', 'Сonsumer', 700000, 30, '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('71a30fb6-1ca3-435c-8fb3-2215d245db41', 'Auto credit', 10000000, 15, '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('81a40fb6-1ca1-435c-8fb3-2215d745db41', '"installment plan"', 150000, 6, '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('51a80fb6-1ca9-425c-8fb3-2315d145db41', 'Mortgage', 15000000, 10,'21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('61a80fb6-1ca4-415c-8fb3-2615d145db41', 'Сonsumer', 700000, 32, '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('71a80fb6-1ca4-495c-8fb3-2715d145db41', 'Auto credit', 10000000, 25, '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('81a80fb6-1ca4-435c-8fb3-2815d145db41', '"installment plan"', 150000, 7, '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('51a80fb6-1ca4-435c-8fb3-2215d195db41', 'Mortgage', 15000000, 9,'31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('61a80fb6-1ca4-435c-8fb3-2215d155db41', 'Сonsumer', 700000, 27, '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('71a80fb6-1ca4-435c-8fb3-2215d115db41', 'Auto credit', 10000000, 21, '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('81a80fb6-1ca4-435c-8fb3-2215d125db41', '"installment plan"', 150000, 9, '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('51a20fb6-1ca4-435c-8fb3-2215d145db41', 'Mortgage', 15000000, 11,'41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('61a30fb6-1ca4-435c-8fb3-2215d145db41', 'Сonsumer', 700000, 28, '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('71a40fb6-1ca4-435c-8fb3-2215d145db41', 'Auto credit', 10000000, 16, '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('81a50fb6-1ca4-435c-8fb3-2215d145db41', '"installment plan"', 150000, 8, '41a80fb6-1ca4-435c-8fb3-2215d145db41');



INSERT INTO client(client_id, first_name, middle_name, last_name, phone_number, email, passport_number, bank_id)

values ('91a80fb6-1ca4-435c-8fb3-3215d145db41', 'Ivanov', 'Vladislav', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('91a80fb6-1ca4-435c-8fb3-1215d145db41', 'Ivanov', 'Alexander', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('91a80fb6-1ca4-435c-8fb3-2215d145db41', 'Ivanov', 'Alexei', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('91a80fb6-1ca4-435c-8fb3-4214d145db41', 'Ivanov', 'Kirill', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('91a80fb6-1ca4-435c-8fb3-8213d145db41', 'Ivanov', 'Artur', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('62a80fb6-1ca4-435c-8fb3-2115d145db41', 'Ivanov', 'Vladimir', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('62a80fb6-1ca4-435c-8fb3-2815d145db41', 'Ivanov', 'Nikolaj', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('62a80fb6-1ca4-435c-8fb3-2715d145db41', 'Ivanov', 'Oleg', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('62a80fb6-1ca4-435c-8fb3-2315d145db41', 'Ivanov', 'Andrej', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('62a80fb6-1ca4-435c-8fb3-1215d145db41', 'Ivanov', 'Sergej', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('73a90fb6-1ca4-435c-8fb3-9215d145db41', 'Ivanov', 'Anton', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('73a10fb6-1ca4-435c-8fb3-4215d145db41', 'Ivanov', 'Maxim', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('73a30fb6-1ca4-435c-8fb3-3215d145db41', 'Ivanov', 'Anatolij', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('73a20fb6-1ca4-435c-8fb3-1215d145db41', 'Ivanov', 'Ruslan', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('73a50fb6-1ca4-435c-6fb3-9215d145db41', 'Ivanov', 'Egor', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('73a60fb6-1ca4-435c-8fb3-8215d145db41', 'Ivanov', 'Elesej', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('84a80fb6-2ca4-435c-8fb3-2215d145db41', 'Ivanov', 'Evgenij', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('84a10fb6-2ca4-435c-8fb3-2215d145db41', 'Ivanov', 'Dmitrij', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('84a20fb6-2ca4-435c-8fb3-2215d145db41', 'Ivanov', 'Denis', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('84a80fb6-2ca4-435c-8fb3-5215d145db41', 'Ivanov', 'Mihail', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('84a80fb6-3ca4-435c-8fb3-7215d145db41', 'Ivanov', 'YArolsav', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('84a80fb6-2ca4-435c-8fb3-8215d145db41', 'Ivanov', 'Innokentij', 'Ivanovich', '907-964-39-63', 'tomcat@random.com', '31-11-502830', '41a80fb6-1ca4-435c-8fb3-2215d145db41');


INSERT INTO offer_of_credit(offer_of_credit_id, name_of_credit, sum,  credit_term, first_payment, sum_of_percent,  bank_id, credit_id, client_id)

values ('91a80fb6-1ca4-435c-8fb3-2216d145db41', 'First', 100000, 2, 10, 8, '11a80fb6-1ca4-435c-8fb3-2215d145db41', '51a10fb6-1ca7-435c-8fb3-2215d145db41', '91a80fb6-1ca4-435c-8fb3-3215d145db41'),
       ('62a80fb6-1ca4-435c-8fb3-2217d145db41', 'Second', 150000, 2, 10, 30, '21a80fb6-1ca4-435c-8fb3-2215d145db41', '81a80fb6-1ca4-435c-8fb3-2815d145db41', '62a80fb6-1ca4-435c-8fb3-2815d145db41'),
       ('73a80fb6-1ca4-435c-8fb3-2218d145db41', 'Third', 150800, 2, 10, 15, '31a80fb6-1ca4-435c-8fb3-2215d145db41', '71a80fb6-1ca4-435c-8fb3-2215d115db41', '73a60fb6-1ca4-435c-8fb3-8215d145db41'),
       ('84a80fb6-1ca4-435c-8fb3-2219d145db41', 'Fourth', 180000, 2, 10, 6, '41a80fb6-1ca4-435c-8fb3-2215d145db41', '81a50fb6-1ca4-435c-8fb3-2215d145db41', '84a80fb6-2ca4-435c-8fb3-8215d145db41');



INSERT INTO schedule_of_payment(schedule_of_payment_id, amount_of_payment_per_body, amount_of_repayment_percent, amount_of_payment, date_of_payment, balance, offer_of_credit_id)

values ('91a70fb6-1ca4-435c-8fb3-2216d145db41', 10000, 5000, 15000, DATE '2021-09-01', 15000, '91a80fb6-1ca4-435c-8fb3-2216d145db41'),
       ('91a70fb6-1ca4-435c-8fb3-2216d115db42', 10000, 5000, 15000, DATE '2021-09-02', 0, '91a80fb6-1ca4-435c-8fb3-2216d145db41'),
       ('62a70fb6-1ca4-435c-8fb3-2217d195db41', 10000, 5000, 15000, DATE '2021-09-01', 15000, '62a80fb6-1ca4-435c-8fb3-2217d145db41'),
       ('62a70fb6-1ca4-435c-8fb3-2217d175db44', 10000, 5000, 15000, DATE '2021-09-02', 0, '62a80fb6-1ca4-435c-8fb3-2217d145db41'),
       ('73a70fb6-1ca4-435c-8fb3-2218d145db41', 10000, 5000, 15000, DATE '2021-09-01', 15000, '73a80fb6-1ca4-435c-8fb3-2218d145db41'),
       ('73a70fb6-1ca4-435c-8fb3-2218d155db49', 10000, 5000, 15000, DATE '2021-09-02', 0, '73a80fb6-1ca4-435c-8fb3-2218d145db41'),
       ('84a30fb6-1ca4-435c-8fb3-2219d135db41', 10000, 5000, 15000, DATE '2021-09-01', 15000, '84a80fb6-1ca4-435c-8fb3-2219d145db41'),
       ('84a30fb6-1ca4-435c-8fb3-2219d145db44', 10000, 5000, 15000, DATE '2021-09-02', 0, '84a80fb6-1ca4-435c-8fb3-2219d145db41');


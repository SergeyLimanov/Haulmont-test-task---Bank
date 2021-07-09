INSERT INTO bank(BANK_ID, BANK_NAME)
values ('11a80fb6-1ca4-435c-8fb3-2215d145db41', 'ВТБ'),
       ('21a80fb6-1ca4-435c-8fb3-2215d145db41', 'СБЕРБАНК'),
       ('31a80fb6-1ca4-435c-8fb3-2215d145db41', 'ТИНЬКОФ'),
       ('41a80fb6-1ca4-435c-8fb3-2215d145db41', 'АЛЬФА-БАНК'),
       ('51a80fb6-1ca4-435c-8fb3-2215d145db41', 'ПОЧТА-БАНК'),
       ('61a80fb6-1ca4-435c-8fb3-2215d145db41', 'БАНК-ХОУМ-КРЕДИТ');




INSERT INTO CREDIT (CREDIT_ID, TYPE_OF_CREDIT, LIMIT_OF_MONEY, CREDIT_PERCENTAGE, BANK_ID)

values ('51a10fb6-1ca7-435c-8fb3-2215d145db41', 'Ипотека', 19000000, 8,'11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('61a20fb6-1ca8-435c-8fb3-2215d135db41', 'Микро займ', 900000, 30, '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('71a30fb6-1ca3-435c-8fb3-2215d245db41', 'Авто кредит', 20000000, 15, '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('81a40fb6-1ca1-435c-8fb3-2215d745db41', 'Кредит на ремонт', 160000, 6, '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('51a80fb6-1ca9-425c-8fb3-2315d145db41', 'Ипотека', 19000000, 10,'21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('61a80fb6-1ca4-415c-8fb3-2615d145db41', 'Микро займ', 700000, 32, '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('71a80fb6-1ca4-495c-8fb3-2715d145db41', 'Авто кредит', 10000000, 25, '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('81a80fb6-1ca4-435c-8fb3-2815d145db41', 'Кредит на ремонт', 160000, 7, '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('51a80fb6-1ca4-435c-8fb3-2215d195db41', 'Ипотека', 19000000, 9,'31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('61a80fb6-1ca4-435c-8fb3-2215d155db41', 'Микро займ', 900000, 27, '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('71a80fb6-1ca4-435c-8fb3-2215d115db41', 'Авто кредит', 20000000, 21, '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('81a80fb6-1ca4-435c-8fb3-2215d125db41', 'Кредит на ремонт', 160000, 9, '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('51a20fb6-1ca4-435c-8fb3-2215d145db41', 'Ипотека', 19000000, 11,'41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('61a30fb6-1ca4-435c-8fb3-2215d145db41', 'Микро займ', 900000, 28, '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('71a40fb6-1ca4-435c-8fb3-2215d145db41', 'Авто кредит', 20000000, 16, '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('81a50fb6-1ca4-435c-8fb3-2215d145db41', 'Кредит на ремонт', 160000, 8, '41a80fb6-1ca4-435c-8fb3-2215d145db41');



INSERT INTO client(client_id, first_name, middle_name, last_name, phone_number, email, passport_number, bank_id)

values ('91a80fb6-1ca4-435c-8fb3-3215d145db41', 'Ivanov', 'Vladislav', 'Leonidovich', '89972287416', 'ivanov-vlad@gmail.com', '6565-998273', '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('91a80fb6-1ca4-435c-8fb3-1215d145db41', 'Ivanov', 'Alexander', 'Leonidovich', '89972287416', 'ivanov-alex@gmail.com', '6565-998274', '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('91a80fb6-1ca4-435c-8fb3-2215d145db41', 'Ivanov', 'Alexei', 'Leonidovich', '89972287416', 'ivanov-alexey@gmail.com', '6565-998275', '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('91a80fb6-1ca4-435c-8fb3-4214d145db41', 'Ivanov', 'Stas', 'Leonidovich', '89972287416', 'ivaniv-stas@gmail.com', '6565-998276', '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('91a80fb6-1ca4-435c-8fb3-8213d145db41', 'Ivanov', 'Petya', 'Leonidovich', '89972287416', 'ivanov-petya@gmail.com', '6565-998263', '11a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('62a80fb6-1ca4-435c-8fb3-2115d145db41', 'Ivanov', 'Askold', 'Leonidovich', '89972287416', 'ivanov-askold@gmail.com', '6565-998277', '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('62a80fb6-1ca4-435c-8fb3-2815d145db41', 'Ivanov', 'Sasha', 'Leonidovich', '89972287416', 'ivanov-sasha@gmail.com', '6565-998278', '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('62a80fb6-1ca4-435c-8fb3-2715d145db41', 'Ivanov', 'Igor', 'Leonidovich', '89972287416', 'ivanov-igor@gmail.com', '6565-998279', '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('62a80fb6-1ca4-435c-8fb3-2315d145db41', 'Ivanov', 'Fedor', 'Leonidovich', '89972287416', 'ivanov-fedya@gmail.com', '6565-992273', '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('62a80fb6-1ca4-435c-8fb3-1215d145db41', 'Ivanov', 'Leonid', 'Leonidovich', '89972287416', 'ivanov-lenya@gmail.com', '6565-991273', '21a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('73a90fb6-1ca4-435c-8fb3-9215d145db41', 'Ivanov', 'Vladimir', 'Leonidovich', '89972287416', 'ivanov-vladimir@gmail.com', '6525-998273', '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('73a10fb6-1ca4-435c-8fb3-4215d145db41', 'Ivanov', 'Julio', 'Leonidovich', '89972287416', 'ivanov-julio@gmail.com', '6565-998253', '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('73a30fb6-1ca4-435c-8fb3-3215d145db41', 'Ivanov', 'Sergey', 'Leonidovich', '89972287416', 'ivanov-sergey@gmail.com', '6565-998243', '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('73a20fb6-1ca4-435c-8fb3-1215d145db41', 'Ivanov', 'Andrey', 'Leonidovich', '89972287416', 'ivanov-andrey@gmail.com', '6565-998233', '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('73a50fb6-1ca4-435c-6fb3-9215d145db41', 'Ivanov', 'Gleb', 'Leonidovich', '89972287416', 'ivanov-gleb@gmail.com', '6565-998223', '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('73a60fb6-1ca4-435c-8fb3-8215d145db41', 'Ivanov', 'Kalim', 'Leonidovich', '89972287416', 'ivanov-kalim@gmail.com', '6565-998213', '31a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('84a80fb6-2ca4-435c-8fb3-2215d145db41', 'Ivanov', 'Soso', 'Leonidovich', '89972287416', 'ivanov-soso@gmail.com', '6565-998473', '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('84a10fb6-2ca4-435c-8fb3-2215d145db41', 'Ivanov', 'Nikolay', 'Leonidovich', '89972287416', 'ivanov-nikolay@gmail.com', '6565-998573', '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('84a20fb6-2ca4-435c-8fb3-2215d145db41', 'Ivanov', 'Maxim', 'Leonidovich', '89972287416', 'ivanov-maxim@gmail.com', '6565-998673', '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('84a80fb6-2ca4-435c-8fb3-5215d145db41', 'Ivanov', 'Vyacheslav', 'Leonidovich', '89972287416', 'ivanov-slava@gmail.com', '6565-998773', '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('84a80fb6-3ca4-435c-8fb3-7215d145db41', 'Ivanov', 'Antuan', 'Leonidovich', '89972287416', 'ivanov-antuan@gmail.com', '6565-998873', '41a80fb6-1ca4-435c-8fb3-2215d145db41'),
       ('84a80fb6-2ca4-435c-8fb3-8215d145db41', 'Ivanov', 'Dmitriy', 'Leonidovich', '89972287416', 'ivanov-dmitry@gmail.com', '6565-998973', '41a80fb6-1ca4-435c-8fb3-2215d145db41');


INSERT INTO offer_of_credit(offer_of_credit_id, name_of_credit, sum,  credit_term, first_payment, sum_of_percent,  bank_id, credit_id, client_id)

values ('91a80fb6-1ca4-435c-8fb3-2216d145db41', 'First', 100500, 4, 10, 8, '11a80fb6-1ca4-435c-8fb3-2215d145db41', '51a10fb6-1ca7-435c-8fb3-2215d145db41', '91a80fb6-1ca4-435c-8fb3-3215d145db41'),
       ('62a80fb6-1ca4-435c-8fb3-2217d145db41', 'Second', 150100, 4, 10, 30, '21a80fb6-1ca4-435c-8fb3-2215d145db41', '81a80fb6-1ca4-435c-8fb3-2815d145db41', '62a80fb6-1ca4-435c-8fb3-2815d145db41'),
       ('73a80fb6-1ca4-435c-8fb3-2218d145db41', 'Third', 150600, 4, 10, 15, '31a80fb6-1ca4-435c-8fb3-2215d145db41', '71a80fb6-1ca4-435c-8fb3-2215d115db41', '73a60fb6-1ca4-435c-8fb3-8215d145db41'),
       ('84a80fb6-1ca4-435c-8fb3-2219d145db41', 'Fourth', 180400, 4, 10, 6, '41a80fb6-1ca4-435c-8fb3-2215d145db41', '81a50fb6-1ca4-435c-8fb3-2215d145db41', '84a80fb6-2ca4-435c-8fb3-8215d145db41');



INSERT INTO schedule_of_payment(schedule_of_payment_id, amount_of_payment_per_body, amount_of_repayment_percent, amount_of_payment, date_of_payment, balance, offer_of_credit_id)

values ('91a70fb6-1ca4-435c-8fb3-2216d145db41', 10000, 5000, 15000, DATE '2020-04-01', 15000, '91a80fb6-1ca4-435c-8fb3-2216d145db41'),
       ('91a70fb6-1ca4-435c-8fb3-2216d115db42', 10000, 5000, 15000, DATE '2020-04-02', 0, '91a80fb6-1ca4-435c-8fb3-2216d145db41'),
       ('62a70fb6-1ca4-435c-8fb3-2217d195db41', 10000, 5000, 15000, DATE '2020-04-01', 15000, '62a80fb6-1ca4-435c-8fb3-2217d145db41'),
       ('62a70fb6-1ca4-435c-8fb3-2217d175db44', 10000, 5000, 15000, DATE '2020-04-02', 0, '62a80fb6-1ca4-435c-8fb3-2217d145db41'),
       ('73a70fb6-1ca4-435c-8fb3-2218d145db41', 10000, 5000, 15000, DATE '2020-04-01', 15000, '73a80fb6-1ca4-435c-8fb3-2218d145db41'),
       ('73a70fb6-1ca4-435c-8fb3-2218d155db49', 10000, 5000, 15000, DATE '2020-04-02', 0, '73a80fb6-1ca4-435c-8fb3-2218d145db41'),
       ('84a30fb6-1ca4-435c-8fb3-2219d135db41', 10000, 5000, 15000, DATE '2020-04-01', 15000, '84a80fb6-1ca4-435c-8fb3-2219d145db41'),
       ('84a30fb6-1ca4-435c-8fb3-2219d145db44', 10000, 5000, 15000, DATE '2020-04-02', 0, '84a80fb6-1ca4-435c-8fb3-2219d145db41');


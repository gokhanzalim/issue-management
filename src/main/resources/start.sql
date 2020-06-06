select *from issue

select *from users.user_seq.nextval

SELECT nextval('issue_seq');

SELECT  PG_GET_SERIAL_SEQUENCE();

select min_value, max_value,increment_by from pg_sequences where sequencename = 'issue_seq';

select *from pg_sequences;
select * from customer;
select * from seq;
delete from CUSTOMER;

---예1.
create table customer( no number(4)  primary key, 

		       name varchar2(20),

		       email varchar2(20),

		       tel varchar2(20)  );


alter table customer add(address varchar2(50));
alter table customer add(reg_date timestamp);

create sequence customer_no_seq
  start with 1
  increment by 1;

commit;

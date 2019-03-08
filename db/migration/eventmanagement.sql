 Table "events_infomation":
create table events_information(name varchar2(20) not null ,amount number,organize_date date,constraint event_details_name_pk primary key(name));
 insert into events_information(name,amount,organize_date)values('paper_presentation',100,date '2019-05-03');
 insert into events_information(name,amount,organize_date)values('extempore',150,date '2019-05-04');
 insert into events_information(name,amount,organize_date)values('coding_contest',100,date '2019-05-05');
select * from events_information;

Table "register_event":
create table register_event(id number ,email varchar2(20) unique,year varchar2(20) not null, eventname varchar2(20) not null,constraint pk_register_event_id primary key(id),
constraint fk_eventname FOREIGN KEY(eventname) references events_information(name),check(year in ('first_year', 'second_year', 'third_year','final_year')),check(eventname in('paper_presentaton','extempore','coding_contest')));

Table "register_account":
create table register_account(name varchar2(20) not null,id number(5),password varchar2(20)not null,mobilenumber number unique,constraint pk_register_id primary key(id));



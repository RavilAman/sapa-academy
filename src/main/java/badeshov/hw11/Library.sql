create table Books (
ID_books int primary key,
Title varchar(100),
Author varchar(50),
Genre varchar(50),
Year int
);

create table Members (
ID_members int primary key,
Full_name varchar(100),
Phone int,
Email varchar(50) unique
);

create table Loans (
ID_books int,
ID_members int,
primary key (ID_books, Title, ID_members, Full_name, Loan_date),
foreign key (ID_books, Title) references Books (ID_books, Title),
foreign key (ID_members, Full_name) references Members (ID_members, Full_name),
Loan_date int,
Return_date int
);
alter table Loans add column Title varchar(100);
alter table Loans add column Full_name varchar(100);
alter table Loans
drop column Loan_date;
alter table Loans
drop column Return_date;
alter table Loans
add column Loan_date date;
alter table Loans
add column Return_date date;

insert into Books (ID_books, Title, Author, Genre, Year)
values (1, 'Преступление и наказание', 'Ф. М. Достоевский', 'роман', '1866'),
(2, 'Война и мир', 'Л. Н. Толстой', 'исторический роман', '1869'),
(3, 'Мастер и Маргарита', 'М. А. Булгаков', 'роман, мистика', '1966'),
(4, 'Анна Каренина', 'Л. Н. Толстой', 'роман', '1877'),
(5, '1984', 'Джордж Оруэлл', 'антиутопия', '1949'),
(6, 'Унесённые ветром', 'Маргарет Митчелл', 'исторический роман', '1936'),
(7, 'Абай жолы', 'Мұхтар Әуезов', 'роман-эпопея', '1942'),
(8, 'Шыңғыс хан', 'Василий Ян', 'исторический роман', '1939'),
(9, 'Три товарища', 'Эрих Мария Ремарк', 'роман', '1936'),
(10, 'Гарри Поттер и философский камень', 'Дж. К. Роулинг', 'фэнтези', '1997');

insert into Members (ID_members, Full_name, Phone, Email)
values (1, 'Алихан Бөкейхан', '7701645', 'theleader@alash.qz'),
(2, 'Ахмет Байтұрсынұлы', '7701234', 'abaytursyn@alash.qz'),
(3, 'Міржақып Дулатұлы', '7707654', 'mdulatuly@alash.qz'),
(4, 'Жүсіпбек Аймауытов', '7709988', 'jaymauytov@alash.qz'),
(5, 'Мағжан Жұмабаев', '7701122', 'mzhumabaev@alash.qz');

insert into Loans (ID_members, ID_books, Full_name, Title, Loan_date)
values (1, 1, 'Алихан Бөкейхан', 'Преступление и наказание', '2025-08-16'),
(1, 9, 'Алихан Бөкейхан', 'Три товарища', '2025-09-12'),
(1, 6, 'Алихан Бөкейхан', 'Унесённые ветром', '2025-10-12'),
(2, 6, 'Ахмет Байтұрсынұлы', 'Унесённые ветром', '2025-10-12'),
(2, 8, 'Ахмет Байтұрсынұлы', 'Шыңғыс хан', '2025-10-18'),
(2, 4, 'Ахмет Байтұрсынұлы', 'Анна Каренина', '2025-11-18'),
(5, 4, 'Мағжан Жұмабаев', 'Анна Каренина', '2025-12-18');

select Full_name, Title, count(Title) from Loans
group by Full_name, Title;

select m.Full_name, l.Title
from Members as m
right join Loans as l
on m.full_name = l.full_name;

select Full_name from Members
except
select Full_name from Loans;

select Title, count(Title) from Loans
group by Title
having count(Title)> 1;

create index idx_genre on Books(Genre);

create index idx_author_year on Books(Author, Year);

create unique index idx_index on Members(Email);

select Title from Books
where Genre = 'исторический роман';

create index idx_title on Books(Title);

drop index idx_title; --0.004s

drop index idx_genre; --0.004s

create index idx_title on Books(Title); --0.016s

create fulltext index idx_title_text on Books(Title); --Postgre NOT have fulltext
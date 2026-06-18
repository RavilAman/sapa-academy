CREATE TABLE employees (
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    salary NUMERIC(10,2) NOT NULL,
    updated_at TIMESTAMPTZ DEFAULT now()
);

CREATE TABLE salary_audit (
    id BIGSERIAL PRIMARY KEY,
    employee_id BIGINT NOT NULL,
    old_salary NUMERIC(10,2),
    new_salary NUMERIC(10,2),
    changed_at TIMESTAMPTZ DEFAULT now()
);

insert into employees (id, name, salary, updated_at)
values
(1, 'Arystan', 300000, '2023-10-11 00:00:00+05'),
(2, 'Alibek', 350000, '2023-11-11 00:00:00+06'),
(3, 'Qasymbek', 400000, '2023-12-29 00:00:00+05'),
(4, 'Alpamys', 500000, '2024-01-27 00:00:00+06');

update employees e
set salary = 485000
where e.id = 3;

select id, name, salary, updated_at from employees;

create or replace function set_updated_at()
returns trigger as $$
begin
	new.updated_at := now();
	return new;
end;
$$ language plpgsql;
alter function set_updated_at rename to audit_salary_changes;

create trigger trg_set_updated_at
before update on employees
for each row
execute function set_updated_at();
alter trigger trg_set_updated_at on employees rename to trg_audit_salary;
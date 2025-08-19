CREATE TABLE accounts (
                          id         BIGSERIAL PRIMARY KEY,
                          owner      TEXT NOT NULL,
                          balance    NUMERIC(14,2) NOT NULL CHECK (balance >= 0),
                          created_at TIMESTAMPTZ NOT NULL DEFAULT now(),
                          updated_at TIMESTAMPTZ NOT NULL DEFAULT now()
);

update accounts a
set balance = factorial(6)
where a.id = 1;

CREATE OR REPLACE FUNCTION set_updated_at()
RETURNS trigger AS $$
BEGIN
  NEW.updated_at := now();
RETURN NEW;
END;
$$ LANGUAGE plpgsql;


CREATE TRIGGER trg_set_updated_at
    BEFORE UPDATE ON accounts
    FOR EACH ROW
    EXECUTE FUNCTION set_updated_at();


CREATE OR REPLACE FUNCTION factorial(n INT)
RETURNS BIGINT
LANGUAGE plpgsql
AS $$
DECLARE
result BIGINT := 1;
  i INT;
BEGIN
  IF n < 0 THEN
    RAISE EXCEPTION 'Factorial not defined for negative numbers';
END IF;

FOR i IN 1..n LOOP
    result := result * i;
END LOOP;

RETURN result;
END;
$$;

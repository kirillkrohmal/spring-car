CREATE TABLE caraccident
(
  id bigint NOT NULL,
  model character varying,
  series integer
);

CREATE TABLE userscar
(
  id serial NOT NULL,
  name character varying,
  car_id integer NOT NULL,
  lastname character varying,
  email character varying
);
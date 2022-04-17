CREATE TABLE IF NOT EXISTS equipment (
	id INT PRIMARY KEY NOT NULL,
	tag VARCHAR(30) NOT NULL,
	name VARCHAR(100) NOT NULL,
	provider VARCHAR(100) NOT NULL,
	nextMaintenanceSate DATETIME NOT NULL,
	weight INT NOT NULL,
),

CREATE TABLE auditing (
 	identifier SERIAL NOT NULL,
 	register_code NUMERIC(20) NOT NULL,
	equip_fk FOREIGN KEY (id) REFERENCES equipment (id)
 	datetime TIMESTAMP NOT NULL,
 	CONSTRAINT auditing_pk PRIMARY KEY (IDENTIFIER)
);
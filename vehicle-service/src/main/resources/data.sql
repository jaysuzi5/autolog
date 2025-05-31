-- Ensure the 'patient' table exists
CREATE TABLE  IF NOT EXISTS VEHICLE(
    id                  UUID            PRIMARY KEY,
    color               VARCHAR(255)    NOT NULL,
    dealer_name         VARCHAR(255)    NOT NULL,
    make                VARCHAR(255)    NOT NULL,
    model               VARCHAR(255)    NOT NULL,
    plate               VARCHAR(255)    NOT NULL,
    purchase_date       TIMESTAMP(6)    NOT NULL,
    purchase_odometer   INTEGER         NOT NULL,
    purchase_price      FLOAT(53)       NOT NULL,
    registration        VARCHAR(255)    NOT NULL,
    registration_state  VARCHAR(255)    NOT NULL,
    sold_date           TIMESTAMP(6)    NOT NULL,
    sold_odometer       INTEGER         NOT NULL,
    sold_price          FLOAT(53)       NOT NULL,
    vehicle_year        INTEGER         NOT NULL,
    vin                 VARCHAR(255)    NOT NULL
);



INSERT INTO vehicle (id, vehicle_year, make, model, color, vin, plate, registration, registration_state,
                     purchase_date, purchase_price, purchase_odometer, dealer_name,
                     sold_date, sold_price, sold_odometer)
SELECT '123e4567-e89b-12d3-a456-426614174000',
       '1988',
       'Ford',
       'Bronco II',
       'Blue',
       'xyz',
       'wxyz',
       'wsdfldf',
       'CA',
       '1991-07-28',
       '7200.00',
       '58489',
       'Hirtel Ford',
       '1992-11-20',
       '1000.00',
       '87291'
    WHERE NOT EXISTS (SELECT 1
                  FROM vehicle
                  WHERE id = '123e4567-e89b-12d3-a456-426614174000');

INSERT INTO vehicle (id, vehicle_year, make, model, color, vin, plate, registration, registration_state,
                     purchase_date, purchase_price, purchase_odometer, dealer_name,
                     sold_date, sold_price, sold_odometer)
SELECT '123e4567-e89b-12d3-a456-426614174001',
       '1993',
       'Ford',
       'Ranger XLT',
       'Blue',
       'dfsdfs',
       'asdfsdfd',
       'asdflkjsdf',
       'CA',
       '1992-11-20',
       '11500.00',
       '16',
       'Senator Ford',
       '1994-12-01',
       '8000.00',
       '48812'
    WHERE NOT EXISTS (SELECT 1
                  FROM vehicle
                  WHERE id = '123e4567-e89b-12d3-a456-426614174001');

INSERT INTO vehicle (id, vehicle_year, make, model, color, vin, plate, registration, registration_state,
                     purchase_date, purchase_price, purchase_odometer, dealer_name,
                     sold_date, sold_price, sold_odometer)
SELECT '123e4567-e89b-12d3-a456-426614174002',
       '1988',
       'Pontiac',
       'Grand AM',
       'Gray',
       'kodficv',
       'vcsedoe',
       'dfasdfo33',
       'NJ',
       '1995-05-01',
       '1657.00',
       '105095',
       'Ace Ford',
       '1997-04-05',
       '600.00',
       '132100'
    WHERE NOT EXISTS (SELECT 1
                  FROM vehicle
                  WHERE id = '123e4567-e89b-12d3-a456-426614174002');
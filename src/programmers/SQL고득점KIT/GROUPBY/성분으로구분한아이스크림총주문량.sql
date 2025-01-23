CREATE TABLE FIRST_HALF
(
    SHIPMENT_ID INT     NOT NULL,
    FLAVOR      VARCHAR NOT NULL,
    TOTAL_ORDER INT     NOT NULL,
    PRIMARY KEY (SHIPMENT_ID)
);

CREATE TABLE ICECREAM_INFO
(
    FLAVOR          VARCHAR NOT NULL,
    INGREDIENT_TYPE VARCHAR NOT NULL,
    PRIMARY KEY (FLAVOR)
);

SELECT II.INGREDIENT_TYPE, SUM(FH.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF FH
         JOIN ICECREAM_INFO II ON FH.FLAVOR = II.FLAVOR
GROUP BY II.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER ASC;

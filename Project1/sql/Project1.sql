
CREATE TABLE PROJ_1_EMPLOYEE
(
    EMP_ID NUMBER(5) CONSTRAINT PK_EMPLOYEE_ID PRIMARY KEY,
    USER_NAME VARCHAR2(30) CONSTRAINT UNIQUE_USER UNIQUE,
    PASSWORD_ VARCHAR2(30),
    FIRST_NAME VARCHAR2(15),
    LAST_NAME VARCHAR2(20),
    BIRTHDATE DATE,
    HIREDATE DATE,
    IS_MANAGER NUMBER(1)
);

-- Structure inspired by
-- https://www.letterspro.com/letters/to-human-resources/11705-request-a-refund-or-reimbursement-sample-letter
CREATE TABLE REINBURSMENTS
(
    EMP_ID NUMBER(5) CONSTRAINT FK_EMPLOYEE_REQ REFERENCES PROJ_1_EMPLOYEE,
    MAN_ID NUMBER(5) DEFAULT -1,
    LETTER CLOB,
    NAME_ VARCHAR2(15) CONSTRAINT UN_NAME UNIQUE,
    MANAGER_TARGET NUMBER(5) DEFAULT -1,
    IS_DENIED NUMBER(1) DEFAULT 0
);

--
CREATE OR REPLACE PROCEDURE GET_AVAILABLE_EMP_ID(RET OUT NUMBER)
IS
CUR SYS_REFCURSOR;
NUM_MAX NUMBER;
EARLY_POS NUMBER;
NUM_CUR NUMBER;
BEGIN
    NUM_MAX := 1;
    EARLY_POS := 1;

    OPEN CUR FOR SELECT EMP_ID FROM PROJ_1_EMPLOYEE;
    LOOP
        EXIT WHEN CUR%NOTFOUND;
        FETCH CUR INTO NUM_CUR;
        
        IF NUM_MAX <= NUM_CUR THEN
            NUM_MAX := NUM_MAX + 1;
        END IF;
        
        IF EARLY_POS = NUM_CUR THEN
            EARLY_POS := NUM_MAX;
        END IF;
        
    END LOOP;
    RET := EARLY_POS;
END;
/

--UPDATE PROJ_1_EMPLOYEE SET BIRTHDATE = DATE '1988-8-14' WHERE USER_NAME = 'kren';

--DROP TABLE REINBURSMENTS;
--Drop TABLE PROJ_1_EMPLOYEE;
/* SET SESSION max_heap_table_size=536870912; */
/* SET SESSION tmp_table_size=536870912; */
  
/* Disable foreign key constraints */

SET GLOBAL FOREIGN_KEY_CHECKS=0;

/*Table structure for table dim_patient */

DROP TABLE IF EXISTS datamart_db.dim_patient;
CREATE TABLE datamart_db.dim_patient (
  patient_id_skey INT(12) NOT NULL AUTO_INCREMENT,
  patient_profile_id VARCHAR(30) DEFAULT 'Unknown',
  patient_first_name VARCHAR(32) DEFAULT 'Unknown',
  patient_last_name VARCHAR(32) DEFAULT 'Unknown',
  patient_middle_name VARCHAR(32) DEFAULT 'Unknown',
  country_of_citizenship VARCHAR(32) DEFAULT 'Unknown',
  gender VARCHAR(32) DEFAULT 'Unknown',
  recommender_fname VARCHAR(32) DEFAULT 'Unknown',
  recommender_lname VARCHAR(32) DEFAULT 'Unknown',
  admission_decision VARCHAR(32) DEFAULT 'Unknown',
  current_country VARCHAR(32) DEFAULT 'Unknown',
  term_code_admitted_to VARCHAR(32) DEFAULT 'Unknown',
  term_name VARCHAR(32) DEFAULT 'Unknown',
  term_code VARCHAR(32) DEFAULT 'Unknown',
  version bigint(20) DEFAULT NULL,
  date_from datetime DEFAULT NULL,
  date_to datetime DEFAULT NULL,
  PRIMARY KEY (patient_id_skey)
) ENGINE=MYISAM;

/*Table structure for table dim_ethnicity */

DROP TABLE IF EXISTS datamart_db.dim_ethnicity;
CREATE TABLE datamart_db.dim_ethnicity
  (
    ethnicity_skey     INT(50) NOT NULL AUTO_INCREMENT,
    junk_id           VARCHAR(50),
    ethnicity_indian   VARCHAR(50) NOT NULL DEFAULT ' ',
    ethnicity_asian    VARCHAR(50) NOT NULL DEFAULT ' ',
    ethnicity_black    VARCHAR(50) NOT NULL DEFAULT ' ',
    ethnicity_hawaiian VARCHAR(50) NOT NULL DEFAULT ' ',
    ethnicity_white    VARCHAR(50) NOT NULL DEFAULT ' ',
    ethnicity_hispanic VARCHAR(50) NOT NULL DEFAULT ' ',
	version bigint(20) DEFAULT NULL,
    date_from datetime DEFAULT NULL,
    date_to datetime DEFAULT NULL,
    PRIMARY KEY (ethnicity_skey),
    UNIQUE KEY (junk_id)
  );
  
/*Table structure for table dim_submitted_date */  
  
DROP TABLE IF EXISTS datamart_db.dim_submitted_date;  
CREATE TABLE datamart_db.dim_submitted_date
(
 submitted_date_skey INT(50) NOT NULL AUTO_INCREMENT,
 submitted_date char(30) DEFAULT NULL,
 PRIMARY KEY (submitted_date_skey)
); 

/*Table structure for table dim_print_date */ 

DROP TABLE IF EXISTS datamart_db.dim_print_date;
CREATE TABLE datamart_db.dim_print_date
(
 printed_date_skey INT(50) NOT NULL AUTO_INCREMENT,
 printed_date char(30) DEFAULT NULL,
 PRIMARY KEY (printed_date_skey)
);

/*Table structure for table dim_program */ 

DROP TABLE IF EXISTS datamart_db.dim_program;
CREATE TABLE datamart_db.dim_program (
  program_skey int(12) NOT NULL AUTO_INCREMENT,
  program_code varchar(128) NOT NULL DEFAULT '',
  department_code char(7) NOT NULL DEFAULT '',
  department_name varchar(128) NOT NULL DEFAULT '',
  version bigint(20) DEFAULT NULL,
  date_from datetime DEFAULT NULL,
  date_to datetime DEFAULT NULL,
  PRIMARY KEY (program_skey)
) ENGINE=MyISAM;

/*Table structure for table fact_patient_admission */ 

DROP TABLE IF EXISTS datamart_db.fact_patient_admission;
CREATE TABLE datamart_db.fact_patient_admission (
  patient_client_skey int(12) DEFAULT 0,
  program_skey int(12) DEFAULT 0,
  ethnicity_skey int(12) DEFAULT 0,
  printed_date_skey int(12) DEFAULT 0,
  submitted_date_skey int(12) DEFAULT 0,
  is_applied int(7) NOT NULL DEFAULT 1,
  is_admitted int(7) NOT NULL DEFAULT 0,
  is_accepted int(7) NOT NULL DEFAULT 0,
  number_emails_sent int(7) NOT NULL DEFAULT 0,
  number_emails_replied int(7) NOT NULL DEFAULT 0,
  KEY idx_program_key (program_skey),
  KEY idx_patinet_key (patient_client_skey)
 ) ENGINE=MyISAM;
 
 SET GLOBAL FOREIGN_KEY_CHECKS=1;
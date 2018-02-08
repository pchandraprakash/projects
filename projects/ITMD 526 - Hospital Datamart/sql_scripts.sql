/* Disable foreign key constraints */
SET GLOBAL FOREIGN_KEY_CHECKS=0;

/*Table structure for table patient_profile */

DROP TABLE IF EXISTS source_db.patient_profile;

CREATE TABLE source_db.patient_profile (
  patient_id VARCHAR(7) NOT NULL,
  printed_date CHAR(10) DEFAULT NULL,
  submitted_date CHAR(10) DEFAULT NULL,
  last_accessed_date CHAR(10) DEFAULT NULL,
  fee_status VARCHAR(32) DEFAULT NULL,
  fee_payment_type VARCHAR(16) DEFAULT NULL,
  payment_card_type VARCHAR(16) DEFAULT NULL,
  patient_last_name VARCHAR(32) DEFAULT NULL,
  patient_first_name VARCHAR(32) DEFAULT NULL,
  patient_middle_name VARCHAR(32) DEFAULT NULL,
  current_state_province VARCHAR(32) DEFAULT NULL,
  current_country VARCHAR(128) DEFAULT NULL,
  country_of_citizenship VARCHAR(32) DEFAULT NULL,
  ethnicity_hispanic VARCHAR(32) DEFAULT NULL,
  ethnicity_indian VARCHAR(32) DEFAULT NULL,
  ethnicity_asian VARCHAR(32) DEFAULT NULL,
  ethnicity_black VARCHAR(32) DEFAULT NULL,
  ethnicity_hawaiian VARCHAR(64) DEFAULT NULL,
  ethnicity_white VARCHAR(32) DEFAULT NULL,
  ethnicity VARCHAR(32) DEFAULT NULL,
  gender VARCHAR(8) DEFAULT NULL,
  address VARCHAR(100) DEFAULT NULL,
  contact_number VARCHAR(64) DEFAULT NULL,
  program_code VARCHAR(64) DEFAULT NULL,
  PRIMARY KEY (patient_id)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Table structure for table patient_decision */

DROP TABLE IF EXISTS source_db.patient_decision;

CREATE TABLE source_db.patient_decision (
  patient_id VARCHAR(8) NOT NULL DEFAULT '',
  admission_decision VARCHAR(12) DEFAULT NULL,
  term_code_admitted_to VARCHAR(4) DEFAULT NULL,
  PRIMARY KEY (patient_id)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Table structure for table patient_messages */

DROP TABLE IF EXISTS source_db.patient_messages;

CREATE TABLE source_db.patient_messages (
  message_id INT(11) UNSIGNED NOT NULL DEFAULT '0',
  patient_id VARCHAR(8) NOT NULL DEFAULT '',
  sender_type CHAR(3) NOT NULL COMMENT 'DOC:Sent by Doctor, HOS: Sent by Hospital',
  message_subject VARCHAR(27) NOT NULL DEFAULT '',
  message_body VARCHAR(24) NOT NULL DEFAULT '',
  reply_to_id INT(11) UNSIGNED DEFAULT NULL,
  datetime_message_sent TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  datetime_message_read TIMESTAMP NULL DEFAULT NULL
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Table structure for table patient_adm_term */

DROP TABLE IF EXISTS source_db.patient_adm_term;

CREATE TABLE source_db.patient_adm_term (
  term_code VARCHAR(4) NOT NULL DEFAULT '',
  term_name VARCHAR(13) NOT NULL DEFAULT '',
  PRIMARY KEY (term_code)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Table structure for table doctor_details */

DROP TABLE IF EXISTS source_db.doctor_details;

CREATE TABLE source_db.doctor_details (
  id INT(10) UNSIGNED NOT NULL DEFAULT '0',
  doctor_id VARCHAR(7) DEFAULT NULL, -- this is an extra column
  patinet_id VARCHAR(7) DEFAULT NULL,
  doctor_fname VARCHAR(128) DEFAULT NULL,
  doctor_lname VARCHAR(128) DEFAULT NULL, -- this is an extra column
  doctor_degree VARCHAR(32) DEFAULT NULL,
  doctor_country VARCHAR(64) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS source_db.treatment_recommender;

CREATE TABLE source_db.treatment_recommender (
  id INT(10) UNSIGNED NOT NULL DEFAULT '0',
  patient_id VARCHAR(8) DEFAULT NULL,
  treatment_type VARCHAR(100) DEFAULT NULL,
  doctor_id VARCHAR(7) DEFAULT NULL, -- this is an extra column
  recommender_fname VARCHAR(22) NOT NULL DEFAULT '',
  recommender_lname VARCHAR(21) NOT NULL DEFAULT '',
  PRIMARY KEY (id)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Table structure for table hospital_program */

DROP TABLE IF EXISTS source_db.hospital_program;

CREATE TABLE source_db.hospital_program (
  program_code VARCHAR(128) NOT NULL DEFAULT '',
  department_code CHAR(7) NOT NULL,
  PRIMARY KEY (program_code)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Table structure for table hospital_department */

DROP TABLE IF EXISTS source_db.hospital_department;

CREATE TABLE source_db.hospital_department (
  department_code CHAR(7) NOT NULL DEFAULT '',
  department_name VARCHAR(50) NOT NULL DEFAULT '',
  PRIMARY KEY (department_code)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Table structure for table patient_review */

DROP TABLE IF EXISTS source_db.patient_review;
CREATE TABLE source_db.patient_review (
  reviewer_id VARCHAR(16) NOT NULL,
  patient_id VARCHAR(8) NOT NULL,
  review_score FLOAT DEFAULT NULL,
  review_complete TINYINT(1) DEFAULT '0',
  PRIMARY KEY (reviewer_id,patient_id)
) ENGINE=INNODB DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;
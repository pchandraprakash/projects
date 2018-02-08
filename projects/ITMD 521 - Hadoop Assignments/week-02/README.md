Assumption:
All the files from "vagrant_data" folder must be moved to "/var/lib/mysql-files/" folder

Part 2:

Steps to run the java code:

Step 1: run the GzipReader.java file to convert the gzip data into text file. (We should run this file 4 times and save the text file inside the "/var/lib/mysql-files/" folder for further processing.
Step 2: open individual text file and replace the "," with "  "(tab space), save the file.
Step 3: run the connector.java file 

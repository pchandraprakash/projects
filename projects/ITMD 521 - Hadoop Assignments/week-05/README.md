Steps to run the word count java file
1.	Initially copy all the *.txt files from local system to any of the folders under Hadoop directory. (Ex: /user/$USER/InputFiles)
2.	Transfer the first word count java file from local system to vagrant_data folder.
3.	Use the following command to create the java class file;
“hadoop com.sun.tools.javac.Main WordCount.java”. This will generate the class file.
4.	Next, execute the following command to create a jar file from the class file;
“jar cf wc.jar WordCount*.class”. This will generate a wc.jar which is an executable jar file.
5.	Finally run the following command to execute the jar file to get the output file;
“/home/vagrant/hadoop-2.5.2/bin/hadoop jar wc.jar WordCount /user/$USER/wordcount1 /user/$USER/wcopt1”.
6.	Once the above command is executed successfully, run the following command to see the 
“part-r-00000” file under wcopt1 folder.
“hadoop fs -ls /user/$USER/wcopt1”, this query will result following output;
Found 2 items
-rw-r--r--   1 vagrant supergroup          0 2017-02-17 18:33 /user/vagrant/wcopt1/_SUCCESS
-rw-r--r--   1 vagrant supergroup      71011 2017-02-17 18:33 /user/vagrant/wcopt1/part-r-00000
7.	Now, copy this “part-r-00000” file into your local folder (in this case it wordcount1) using following command;
“hadoop fs -copyToLocal /user/vagrant/wcopt1/part-r-00000”
8.	Now open this part-r-00000 file in an excel file and sort the data in ascending order to get the count of first top ten words.
9.	Follow same steps from 1 to 8 to execute the remaining 3 java files.
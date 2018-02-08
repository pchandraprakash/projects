package com.finalproject;

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Converter 
{
	public static void main(String[] args)throws Exception
	{
	    final Path path = Paths.get("C:\\Users\\phani\\Vagrant\\trusty64\\data");
	    final Path txt = path.resolve("largedata.txt");
	    final Path csv = path.resolve("largedata.csv");
	    final Charset utf8 = Charset.forName("UTF-8");
	    try 
	    {
	    	final Scanner scanner = new Scanner(Files.newBufferedReader(txt, utf8));
            final PrintWriter pw = new PrintWriter(Files.newBufferedWriter(csv, utf8, StandardOpenOption.CREATE_NEW));
            while (scanner.hasNextLine()) 
            {
                pw.println(scanner.nextLine().replace(' ', ','));
            }
	    }
	    finally
	    {
	    	System.out.println("Conversion Successfully Completed");
	    }

	}
}
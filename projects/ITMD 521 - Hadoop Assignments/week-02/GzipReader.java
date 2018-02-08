import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.zip.GZIPInputStream;

public class GzipReader 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(
		new GZIPInputStream(new FileInputStream("G:\\2nd Semester Subjects\\ITMD 521\\Sample Data\\New folder\\1990.gz"))));
		PrintStream out = new PrintStream(new FileOutputStream("G:\\2nd Semester Subjects\\ITMD 521\\Sample Data\\New folder\\1990.txt"));
		System.setOut(out);
		String content;
		while ((content = in.readLine()) != null)
		{
		  System.out.println(content.substring(15,19)+","+content.substring(24,28)+","+
				  			content.substring(28,34)+","+content.substring(34,41)+","+
				  			content.substring(61,64)+","+content.substring(87,92)+","+
				  			content.substring(93,98));
		    //System.out.println(content);	
		}
		System.out.println("Conversion Completed Successfuly");
	}
}
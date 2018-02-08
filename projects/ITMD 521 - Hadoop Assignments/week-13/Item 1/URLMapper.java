import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class URLMapper
  extends Mapper<LongWritable, Text, Text, Text> {
 @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {
String line = value.toString();
String month, quality, URL;
try{
       month = line.substring(6, 8);
      quality = line.substring(120, 123);
    if (quality.matches("200")) {
    	 URL = line.substring(49, 60);
   context.write(new Text(month), new Text(URL));  
}
}
catch(StringIndexOutOfBoundsException ex){
	 month = " ";
	 URL =" ";
	 quality = " ";
}
}
}

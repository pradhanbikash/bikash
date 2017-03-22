package add1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class PropertiesDemo {

	public static void main(String[] args)throws IOException {
		FileInputStream ins=null;
		try
		{
			Properties p=new Properties();
			ins = new FileInputStream("D:\\ggg.txt");
			p.load(ins);
			System.out.println("DRIVER Name is:"+p.getProperty("driver"));
			System.out.println("URL Name is :"+p.getProperty("url"));
			System.out.println("USER Name is:"+p.getProperty("user"));
			System.out.println("PASSWORD is:"+p.getProperty("password"));
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);	
		}
		finally
		{
			try
			{
				ins.close();
			}
			catch(IOException ex)
			{
				System.out.println(ex);
			}
		}
		

	}

}

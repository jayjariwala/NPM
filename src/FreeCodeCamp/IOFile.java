package FreeCodeCamp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOFile {

	public static void main(String args[]) throws IOException
	{
		String filepath="/home/jay/Java Workspace/NPM/jay.txt";
		String s;
		int count=0;
		char[] data = null;
		
		try {
			FileReader freader=new FileReader(filepath);
			BufferedReader buff=new BufferedReader(freader);
			while((s=buff.readLine())!=null)
			{
				data=s.toCharArray();
				count=count+1;
			}
			System.out.println(count);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

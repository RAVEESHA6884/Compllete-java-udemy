package processingFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {
		File file=new File("myFile");
		BufferedReader bufferedReader=null;
		try {
		FileReader fileReader;
		fileReader = new FileReader(file);
		
		bufferedReader=new BufferedReader(fileReader);
		String line=bufferedReader.readLine();
		while(line!=null) {
			System.out.println(line);
			line=bufferedReader.readLine();
		}
	} catch (FileNotFoundException e) {
		System.out.println("File not Found..");
	}catch(IOException e) {
		System.out.println("Problem reading the File"+file.getName());
	}finally {
		try {
			bufferedReader.close();
		}catch(IOException e) {
			System.out.println("Unable to close file"+file.getName());
		}catch(NullPointerException ex) {
			System.out.println("File was Probably never Opened"+ex);
		}
	}
	}
}

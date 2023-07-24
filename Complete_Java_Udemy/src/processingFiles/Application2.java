package processingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		try {
		File file =new File("myFile");
		Scanner input;
		
			input =new Scanner(file);
		
		while(input.hasNextLine()) {
			String line=input.nextLine();
			System.out.println(line);
		}
		input.close();
	}catch (FileNotFoundException e) {
		System.out.println("File not found.......");
		e.printStackTrace();
	}
	}
}

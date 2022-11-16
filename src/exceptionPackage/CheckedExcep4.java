package exceptionPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExcep4 {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Programme starts");

        File obj = new File("C:..test.txt"); //FileNotFoundException
        FileReader rd =new FileReader(obj);
		
		System.out.println("Programme Ends");

	}

}

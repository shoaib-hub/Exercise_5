package ex_1;
//import java.io.File;  
import java.io.PrintWriter;  
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class File {
		    public static void main(String[] args) throws Exception {
		 PrintWriter writer1 =null;      
		  writer1 = new PrintWriter("C:\\test.txt");
		         writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
		                         writer1.flush();  
		         writer1.close();  
		    
				// File path is passed as parameter
				File file = new File(
					"C:\\test.txt");

				// Creating an object of BufferedReader class
				BufferedReader br
					= new BufferedReader(new FileReader(file));

				// Declaring a string variable
				String st;
				// Condition holds true till
				// there is character in a string
				while ((st = br.readLine()) != null)

					// Print the string
					System.out.println(st);
			
		    }
		}


	


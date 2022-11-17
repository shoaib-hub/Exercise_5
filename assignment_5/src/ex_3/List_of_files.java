package ex_3;
import java.io.File;
import java.util.Date;
public class List_of_files {
	
	     public static void main(String a[])
	     {
	        File file = new File("C:\\Java_assignments");
	        String[] fileList = file.list();
	        for(String name:fileList){
	            System.out.println(name);
	        }
	    }
	}



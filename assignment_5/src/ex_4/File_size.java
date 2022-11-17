package ex_4;
import java.io.File;  
public class File_size {
		public static void main(String[] args)
		{
			File file = new File("C:\\Java_assignments");
			if (file.exists()) {
				double bytes = file.length();
				//bytes to kilobytes
				double kilobytes = (bytes / 1024);

				//kilobytes to megabytes
				double megabytes = (kilobytes / 1024);

				System.out.println("bytes : " + bytes);
				System.out.println("kilobytes : " + kilobytes);
				System.out.println("megabytes : " + megabytes);
			}
			else {
				System.out.println("File does not exists!");
			}
		}
	}

	//Output:
//		bytes : 38.0
//		kilobytes : 0.037109375
//		megabytes : 3.62396240234375E-5
	


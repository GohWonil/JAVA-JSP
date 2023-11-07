package sec01.exam10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {

		Writer write = new FileWriter("C:/TEMP/test10.txt");
		
		String str = "중앙인재개발원";
		
		write.write(str);
		
		write.flush();
		write.close();
				
	}

}

package sec01.exam09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {

		Writer writer = new FileWriter("c:/TEMP/test9.txt");
		
		char[] array = { 'T', 'O', 'M', '중', '앙', '원' };
		
		writer.write(array, 3, 3);
		
		writer.flush();
		writer.close();
	}

}

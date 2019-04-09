import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test_File_Data_Reading {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("G:\\Selenium Automation\\Test File Reading\\src\\DataRead.txt");
		BufferedReader br = new BufferedReader(fr);
		String data = br.readLine();
		System.out.println(data);
		br.close();
		fr.close();
	}

}

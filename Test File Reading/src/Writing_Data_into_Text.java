
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_Data_into_Text {

	public static void main(String[] args) throws IOException {
	File fi= new File("G:\\Selenium Automation\\Test File Reading\\src\\DataWrite.txt");
	fi.createNewFile();
	FileWriter fw= new FileWriter(fi);
	BufferedWriter bw= new BufferedWriter(fw);
	bw.write("Hello this is Amit");
	bw.newLine();
	bw.write("I am tring writing into text file");
	bw.close();
	fw.close();
	
	}

}

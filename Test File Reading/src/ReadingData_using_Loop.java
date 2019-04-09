import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingData_using_Loop {

	public static void main(String[] args) throws IOException {
		File fi=new File("G:\\Selenium Automation\\Test File Reading\\src\\DataRead.txt");
		FileReader fr= new FileReader(fi);
		BufferedReader br= new BufferedReader(fr);
		String data;
		while ((data=br.readLine())!=null )
		//while (br.readLine()!=null )
		{
		   // System.out.println(br.readLine());
			System.out.println(data );
		}
			br.close();
			fr.close();
			
			
		
	}

}

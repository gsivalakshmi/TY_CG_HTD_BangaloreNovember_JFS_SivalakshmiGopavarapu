import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
public static void main(String[] args) {
	
	try {
		FileInputStream fs=new FileInputStream("shiv.txt");
		int j=0;
		while((j=fs.read())!= -1) {
			System.out.println((char)j);
		}
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
}
}

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
public static void main(String[] args) {
	try {
		FileOutputStream f1=new FileOutputStream("C:\\Users\\MR DELL\\Desktop\\CAPGEM\\fileshiv.txt");
		System.out.println("sucess.....");
		String s1="chandu";
		byte b1[]=s1.getBytes();
		f1.write(b1);
	}catch(IOException i) {
		System.out.println(i);
	}
}
}

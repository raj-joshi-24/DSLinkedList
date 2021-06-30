package serial.agile.com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveEmp {

	public static void main(String[] args) throws IOException {
		Emp x1=new Emp(1,"Student 1",98);
		Emp x2=new Emp(2,"Student 2",45);
		
		FileOutputStream f1=null;
		ObjectOutputStream f2=null;
		
		try{
			f1=new FileOutputStream("f1.txt");
		
		}
		catch(Exception er)
		{
			System.out.println("File not found ");
			System.exit(0);
		}	
		f2=new ObjectOutputStream(f1);
		f2.writeObject(x1);
		f2.writeObject(x2);
		f2.close();
	}
}

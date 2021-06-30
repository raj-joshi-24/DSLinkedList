package serial.agile.com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try{  
			  //Creating stream to read the object  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f1.txt"));  
			  Emp s=(Emp)in.readObject();  
			  //printing the data of the serialized object  
			  System.out.println(s);  
			  Emp s1=(Emp)in.readObject();
			  //closing the stream  
			  System.out.println(s1);  
			  in.close();  
			  }catch(Exception e){System.out.println(e);}  
			 
	}

}

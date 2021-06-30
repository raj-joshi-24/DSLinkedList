package serial.agile.com;

import java.util.HashMap;
import java.util.Map;

public class GroupDemo {

	public static void main(String[] args) {
		Map<Integer,Emp> s1=new HashMap<Integer,Emp>();
		
		s1.put(1,new Emp(1,"ABC",98));
		s1.put(2,new Emp(2,"pinky",98));
		s1.put(3,new Emp(3,"Neha",75));
		s1.put(4,new Emp(4,"Rahul",75));
		
		System.out.println(s1);

	}

}

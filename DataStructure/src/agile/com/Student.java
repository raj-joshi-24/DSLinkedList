package agile.com;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/*
String sDate1="31/12/1998";  
Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
System.out.println(sDate1+"\t"+date1);
*/
import java.util.Calendar;
import java.util.Date;

class Student{

private String lastName;
private String firstName;
private String id;
private String dateOfBirth;
private int age;

// Overloaded constructor
public Student(String lastName, String firstName, String id, 
                String dateOfBirth, int age) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.dateOfBirth = dateOfBirth;
    computeAge(age);
}

// Compute age based on DoB and today's date
private void computeAge(int age) {
	Date date = new Date();
	System.out.println(date);
	// Code this
    this.age = age;
}

//@Override
public String toString() {
    // Code this
    return null;
}
public static void main(String args[]) throws ParseException
{
	String sDate1="9/7/1995";  
    Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(sDate1);  
    System.out.println(sDate1+"\t"+date1);  
    Calendar dob = Calendar.getInstance();
    dob.setTime(date1);
    
	Date date = new Date();
			Calendar today = Calendar.getInstance();
			today.setTime(date);
	System.out.println(today.get(Calendar.MONTH)+"...."+dob.get(Calendar.MONTH));
if(today.get(Calendar.MONTH)>dob.get(Calendar.MONTH))
		System.out.println(today.get(Calendar.YEAR)-dob.get(Calendar.YEAR));
else
	System.out.println(today.get(Calendar.YEAR)-dob.get(Calendar.YEAR)-1);
	
		
}
}

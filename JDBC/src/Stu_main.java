
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
public class Stu_main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Student s=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of sid");
s.setSid(sc.nextInt());
System.out.println("enter the value of sname");
s.setSname(sc.next());
System.out.println("enter the value of semail");
s.setSemail(sc.next());
Student_Dao dao=new Student_Dao();
int i=dao.insert(s);
if(i>0) {
	System.out.println("insertion done");
}
else {
	System.out.println("insertion failed");
}

dao.retrieve();	
}	
}

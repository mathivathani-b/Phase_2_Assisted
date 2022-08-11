import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*CRUD - DAO(data access object)
Call the DBUtil for dB connection
Continue with 
3.Statement of sql
4.execute the statements
5.close the connections  
 */
public class Student_Dao{
	
	
	//insert ,update,delete
	public int insert(Student s) throws ClassNotFoundException, SQLException {
		Connection con=Dutil.getCon();
		if(con!=null) {
			System.out.println("connection is established");
		}
		else {
			System.out.println("connection failed");
		}
		
		Statement st=con.createStatement();
		String sql="insert into student values("+s.getSid()+","+"'"+s.getSname()+"'"+","+"'"+s.getSemail()+"')";
		//insert,update,delete->int value -no of rows
		int row=st.executeUpdate(sql);
		return row;
	
	}
	
	public void retrieve() throws ClassNotFoundException, SQLException {
		Connection con=Dutil.getCon();
		if(con!=null) {
			System.out.println("connection is established");
		}
		else {
			System.out.println("connection failed");
		}
		Statement st=con.createStatement();
		String sql="select * from student";
		//select
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
	}

}








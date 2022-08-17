package example;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
private int empno;
	@Column
private String empname;
	@Column
private String empemail;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", empemail=" + empemail + "]";
	}
		
	
}


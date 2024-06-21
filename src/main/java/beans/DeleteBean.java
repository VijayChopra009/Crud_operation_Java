package beans;

import java.io.Serializable;

import dao.EmployeeDAO;

public class DeleteBean  implements Serializable{
 	private static final long serialVersionUID = 1L;
 	private String email;
 	public DeleteBean() {
	 
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
 	
	public boolean  delete() {
		return new EmployeeDAO().deleteEmp(this);
	}
	

}

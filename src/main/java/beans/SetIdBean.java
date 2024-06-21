package beans;

import java.io.Serializable;

import dao.EmployeeDAO;

public class SetIdBean  implements Serializable{
 	private static final long serialVersionUID = 1L;
 	private String email;
 	public SetIdBean() {
	 
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
 	
	public RegisterBean getById() {
		return new EmployeeDAO().getByIdEmp(this);
	}
	

}

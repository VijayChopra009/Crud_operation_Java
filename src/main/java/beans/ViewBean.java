package beans;

import java.io.Serializable;
import java.util.List;

import dao.EmployeeDAO;

public class ViewBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String email;
	private String address;
	private String designation;
	private String doj;
	private String gender;
	private long mobno;
	private float salary;
	public ViewBean() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public List<ViewBean>  getAll() {
		return new EmployeeDAO().getAllEmp();
	}
	 

}

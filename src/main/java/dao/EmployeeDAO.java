package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.DeleteBean;
import beans.EditBean;
import beans.LoginBean;
import beans.RegisterBean;
import beans.SetIdBean;
import beans.ViewBean;
import dbconn.DBConnection;

public class EmployeeDAO {

	public boolean loginverify(LoginBean lb) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from login_emp where username=? and password=?");
			ps.setString(1,lb.getUsername());
			ps.setString(2, lb.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				flag =true;
				System.out.println("Login verify   "+flag);
				return flag;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	//Insert into DB
	public boolean registerEmp(RegisterBean rb) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into emp_register values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, rb.getId());
			ps.setString(2, rb.getName());
			ps.setString(3, rb.getEmail());
			ps.setString(4, rb.getAddress());
			ps.setString(5, rb.getDesignation());
			ps.setString(6, rb.getDoj());
			ps.setLong(7, rb.getMobno());
			ps.setFloat(8, rb.getSalary());
			ps.setString(9, rb.getGender());
			int x = ps.executeUpdate();
			System.out.println("Register into db "+x);
			if(x !=0) {
				PreparedStatement ps1 = conn.prepareStatement("insert into login_emp values(?,?,?)");
				ps1.setInt(1, rb.getId());
				ps1.setString(2, rb.getUsername());
				ps1.setString(3, rb.getPassword()); 
				int x1 = ps1.executeUpdate();
				System.out.println("login into db "+x);
				if(x1 != 0 ) {
					flag =true;
					return flag; 
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	// Get By Id for Update
	//Insert into DB
	public RegisterBean getByIdEmp(SetIdBean setid) {
		RegisterBean rb = null;
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from emp_register where email=?");
			ps.setString(1, setid.getEmail());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				rb = new RegisterBean();
				rb.setId(rs.getInt(1));
				rb.setName(rs.getString(2));
				rb.setEmail(rs.getString(3));
				rb.setAddress(rs.getString(4));
				rb.setDesignation(rs.getString(5));
				rb.setDoj(rs.getString(6));
				rb.setMobno(rs.getLong(7));
				rb.setSalary(rs.getFloat(8));
				rb.setGender(rs.getString(9));
				System.out.println("Seted db to Bean  "+rb);
				return rb;
			}



		} catch (Exception e) {
			e.printStackTrace();
		}
		return rb;
	}

	//Update into DB
	public boolean updateEmp(EditBean rb) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("update emp_register set id=?,name=?,address=?,desig=?,doj=?,mobno=?,salary=?,gender=? where email=?");
			ps.setInt(1, rb.getId());
			ps.setString(2, rb.getName());
			ps.setString(3, rb.getAddress());
			ps.setString(4, rb.getDesignation());
			ps.setString(5, rb.getDoj());
			ps.setLong(6, rb.getMobno());
			ps.setFloat(7, rb.getSalary());
			ps.setString(8, rb.getGender());
			ps.setString(9, rb.getEmail());
			int x = ps.executeUpdate();
			System.out.println("Updated Success  into db "+x);
			if(x !=0) {
				flag =true;
				return flag; 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	//Delete by Email id
	
	public boolean deleteEmp(DeleteBean dbean) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("delete  from emp_register where EMAIL=?");
		 	ps.setString(1, dbean.getEmail());
			  int x = ps.executeUpdate();
			  System.out.println("Deleted successfully  "+x);
			if(x != 0) {
				flag =true;
				return flag;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
    // Get  all   Records
	public List<ViewBean>  getAllEmp() {
		ArrayList<ViewBean> al = new ArrayList<ViewBean>();
		ViewBean vb = null;
		try {
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from emp_register");
		 	ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				vb = new ViewBean();
				vb.setId(rs.getInt(1));
				vb.setName(rs.getString(2));
				vb.setEmail(rs.getString(3));
				vb.setAddress(rs.getString(4));
				vb.setDesignation(rs.getString(5));
				vb.setDoj(rs.getString(6));
				vb.setMobno(rs.getLong(7));
				vb.setSalary(rs.getFloat(8));
				vb.setGender(rs.getString(9));
				al.add(vb);
			}
			System.out.println("All record seted ArrayList   "+al);
			return al;



		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
		 
	}
}

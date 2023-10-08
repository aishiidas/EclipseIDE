package org.anudip.bean;

public class MyEmployee {
	private Integer employeeId;
	private String employeeName;
	private Address empAddress;
	private String deptName;
	private Double salary;
	
	public MyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public MyEmployee(Integer employeeId, String employeeName, Address empAddress, String deptName, Double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.empAddress = empAddress;
		this.deptName = deptName;
		this.salary = salary;
	}
	


	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public Address getEmpAddress() {
		return empAddress;
	}


	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		String output=String.format("%-5s %-15s %-25s %-10s %-10s",employeeId,employeeName,empAddress,deptName,salary);
		return output;
	}
	

}

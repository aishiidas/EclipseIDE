package org.anudip.bean;

public class Employee {
	private Integer employeeId;
	private String employeeName;
	private String deptName;
	private Double salary;
	private static int idGenerator=100;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, String deptName, Double salary) {
		super();
		this.employeeId = ++idGenerator;
		this.employeeName = employeeName;
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
//	public String toString() {
//		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", deptName=" + deptName
//				+ ", salary=" + salary + "]";
//	}
	public String toString() {
		String output=String.format("%-5s %-15s %-10s %-10s",employeeId,employeeName,deptName,salary);
		return  output;
		
	}
	

}

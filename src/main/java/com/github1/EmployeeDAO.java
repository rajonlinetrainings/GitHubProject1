package com.github1;

import java.util.List;

public interface EmployeeDAO {
	public void saveEmployee(Employee emp);
	public void updateEmployee(int empId,int empSalary);
	public void deleteEmployee(int empId);
	public List<Employee> listEmployees();
}

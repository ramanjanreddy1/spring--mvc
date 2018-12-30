package com.app.dao;

import java.util.List;

import com.app.Employee;

public interface EmpDao {
	public void saveEmployee(Employee e);
	public void updateEmployee(Employee e);
	public void deleteEmployee(Employee e);
	public Employee getById(int id);
	public List<Employee> getEmployees();

}

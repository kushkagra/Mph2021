package com.mph.controller;

import java.util.List;

public interface EmployeeInterface {
	public List addEmployee();
	public void viewEmployee(List elist);
	public void addProject();
	public void viewProject();
	public void compare();
	public void search();
	public void serial();
	public void deSerial();
	public void insertUsingproc();
	public void rsmd();
	public void type_forward_only_rs();
	public void type_scroll_insensitive_rs();
	public void type_scroll_sensitive_rs_insert();
	public void type_scroll_sensitive_rs_update();
	public void batchUpdate();

}

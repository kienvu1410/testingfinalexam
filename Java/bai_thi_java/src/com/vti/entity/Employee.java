package com.vti.entity;

public class Employee extends User {

	private String proSkill;
    private int projectId;
	public Employee(int id, String fullName, String email, String password, String proSkill, int projectId) {
		super(id, fullName, email, password, Role.Employee);
		this.proSkill = proSkill;

	}

	public void setProSkill(String proSkill) {
		proSkill = proSkill;
	}



}


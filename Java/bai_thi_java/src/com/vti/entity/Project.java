package com.vti.entity;

public class Project {
private int projectId;
private int teamSize;
private int idManager;
private int idEmployess;
public Project(int projectId, int teamSize, int idManager, int idEmployess) {
	super();
	this.projectId = projectId;
	this.teamSize = teamSize;
	this.idManager = idManager;
	this.idEmployess = idEmployess;
}
public int getProjectId() {
	return projectId;
}
public void setProjectId(int projectId) {
	this.projectId = projectId;
}
public int getTeamSize() {
	return teamSize;
}
public void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
}
public int getIdManager() {
	return idManager;
}
public void setIdManager(int idManager) {
	this.idManager = idManager;
}
public int getIdEmployess() {
	return idEmployess;
}
public void setIdEmployess(int idEmployess) {
	this.idEmployess = idEmployess;
}
}

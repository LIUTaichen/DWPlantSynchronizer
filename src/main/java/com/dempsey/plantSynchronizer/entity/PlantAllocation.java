package com.dempsey.plantSynchronizer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Access_Plant_Allocation database table.
 * 
 */
@Entity
@Table(name="Plant_Allocation")
@NamedQuery(name="Plant_Allocation.findAll", query="SELECT p FROM Plant_Allocation p")
public class PlantAllocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Active")
	private boolean active;

	@Column(name="Cost_Code")
	private int costCode;

	@Column(name="Date_Available")
	private String dateAvailable;

	@Column(name="Date_Created")
	private String dateCreated;

	@Column(name="Date_Required")
	private String dateRequired;

	@Column(name="Day_Rate")
	private double dayRate;

	private String dWeek;

	@Column(name="ID")
	private int id;

	@Column(name="Last_Modified")
	private String lastModified;

	@Column(name="Notes")
	private Object notes;

	@Column(name="Personnel")
	private Object personnel;

	@Column(name="personnel_fk")
	private int personnelFk;

	@Column(name="Plant_ID")
	private int plantID;

	@Column(name="PM")
	private String pm;

	@Column(name="project_fk")
	private int projectFk;

	@Column(name="Scope")
	private String scope;

	private Timestamp SSMA_TimeStamp;

	@Column(name="State")
	private String state;

	@Column(name="Type_Of_Work")
	private String  typeOfWork;

	public PlantAllocation() {
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getCostCode() {
		return costCode;
	}

	public void setCostCode(int costCode) {
		this.costCode = costCode;
	}

	public String getDateAvailable() {
		return dateAvailable;
	}

	public void setDateAvailable(String dateAvailable) {
		this.dateAvailable = dateAvailable;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateRequired() {
		return dateRequired;
	}

	public void setDateRequired(String dateRequired) {
		this.dateRequired = dateRequired;
	}

	public double getDayRate() {
		return dayRate;
	}

	public void setDayRate(double dayRate) {
		this.dayRate = dayRate;
	}

	public String getdWeek() {
		return dWeek;
	}

	public void setdWeek(String dWeek) {
		this.dWeek = dWeek;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastModified() {
		return lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public Object getNotes() {
		return notes;
	}

	public void setNotes(Object notes) {
		this.notes = notes;
	}

	public Object getPersonnel() {
		return personnel;
	}

	public void setPersonnel(Object personnel) {
		this.personnel = personnel;
	}

	public int getPersonnelFk() {
		return personnelFk;
	}

	public void setPersonnelFk(int personnelFk) {
		this.personnelFk = personnelFk;
	}

	public int getPlantID() {
		return plantID;
	}

	public void setPlantID(int plantID) {
		this.plantID = plantID;
	}

	public String getPm() {
		return pm;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	public int getProjectFk() {
		return projectFk;
	}

	public void setProjectFk(int projectFk) {
		this.projectFk = projectFk;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Timestamp getSSMA_TimeStamp() {
		return SSMA_TimeStamp;
	}

	public void setSSMA_TimeStamp(Timestamp SSMA_TimeStamp) {
		this.SSMA_TimeStamp = SSMA_TimeStamp;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTypeOfWork() {
		return typeOfWork;
	}

	public void setTypeOfWork(String typeOfWork) {
		this.typeOfWork = typeOfWork;
	}

	@Override
	public String toString() {
		return "PlantAllocation{" +
				"active=" + active +
				", costCode=" + costCode +
				", dateAvailable='" + dateAvailable + '\'' +
				", dateCreated='" + dateCreated + '\'' +
				", dateRequired='" + dateRequired + '\'' +
				", dayRate=" + dayRate +
				", dWeek='" + dWeek + '\'' +
				", id=" + id +
				", lastModified='" + lastModified + '\'' +
				", notes=" + notes +
				", personnel=" + personnel +
				", personnelFk=" + personnelFk +
				", plantID=" + plantID +
				", pm='" + pm + '\'' +
				", projectFk=" + projectFk +
				", scope='" + scope + '\'' +
				", SSMA_TimeStamp=" + SSMA_TimeStamp +
				", state='" + state + '\'' +
				", typeOfWork='" + typeOfWork + '\'' +
				'}';
	}
}
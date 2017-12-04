package com.dempsey.plantSynchronizer.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * The persistent class for the Project database table.
 * 
 */
@Entity
@Table(name="Project")
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false)
	private int id;

	@Column(name="Active", nullable=false)
	private boolean active;

	@Column(name="Client")
	private int client;

	@Column(name="Date_Created", length=1)
	private String date_Created;

	private String dCurrent_Week;

	@Column(name="End_Date")
	private Date end_Date;

	@Column(name="Last_Modified", length=1)
	private String last_Modified;

	@Column(name="Last_Submitted_By")
	private String last_Submitted_By;

	@Column(name="Location")
	private String location;

	@Column(name="Notes")
	private String notes;

	@Column(name="On_Hold", nullable=false)
	private boolean on_Hold;

	@Column(name="Project_Details", nullable=false)
	private String project_Details;

	@Column(name="Project_ID")
	private String project_ID;

	@Column(name="Project_Manager")
	private int project_Manager;

	@Column(name="Project_Name")
	private String project_Name;

	@Column(name="QS")
	private int qs;

	@Column(name="Show_On_Civil_Jobs_List", nullable=false)
	private boolean show_On_Civil_Jobs_List;

	@Column(name="Start_Date")
	private Date start_Date;

	public Project() {
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getClient() {
		return client;
	}

	public void setClient(int client) {
		this.client = client;
	}

	public String getDate_Created() {
		return date_Created;
	}

	public void setDate_Created(String date_Created) {
		this.date_Created = date_Created;
	}

	public String getdCurrent_Week() {
		return dCurrent_Week;
	}

	public void setdCurrent_Week(String dCurrent_Week) {
		this.dCurrent_Week = dCurrent_Week;
	}

	public Date getEnd_Date() {
		return end_Date;
	}

	public void setEnd_Date(Date end_Date) {
		this.end_Date = end_Date;
	}

	public String getLast_Modified() {
		return last_Modified;
	}

	public void setLast_Modified(String last_Modified) {
		this.last_Modified = last_Modified;
	}

	public String getLast_Submitted_By() {
		return last_Submitted_By;
	}

	public void setLast_Submitted_By(String last_Submitted_By) {
		this.last_Submitted_By = last_Submitted_By;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean isOn_Hold() {
		return on_Hold;
	}

	public void setOn_Hold(boolean on_Hold) {
		this.on_Hold = on_Hold;
	}

	public String getProject_Details() {
		return project_Details;
	}

	public void setProject_Details(String project_Details) {
		this.project_Details = project_Details;
	}

	public String getProject_ID() {
		return project_ID;
	}

	public void setProject_ID(String project_ID) {
		this.project_ID = project_ID;
	}

	public int getProject_Manager() {
		return project_Manager;
	}

	public void setProject_Manager(int project_Manager) {
		this.project_Manager = project_Manager;
	}

	public String getProject_Name() {
		return project_Name;
	}

	public void setProject_Name(String project_Name) {
		this.project_Name = project_Name;
	}

	public int getQs() {
		return qs;
	}

	public void setQs(int qs) {
		this.qs = qs;
	}

	public boolean isShow_On_Civil_Jobs_List() {
		return show_On_Civil_Jobs_List;
	}

	public void setShow_On_Civil_Jobs_List(boolean show_On_Civil_Jobs_List) {
		this.show_On_Civil_Jobs_List = show_On_Civil_Jobs_List;
	}

	public Date getStart_Date() {
		return start_Date;
	}

	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}
}
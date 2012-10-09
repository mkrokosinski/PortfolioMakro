package mapsFiles;

import java.text.SimpleDateFormat;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

/*create table projects(id int auto_increment primary key, 
 * projectName varchar(50) unique not null, 
 * shortDescription varchar(500) not null default "Default description of project", 
 * longDescription text, 
 * createTime timestamp default now())engine=innodb default charset=utf8; */
@Entity
@Table(appliesTo = "projects")
public class Projects {
private String projectName,shortDescription, longDescription, createTime;
private Integer id;
public Projects(){
	
}



public Integer getId() {
	return id;
}



public void setId(Integer id) {
	this.id = id;
}

public String getProjectName() {
	return projectName;
}

public void setProjectName(String projectName) {
	this.projectName = projectName;
}

public String getShortDescription() {
	return shortDescription;
}

public void setShortDescription(String shortDescription) {
	this.shortDescription = shortDescription;
}

public String getLongDescription() {
	return longDescription;
}

public void setLongDescription(String longDescription) {
	this.longDescription = longDescription;
}

public String getCreateTime() {
	return createTime;
}

public void setCreateTime(String createTime) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	this.createTime = sdf.format(createTime);
}
}

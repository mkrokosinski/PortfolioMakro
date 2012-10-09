package mapsFiles;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

/*
 * create table projectImg (id int auto_increment primary key, 
 * imgName varchar(50) not null, 
 * imagePath varchar(20) not null default '../img', 
 * projectId int)engine=innodb default charset=utf8; 
 */
@Entity
@Table(appliesTo = "projectImg")
public class ProjectImg {
private String imgName, imgPath;
private Integer projectId, id;

public ProjectImg(){
	
}



public Integer getId() {
	return id;
}



public void setId(Integer id) {
	this.id = id;
}

public String getImgName() {
	return imgName;
}
public void setImgName(String imgName) {
	this.imgName = imgName;
}
public String getImgPath() {
	return imgPath;
}
public void setImgPath(String imgPath) {
	this.imgPath = imgPath;
}
public Integer getProjectId() {
	return projectId;
}
public void setProjectId(Integer projectId) {
	this.projectId = projectId;
}
}

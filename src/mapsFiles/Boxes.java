package mapsFiles;

import java.text.SimpleDateFormat;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "boxes")
/*
 * create table boxes(id int primary key auto_increment, title varchar(20) not
 * null default "default title", description varchar(500) not null default
 * "This is default description", link varchar(50), createTime timestamp not
 * null default now())engine=innodb default charset=utf8;
 */
public class Boxes {
	private String title, description, link, createTime;
	private Integer id;
	public Boxes(){
		
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		this.createTime = sdf.format(createTime);
	}
	
}

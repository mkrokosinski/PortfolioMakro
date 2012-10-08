package mapsFiles;

import java.text.SimpleDateFormat;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo="news")
public class News {
	private Integer id;
	private String title;
	private String content;
	private Integer authorId;
	private String postDate;
	private SimpleDateFormat sdf;
	
	
	public News(){
		
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



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public Integer getAuthorId() {
		return authorId;
	}



	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}



	public String getPostDate() {
		return postDate;
	}



	public void setPostDate(String postDate) {
		sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		this.postDate = sdf.format(postDate);
	}


	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", content=" + content
				+ ", authorId=" + authorId + ", postDate=" + postDate + "]";
	}
}

package mapsFiles;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
@Entity
@Table(appliesTo = "menu")
public class Menu {
private Integer id;
private String menuName;
private String linkToMenu;

public Menu(){
	
}

public Menu(String menuName, String linkToMenu){
	this.menuName = menuName;
	this.linkToMenu = linkToMenu;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}



public String getMenuName() {
	return menuName;
}

public void setMenuName(String menuName) {
	this.menuName = menuName;
}

public String getLinkToMenu() {
	return linkToMenu;
}

public void setLinkToMenu(String linkToMenu) {
	this.linkToMenu = linkToMenu;
}

@Override
public String toString() {
	return "Menu [id=" + id + ", menuName=" + menuName + ", linkToMenu="
			+ linkToMenu + "]";
}


}

package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.sun.javafx.beans.IDProperty;

@Entity
public class MockDto {
	@Id
private String email;
private String name;
private String phnum;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhnum() {
	return phnum;
}
public void setPhnum(String phnum) {
	this.phnum = phnum;
}

}

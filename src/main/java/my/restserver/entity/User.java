package my.restserver.entity;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@Column(name = "id")
	private int userId;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy="user")
	private Collection<Rating> rating = new ArrayList<Rating>();	
	
	public Collection<Rating> getRating() {
		return rating;
	}

	public void setRating(Collection<Rating> rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}


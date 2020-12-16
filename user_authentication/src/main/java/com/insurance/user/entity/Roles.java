package com.insurance.user.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="roles")
public class Roles implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="role_id")
    private int id;
	
	@Column(name="role_name")
	private String roleName;
	
	@Column(name="inUse")
	private int inUse;
	
	@ManyToMany(targetEntity = Users.class, mappedBy = "roles")
    private List<Users> users;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getInUse() {
		return inUse;
	}

	public void setInUse(int inUse) {
		this.inUse = inUse;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}
	
	
}

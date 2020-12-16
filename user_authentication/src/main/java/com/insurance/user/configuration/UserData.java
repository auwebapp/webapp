package com.insurance.user.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.insurance.user.entity.Roles;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.insurance.user.entity.Users;

public class UserData implements UserDetails {

	  private Users user = new Users();
	    List<Roles> roleList = new ArrayList<>();

	    public UserData() {
	    }

	    public UserData(Users user) {
	        this.user = user;
	        this.roleList = user.getRoles();
	    }
	    
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> simpleGrantedAuthorityList = new ArrayList<>();
        for(Roles role: roleList) {
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleName());
            simpleGrantedAuthorityList.add(authority);
        }
        return simpleGrantedAuthorityList;
	}

	@Override
	public String getPassword() {
		 return user.getPassword();
	}

	@Override
	public String getUsername() {
		  return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}

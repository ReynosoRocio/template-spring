package lat.hackademy.dbauthentication;

import java.util.Set;

import org.springframework.security.core.GrantedAuthority;

public interface UserDetails {

	 public Set<GrantedAuthority> getAuthorities();
	
	 public boolean isAccountNonExpired();
	 
	 public boolean isAccountNonLocked();
	 
	 public boolean isCredentialsNonExpired();

	 public boolean isEnabled();
}

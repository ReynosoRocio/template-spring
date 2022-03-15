/**
 * 
 */
package lat.hackademy.dbauthentication;

/**
 * @author Rocio
 *
 */
import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
 
@Entity
@Table(name = "usuario")
public class User implements UserDetails{
	/**
     * 
     */
    private static final long serialVersionUID = 1L;
 
    /**
     * 
     */
 
    @Id
    private Integer id;
 
    private String email;
 
    private String passUser;
 
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
 
    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
 
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
 
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
 
    /**
     * @return the passUser
     */
    public String getPassUser() {
        return passUser;
    }
 
    /**
     * @param passUser the passUser to set
     */
    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }
 
    @Override
    public Set<GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("USER"));
        return authorities;
    }
 
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
 
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
 
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }
 
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email + ", passUser=" + passUser + "]";
    }

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
}

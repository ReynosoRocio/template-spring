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
public class User {

}

package models.users;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class User extends Model {
  @Id
  private String email;

  @Constraints.Required
  private String role;

  @Constraints.Required
  private String name;
 
  @Constraints.Required
  private String password;


  public User(){
}

  public static Finder<String,User> find = new Finder<String,User>(User.class);

  public static List<User> findAll(){
	return User.find.all();
}

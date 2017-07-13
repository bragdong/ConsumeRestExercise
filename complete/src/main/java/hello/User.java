package hello;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int userId;

	private String userName;
	private String password;
	private String firstName;
	private String lastName;

	public User(String userName, String firstName, String lastName) {
		super();
		this.userName = userName;
		this.password = "";
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    @Override
    public String toString() {
        return "Value{" +
                "First Name=" + firstName  +
                '}';
    }
    
	public void merge(User other) {
		if (other.userName != null) {
			this.userName = other.userName;
		}
		if (other.firstName != null) {
			this.firstName = other.firstName;
		}
		if (other.lastName != null) {
			this.lastName = other.lastName;
		}
	}

}
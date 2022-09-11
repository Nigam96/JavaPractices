package amazonUsers;

public class CustomObject {
private String username;
private String password;
CustomObject (String Username, String Password){
	super();
	this.username=Username;
	this.password=Password;
}
//by this custom object constructor we are able to initialize our private fields
//and by this getter and setter methods we can use the private fields from outside


public String getUsername() {
	return username;
}
@Override
public String toString() {
	return "CustomObject [username=" + username + ", password=" + password + "]";
}




public String getPassword() {
	return password;
}

}




package webapp.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("TanVeeR") && password.equals("tanveer")) {
			return true;
		} else {
			return false;
		}
	}

}

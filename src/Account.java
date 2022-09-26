public class Account {
    private String username;
    private String password;

    Account(String u, String p) {
        username = u;
        password = p;
    }
    // for logging into account while keeping username/password info private
    public boolean checkCredentials(String u, String p) {
        if(username.equals(u) && password.equals(p)) return true;
        return false;
    }

    // username can be given for any account (assuming logged in user)
    public String getUsername() {
        return username;
    }
    // password cannot
    public String getPassword() {
        return "This Doesn't Work Intentionally";
    }

    // works with correct password like a normal setter function
    // if password is incorrect, username cannot be changed
    // so only user can change username

    // boolean for if username was changed or not
    public boolean setUsername(String newUsername, String p) {
        if(password.equals(p)) {
            username = newUsername;
            return true;
        }
        return false;
    }

    // works with correct old password like a normal setter function
    // if old password is incorrect, password cannot be changed

    // boolean if password was changed or not
    public boolean setPassword(String newP, String oldP) {
        if(password.equals(oldP)) {
            password = newP;
            return true;
        }
        else {
            return false;
        }
    }
}

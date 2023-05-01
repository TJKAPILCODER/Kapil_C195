package Models;

/**
 * In this class we have the variables and methods, to create
 * the model for users.
 */
public class UserModel {

    /**
     * Variables used in class
     */
        private int User_ID;
        private String User_Name;
        private String Password;
        private boolean isLoggedIn;

    /**
     * Constructor for ID, Name, Password.
     * @param user_ID
     * @param user_Name
     * @param password
     */
    public UserModel(int user_ID, String user_Name, String password) {
        this.User_ID = user_ID;
        this.User_Name = user_Name;
        this.Password = password;
    }

    /**
     * Constructor for id and username
     * @param user_ID
     * @param user_Name
     */
    public UserModel(int user_ID, String user_Name) {
        this.User_ID = user_ID;
        this.User_Name = user_Name;
    }

    /**
     * Constructor for User User_Name
     * @param User_Name
     */
    public UserModel(String User_Name) {
        this.User_Name = User_Name;
    }

    /**
     * constructor for Id, name, password, and if loggin in.
     * @param user_ID
     * @param user_Name
     * @param password
     * @param isLoggedIn
     */
    public UserModel(int user_ID, String user_Name, String password, boolean isLoggedIn) {
        User_ID = user_ID;
        User_Name = user_Name;
        Password = password;
        this.isLoggedIn = isLoggedIn;
    }

    /** --------------------------------- */

    /**
     * Getter and setter methods for variables.
     */

    /**
     * @return User_ID
     */
    public int getUser_ID() {
        return User_ID;
    }

    /**
     * set user id to something else.
     * @param user_ID
     */
    public void setUser_ID(int user_ID) {
        this.User_ID = user_ID;
    }

    /**
     * returns username of user that is logged into the program.
     * @return User_Name
     */
    public String getUser_Name() {
        return User_Name;
    }

    /**
     * Sets username to new username
     * @param user_Name
     */
    public void setUser_Name(String user_Name) {
        this.User_Name = user_Name;
    }

    /**
     * return selected password.
     * @return Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * set password to new password.
     * @param password
     */
    public void setPassword(String password) {
        this.Password = password;
    }

    /**
     * returns true if user logged into program.
     * @return
     */
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    /**
     * set to user logged in.
     * @param loggedIn
     */
    public void setLoggedIn(boolean loggedIn) {
        this.isLoggedIn = loggedIn;
    }

    /**
     * This method will concatenate user id and username
     * and return as string.
     */
    @Override
    public String toString() {
        return String.format("%d %s", User_ID, User_Name);
    }

}

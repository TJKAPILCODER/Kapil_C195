package kapil.kapil_c195;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * The 'LoginFormController' class, is the controller class for the loginForm.fxml view in the kapil_c195 folder. This form will let the user
 * login to the application, this user must use "test" to login to the system using the login button. If "test" is not
 * used then an error will be printed on to the screen for the user to see.
 *
 * the user can see at the bottom of the form the system time zone.
 * The form can be exited through the exit button
 *
 * Lambda expression used at Location: LoginFormController
 * Lines : 70 - 71
 *
 * @author TJ Kapil
 **/

/**
 * Button and label variables used throughout the form.
 */
public class loginFormController {

    Stage stage;
    @FXML
    private Button ExitBtn; // to exit the program

    @FXML
    private Label errorMessageLabel; // error message for in correct login

    @FXML
    private Text LoginLabel; // label for login. Title of form.

    @FXML
    private Label locationLabel; // time zone label, system dependent

    @FXML
    private Button loginBtn; // used to enter into application after login detail entered.

    @FXML
    private PasswordField loginPasswordTextField; // area to enter password.

    @FXML
    private TextField loginUsernameTextField; // area to enter user name.

    @FXML
    private Label passwordLabel; // password label, used during language change

    @FXML
    private Label usernameLabel; // username label, used during language change

    /** ----------------------------------------------------------------------------------------------------------------- */

    /**
     *
     * @param actionEvent
     */
    public void loginUser(ActionEvent actionEvent) {
    }

    /** ----------------------------------------------------------------------------------------------------------------- */

    /**
     * The ExitApplication method is called when the "Exit" button is clicked on
     * the form. It will close the current stage. The current stage is the top level container
     * which holds the rest of the User Interface elements of the program.
     * Lambda expression used at Location: LoginFormController
     *  * Lines : 70 - 71
     *  In this method, I used a lambda expression to simplify the code and remove the need
     *  for a separate stage variable.
     * @param actionEvent
     */
    public void ExitApplication(ActionEvent actionEvent) {
        ((Stage) ExitBtn.getScene().getWindow()).close(); // The getScene().getWindow() method call returns
        // the current window,
        // which is cast to a Stage and closed using the close() method.
    }

    /** ----------------------------------------------------------------------------------------------------------------- */

}

import controller.Controller;
import view.DefaultView;

/**
 * The Class Launcher.
 */
public class Launcher {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Controller controller = new Controller(new DefaultView());
	}

}

import controller.Controller;
import model.Model;
import view.DefaultView;

public class Launcher {

	public static void main(String[] args) {
		Model model = new Model();
		DefaultView defaultView = new DefaultView(model);
		Controller controller = new Controller(model, defaultView);
		
	}

}

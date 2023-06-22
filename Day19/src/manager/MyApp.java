package manager;
import manager.controller.StudentManagerController;
import manager.repository.Repository;
import manager.repository.impl.*;

public class MyApp {
	
	public static void main(String args[]) throws Exception {

		StudentManagerController controller = new StudentManagerController();
		controller.systemStart();
		
	}
	
}

package dad.javafx.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private ChooserController chooserController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		chooserController = new ChooserController();
		Scene scene = new Scene(chooserController.getRootView(), 480, 320);
		
		primaryStage.setTitle("Consulta fecha");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

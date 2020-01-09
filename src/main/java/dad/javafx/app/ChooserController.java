package dad.javafx.app;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import dad.javafx.componentes.DateChooser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;

public class ChooserController implements Initializable {

	// FXML : View
	//----------------------------------------------
	
    @FXML
    private VBox view;

    @FXML
    private DateChooser dateChooser;

    @FXML
    private Button initBt;

    @FXML
    private Button consultarBt;
    
  //----------------------------------------------
    
    
	public ChooserController() throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AppView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

    @FXML
    void onConsultarBt(ActionEvent event) {

    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Fecha");
    	alert.initOwner(getRootView().getScene().getWindow());
    	
    	LocalDate ourDate = dateChooser.getDate();
    	String dateStr = String.format("%d/%d/%d", ourDate.getDayOfMonth(), ourDate.getMonthValue(), ourDate.getYear());
    	alert.setContentText("La fecha seleccionada es: " + dateStr);
    	
    	alert.showAndWait();
    }

    @FXML
    void onInitBt(ActionEvent event) {
    	dateChooser.adjustDate(LocalDate.now());
    }

    public VBox getRootView() {
		return view;
	}
}
	
	


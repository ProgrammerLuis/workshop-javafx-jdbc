package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

	public static Stage currentStage(ActionEvent event) { //vai mostrar aonde o Stage(Palco) esta
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}
}
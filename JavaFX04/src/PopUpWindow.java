
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PopUpWindow {
	
	public static void display(String title, String message) {
		Stage stage = new Stage();
		stage.initModality(Modality.APPLICATION_MODAL);//This line of code does not allow you to interact with the window behind
		//the pop up window until the pop up window is closed
		stage.setTitle("PopUpWindow");
		stage.setWidth(300);
		stage.setHeight(250);
		Label label = new Label();
		label.setAlignment(Pos.BASELINE_CENTER);
		label.setText(message);
		Button btn = new Button();
		btn.setLayoutX(100);
		btn.setLayoutY(100);
		btn.setText("Click Here To Close");
		btn.setOnAction(e -> stage.close());// using lambda expressions here
		Group root = new Group();
		ObservableList list = root.getChildren();
		list.add(btn);
		list.add(label);
		Scene scene = new Scene(root,350,200);
		stage.setScene(scene);
		stage.show();
		
	}
	
}

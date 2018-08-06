import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class javaFX04 extends Application{
	
	Button btn;
	Group root;
	ObservableList list;
	Scene scene;
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		arg0.setTitle("First Window");
		btn = new Button();
		btn.setText("Press Here");
		btn.setLayoutX(100);
		btn.setLayoutY(100);
		root = new Group();
		list = root.getChildren();
		list.add(btn);
		btn.setOnAction(e -> PopUpWindow.display("Pop Up Window", "This is a Pop Up"));//Using lambda expressions here again
		scene = new Scene(root,300,250);
		arg0.setScene(scene);
		arg0.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}

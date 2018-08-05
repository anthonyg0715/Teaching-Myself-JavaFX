import org.w3c.dom.events.EventException;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//To handle button clicks we need to implement EventHandler and then we need to represent the action we want to do which is
//an ActionEvent
public class javaFXEventHandling extends Application implements EventHandler<ActionEvent>{
	
	Button btn;//Defining a button
	Group root = new Group();//defining the root of the node using group 
	Group root2 = new Group();
	Text txt;
    //Start is a life cycle for JavaFX and it is where the code goes for the GUI
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("First Time Using JavaFx");//setting the title in the stage
		btn = new Button();//creating a new button in memory
		btn.setText("Press Me!");//setting the text
		btn.setLayoutX(100);
		btn.setLayoutY(100);
		btn.setOnAction(this);//code to handle click is in this class which is what this refers to 
		ObservableList list = root.getChildren();//we need this list to retrieve the leaf nodes 
		list.add(btn);//then we can add items to the list such as our button for example 
		Scene scene1 = new Scene(root,300,250);//creating the scene and adding the root to the scene 
		scene1.setFill(Color.CYAN);//setting some color for the scene
		primaryStage.setScene(scene1);//setting the scene in the stage 
		primaryStage.show();//displaying the stage
		
	}
	
	public void start2() {
		Stage stage2 = new Stage();
		stage2.setTitle("Window 2");
		stage2.setX(55);
		stage2.setY(60);
		txt = new Text();
		txt.setText("Window 2");
		txt.setX(100);
		txt.setY(100);
		ObservableList list2 = root2.getChildren();
		list2.add(txt);
		Scene scene = new Scene(root2,300,250);
		stage2.setScene(scene);
		stage2.show();
	}
	
	//We are overriding the handle method from the EventHandler interface 
	@Override
	public void handle(ActionEvent event) {
		//A check to see which button we are pressing
		if(event.getSource().equals(btn)) {
			try {
				start2();//void method I created which opens another window
			}catch(EventException ee) {
				System.out.println(ee);
			}//try catch block for event exceptions 
		}
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}
	
}

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class javaFXEasierEventHandling extends Application{
	
	Button btn;
	Group root = new Group();
	Group root2 = new Group();
	Text txt = new Text();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("First Time Using JavaFx");//setting the title in the stage
		btn = new Button();//creating a new button in memory
		btn.setText("Press Me!");//setting the text
		btn.setLayoutX(100);
		btn.setLayoutY(100);
		//we can have anonymous classes right on the button object instead of saying this. However as we can see
		//anonymous classes can still be somewhat bulky so we can create something called lambda expressions to clean
		//this up
		/*btn.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				if(event.getSource().equals(btn)) {
					try {
						start2();//void method I created which opens another window
					}catch(EventException ee) {
						System.out.println(ee);
					}//try catch block for event exceptions 
				}
				
			}
			
		});*/
		//Here is a lambda expression which is way cleaner and better looking than using anonymous classes as above run the code
		//and you will see that it still works. This works because handle is the only method in the event handler interface and
		//therefore that is where our lambda expression e knows where to look and the -> points to what we want to do when that
		//event is triggered on this certain button.
		btn.setOnAction(e -> start2());
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
	
	public static void main(String args[]) {
		launch(args);
	}
	
}

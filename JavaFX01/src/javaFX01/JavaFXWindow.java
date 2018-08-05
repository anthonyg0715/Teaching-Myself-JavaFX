package javaFX01;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;//Scene is all the stuff inside the stage 
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;//Stage is the window 

//We extend class Application just like how when we use swing we extend JFrame
public class JavaFXWindow extends Application{
	
	Text txt;//defining a new text 
	Group root = new Group();//defining the root of the node using group 
	
    //Start is a life cycle for JavaFX and it is where the code goes for the GUI
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("First Time Using JavaFx");//setting the title in the stage
		txt = new Text();//creating a new text in memory
		txt.setText("Liking JavaFX So Far!");//setting the text
		txt.setX(95);//the text's X coordinate 
		txt.setY(95);//the text's Y coordinate
		ObservableList list = root.getChildren();//we need this list to retrieve the leaf nodes 
		list.add(txt);//then we can add items to the list such as our text for example 
		Scene scene1 = new Scene(root,300,250);//creating the scene and adding the root to the scene 
		scene1.setFill(Color.CYAN);//setting some color for the scene
		primaryStage.setScene(scene1);//setting the scene in the stage 
		primaryStage.show();//displaying the stage
		
	}

}

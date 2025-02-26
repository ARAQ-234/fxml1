package application;
	
import java.net.URL;

import javafx.application.Application;
//import javafx.beans.binding.Bindings;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
@Override
public void start(Stage stage) throws Exception {
 Parent root = FXMLLoader.load(getClass().getResource("board.fxml"));
 StackPane container = new StackPane(root);
 Scene scene = new Scene(container, 763, 448);

 setupResponsiveScaling(container, root);

 stage.setScene(scene);
 stage.setTitle("Responsive GUI");
 stage.show();
}

private void setupResponsiveScaling(StackPane container, Parent content) {
 final double initialWidth = 867;
 final double initialHeight = 526;

 // Scale bindings
 content.scaleXProperty().bind(container.widthProperty().divide(initialWidth));
 content.scaleYProperty().bind(container.heightProperty().divide(initialHeight));

 // Centering translation bindings using Bindings
 // content.translateXProperty().bind(
 // Bindings.subtract(container.widthProperty(),
 // Bindings.multiply(initialWidth, content.scaleXProperty()))
 // .divide(2));

 // content.translateYProperty().bind(
 // Bindings.subtract(container.heightProperty(),
 // Bindings.multiply(initialHeight, content.scaleYProperty()))
 // .divide(2));
}

public static void main(String[] args) {
 launch(args);
}
}

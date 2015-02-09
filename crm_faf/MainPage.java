import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Main Page");
        Button btn1 = new Button();
        btn1.setText("New Customer Page");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Click");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn1);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Main Page");
        Button btn2 = new Button();
        btn2.setText("Customer Form");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Click");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn2);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Main Page");
        Button btn3 = new Button();
        btn3.setText("Status Scene");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Click");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn3);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Main Page");
        Button btn4 = new Button();
        btn4.setText("Window Toolbar");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Click");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn4);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
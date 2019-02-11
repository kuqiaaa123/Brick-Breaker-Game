
import java.util.HashSet;
import java.util.Set;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiach
 */
public class BrickBreakerGame extends Application{
    public void start(Stage primaryStage)
    {
        BrickBreakerPane brickBreakerPane=new BrickBreakerPane();
        Scene brickBreadkerScene=new Scene(brickBreakerPane,511,500);
        
        brickBreadkerScene.setOnKeyPressed(e-> {
            if(e.getCode()==KeyCode.LEFT)
                brickBreakerPane.getPaddle().setLeft(true);
            else if(e.getCode()==KeyCode.RIGHT)
                brickBreakerPane.getPaddle().setRight(true);
            brickBreakerPane.update();
        });
        brickBreadkerScene.setOnKeyReleased(e-> {
            if(e.getCode()==KeyCode.LEFT)
                brickBreakerPane.getPaddle().setLeft(false);
            else if(e.getCode()==KeyCode.RIGHT)
                brickBreakerPane.getPaddle().setRight(false);
            brickBreakerPane.update();
        });
        
        
        
        
        primaryStage.setScene(brickBreadkerScene);
        primaryStage.setTitle("Brick Breaker Game by Jiachao chen");
        primaryStage.show();
        
       // brickBreakerPane.run();
    }
}

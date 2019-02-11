
import javafx.scene.layout.Pane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiach
 */
public class BrickBreakerPane extends Pane {
    private Block block[];
    private Paddle paddle;
    
    public BrickBreakerPane()
    {
        block=new Block[30];
        paddle=new Paddle();
        allocBlock();
        setBlock();
        getChildren().add(paddle.getRectangle());
        paddle.getRectangle().setLayoutX(paddle.getX());
        paddle.getRectangle().setLayoutY(paddle.getY());
    }
    
    //************ getter()************
    public Block getBlock(int pos){return block[pos];}
    public Paddle getPaddle() { return paddle;}
    
    public void update()
    {
        paddle.move();
        paddle.getRectangle().setLayoutX(paddle.getX());
        System.out.println(paddle.getX());
    }
    
    public void run(){
        while(true){
           // update();
            
            
            try{ Thread.sleep(10);}
            catch(InterruptedException e) {e.printStackTrace(); }
        }
    }
    
    /**
     * set all block to position
     */
    public void setBlock()
    {
        int x=1,y=1;
        for(int i=0;i<30;i++){
            block[i].setLayoutX(x);
            block[i].setLayoutY(y);
            x+=block[i].getWidth()+1;
            if((i+1)%10==0)
            {
                y+=block[i].getHeight()+1;
                x=1;
            }
        }
    }
    
    /**
     * allocated all blocks
     */
    public void allocBlock()
    {
        for(int i=0;i<30;i++){
            block[i]=new Block();
            getChildren().add(block[i]);
        }
    }
}

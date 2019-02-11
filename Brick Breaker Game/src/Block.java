
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiach
 */
public class Block extends Rectangle{
    private final int WIDTH=50,HEIGHT=50;
    private int level;
    
    public Block()
    {
        this.setWidth(WIDTH);
        this.setHeight(HEIGHT);
        this.setLayoutX(0);
        this.setLayoutY(0);
        setLevel();
        setBlockColor(level);
    }
    public Block(int x,int y)
    {
        this.setWidth(WIDTH);
        this.setHeight(HEIGHT);
        this.setLayoutX(x);
        this.setLayoutY(y);
        setLevel();
        setBlockColor(level);
    }
    
    //*************getter()***********
    public int getLevel() { return level;}
    
    public void setLevel(){
        level=(int)(Math.random()*3+1);
    }
    
    /**
     * set Color of block
     * if 1 set it brown
     * if 2 set to gray
     * if 3 set to black
     * else set to brown
     * @param level 
     */
    public void setBlockColor(int level){
        if(level==2)
            this.setFill(Color.GRAY);
        else if(level==3)
            this.setFill(Color.BLACK);
        else
            this.setFill(Color.BROWN);
    }
}


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
public class Paddle {
    private final int WIDTH=80,HEIGTH=20;
    private Rectangle rectangle;
    private double x,xVel,force;
    private int y;
    private boolean left,right;
    
    public Paddle()
    {
        rectangle=new Rectangle();
        rectangle.setWidth(WIDTH);
        rectangle.setHeight(HEIGTH);
        x=215.5;
        xVel=0;
        force=0.99;
        y=479;
        left=false;
        right=false;
        rectangle.setLayoutX(x);
        rectangle.setLayoutY(y);
    }
    
    //*************getter（）*************
    public int getY() { return y;}
    public double getX() { return x;}
    public Rectangle getRectangle() { return rectangle;}
    public int getWidth() { return WIDTH;}
    public int getHeight() { return HEIGTH;}
    public boolean getLeft() { return left;}
    public boolean getRight() { return right;}
    public double getXVel() { return xVel;}
    public double getForce() { return force;}
    
    public void setX(double x){
        if(x<=0)
            this.x=1;
        else if(x>=431)
            this.x=430;
        else
            this.x=x;
    } 
    public void setLeft(boolean bool){
        left=bool;
    }
    public void setRight(boolean bool){
        right=bool;
    }
    
    public void move(){     
        if(left==true)
            xVel-=2;
        else if(right==true)
            xVel+=2;
        else if(left==false && right==false)
            xVel*=force;
        
        if(xVel<=-10)
            xVel=-10;
        else if(xVel>=10)
            xVel=10;
        setX(x+=xVel);
        rectangle.setLayoutX(x);
    }
}

package Main;

import java.awt.*;

public abstract class GameObject { // enemies, characters, etc.
    protected int x, y; // it can only be accessed by which object inherits the game object
    protected ID id;
    protected int velX, velY;

    public GameObject(int x, int y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setId(ID id){
        this.id = id;
    }

    public ID getId(){
        return id;
    }

    public void setVelX(int velX){
        this.velX = velX;
    }

    public void setVelY(int velY){
        this.velY = velY;
    }

    public void getVelX(int velX){
        this.velX = velX;
    }

    public void getVelY(int velY){
        this.velY = velY;
    }






}
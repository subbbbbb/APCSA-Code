package Main;


import java.awt.Graphics;
import java.util.LinkedList;

public class Handler { // this class is for all the individual objects
    LinkedList<GameObject> object = new LinkedList<GameObject>();
    public void tick(){
        for (int i = 0; i < object.size(); i++) { // this loops through all of our gameObjects
            GameObject tempObject = object.get(i);

            tempObject.tick();
        }
    }
    public void render(Graphics g){
        for (int i = 0; i < object.size(); i++) {
            GameObject tempObject = object.get(i);
            tempObject.render(g);
        }
    }

    public void addObject(GameObject object){
        this.object.add(object);
    }

    public void removeObject(GameObject object){
        this.object.remove(object);
    }

}

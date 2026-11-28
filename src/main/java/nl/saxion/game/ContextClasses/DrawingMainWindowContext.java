package nl.saxion.game.ContextClasses;

import nl.saxion.game.yourgamename.Box;

public class DrawingMainWindowContext {
    public float worldWith;
    public float worldHeight;
    public Box box;
    public String color;
    public String boxColor;
    public DrawingMainWindowContext(float worldWith,float worldHeight, Box box, String color, String boxColor){
        this.worldWith = worldWith;
        this.worldHeight = worldHeight;
        this.box = box;
        this.color = color;
        this.boxColor = boxColor;
    }
}

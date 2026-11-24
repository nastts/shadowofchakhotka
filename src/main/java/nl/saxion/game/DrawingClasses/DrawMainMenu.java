package nl.saxion.game.DrawingClasses;

import nl.saxion.game.ContextClasses.DrawingMenuContext;
import nl.saxion.gameapp.GameApp;

public class DrawMainMenu extends DrawManager<DrawingMenuContext> {
  public void draw(DrawingMenuContext context){
        layerOne(context);
        layerTwo(context);
        layerThree(context);
    }

    private void layerOne(DrawingMenuContext context){
        GameApp.clearScreen("black");
        GameApp.startSpriteRendering();
        GameApp.drawTextCentered("basic", "Start Game (press enter)", context.worldWidth/2, context.worldHeight/2, "amber-500");
        GameApp.endSpriteRendering();
    }
    private void layerTwo(DrawingMenuContext context){

    }
    private void layerThree(DrawingMenuContext context){

    }
}

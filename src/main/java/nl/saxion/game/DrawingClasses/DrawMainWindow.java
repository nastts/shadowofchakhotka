package nl.saxion.game.DrawingClasses;


import nl.saxion.game.ContextClasses.DrawingMainWindowContext;
import nl.saxion.gameapp.GameApp;

public class DrawMainWindow extends DrawManager<DrawingMainWindowContext> {
    public void draw(DrawingMainWindowContext context){
        layerOne(context);
        layerTwo(context);
        layerThree(context);
    }

    private void layerOne(DrawingMainWindowContext context){

        float boxX = context.worldWith / 2 - context.box.getWidth() / 2;
        float boxY = context.worldHeight / 2 - context.box.getHeight() / 2;


        GameApp.clearScreen(context.color);
        GameApp.startShapeRenderingFilled();
        GameApp.drawRect(boxX, boxY, context.box.getWidth(), context.box.getHeight(), context.boxColor);
        GameApp.endShapeRendering();
    }
    private void layerTwo(DrawingMainWindowContext context){

    }
    private void layerThree(DrawingMainWindowContext context){

    }
}

package nl.saxion.game.yourgamename;

import com.badlogic.gdx.Input;
import nl.saxion.gameapp.GameApp;
import nl.saxion.gameapp.screens.ScalableGameScreen;

public class YourGameScreen extends ScalableGameScreen {

    public YourGameScreen() {
        super(1280, 720);
    }

    @Override
    public void show() {
        GameApp.addFont("basic", "fonts/basic.ttf", 100); //add fonts
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        if (GameApp.isKeyPressed(Input.Keys.ENTER)){
            GameApp.switchScreen("MainMenuScreen");
        }

        GameApp.clearScreen("black");

        GameApp.startSpriteRendering();

        GameApp.drawTextCentered("basic", "placeholder for game", getWorldWidth()/2, getWorldHeight()/2, "white");
        GameApp.drawTextCentered("basic", "press enter to exit", getWorldWidth()/2, getWorldHeight()/2 - 100, "white");

        GameApp.endSpriteRendering();
    }

    @Override
    public void hide() {
        GameApp.disposeFont("basic");
    }
}

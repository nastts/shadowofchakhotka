package nl.saxion.game.yourgamename;

import com.badlogic.gdx.Input;
import nl.saxion.gameapp.GameApp;
import nl.saxion.gameapp.screens.ScalableGameScreen;

public class MainMenuScreen extends ScalableGameScreen {
    public MainMenuScreen() {
        super(1280, 720);
    }

    @Override
    public void show() {
        GameApp.addFont("basic", "fonts/basic.ttf", 100); //add fonts
    }

    @Override
    public void render(float delta) {
        super.render(delta);


        //going to be replaced by the mouse interaction
        if (GameApp.isKeyPressed(Input.Keys.NUM_1)){
            GameApp.switchScreen("YourGameScreen");
        }else if (GameApp.isKeyPressed(Input.Keys.NUM_2)){
            GameApp.switchScreen("SettingsScreen");
        }else if (GameApp.isKeyPressed(Input.Keys.NUM_3)){
            GameApp.quit();
        }

        GameApp.clearScreen("black");
        GameApp.startSpriteRendering();

        GameApp.drawTextCentered("basic", "Shadow of Chakhotka", getWorldWidth()/2, getWorldHeight() - 200, "red-800");
        GameApp.drawTextCentered("basic", "1) Start game", getWorldWidth()/2,  getWorldHeight() - 300, "white");
        GameApp.drawTextCentered("basic", "2) Settings", getWorldWidth()/2, getWorldHeight() - 400, "white");
        GameApp.drawTextCentered("basic", "3) Exit", getWorldWidth()/2, getWorldHeight() - 500, "white");

        GameApp.endSpriteRendering();
    }

    @Override
    public void hide() {
        GameApp.disposeFont("basic");
    }
}

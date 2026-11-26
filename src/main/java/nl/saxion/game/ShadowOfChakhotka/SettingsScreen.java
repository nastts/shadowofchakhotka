package nl.saxion.game.ShadowOfChakhotka;

import com.badlogic.gdx.Input;
import nl.saxion.gameapp.GameApp;
import nl.saxion.gameapp.screens.ScalableGameScreen;

public class SettingsScreen extends ScalableGameScreen {
    public SettingsScreen() {
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

        GameApp.drawTextCentered("basic", "placeholder for settings", getWorldWidth()/2, getWorldHeight()/2, "white");
        GameApp.drawTextCentered("basic", "press enter to exit", getWorldWidth()/2, getWorldHeight()/2 - 100, "white");

        GameApp.endSpriteRendering();
    }

    @Override
    public void hide() {
        GameApp.disposeFont("basic");
    }
}

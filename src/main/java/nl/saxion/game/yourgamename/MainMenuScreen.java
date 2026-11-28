package nl.saxion.game.yourgamename;

import com.badlogic.gdx.Input;
import nl.saxion.game.ContextClasses.DrawingMenuContext;
import nl.saxion.game.DrawingClasses.DrawMainMenu;
import nl.saxion.gameapp.GameApp;
import nl.saxion.gameapp.screens.ScalableGameScreen;

public class MainMenuScreen extends ScalableGameScreen {
    public MainMenuScreen() {
        super(1280, 720);
    }

    @Override
    public void show() {
        GameApp.addFont("basic", "fonts/basic.ttf", 100);
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        // When the user presses enter, go to the next screen
        if (GameApp.isKeyJustPressed(Input.Keys.ENTER)) {
            GameApp.switchScreen("YourGameScreen");
        }

        // Render the main menu
        DrawMainMenu DMM = new DrawMainMenu();
        DMM.draw(new DrawingMenuContext(getWorldWidth(),getWorldHeight()));

    }

    @Override
    public void hide() {
        GameApp.disposeFont("basic");
    }
}

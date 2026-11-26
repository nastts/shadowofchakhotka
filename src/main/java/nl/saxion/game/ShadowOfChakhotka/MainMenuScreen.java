package nl.saxion.game.ShadowOfChakhotka;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import nl.saxion.gameapp.GameApp;
import nl.saxion.gameapp.screens.ScalableGameScreen;

public class MainMenuScreen extends ScalableGameScreen {
    public MainMenuScreen() {
        super(1280, 720);
    }

    public static final int RECTANGLE_BUTTON_WIDTH = 475;
    public static final int RECTANGLE_BUTTON_HEIGHT = 80;
    public final float RECTANGLE_BUTTON_X = getWorldWidth()/2 - getWorldHeight()/3;

    MainMenuButton start_button = new MainMenuButton();
    MainMenuButton settings_button = new MainMenuButton();
    MainMenuButton exit_button = new MainMenuButton();

    @Override
    public void show() {
        GameApp.addFont("basic", "fonts/basic.ttf", 100); //add fonts

        GameApp.addColor("invisibleColor", 255, 255, 255, 0);

        start_button.width = RECTANGLE_BUTTON_WIDTH;
        start_button.height = RECTANGLE_BUTTON_HEIGHT;

        settings_button.width = RECTANGLE_BUTTON_WIDTH;
        settings_button.height = RECTANGLE_BUTTON_HEIGHT;

        exit_button.width = RECTANGLE_BUTTON_WIDTH;
        exit_button.height = RECTANGLE_BUTTON_HEIGHT;
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        start_button.x = RECTANGLE_BUTTON_X;
        settings_button.x = RECTANGLE_BUTTON_X;
        exit_button.x = RECTANGLE_BUTTON_X;

        start_button.y = getWorldHeight() - 340;
        settings_button.y = getWorldHeight() - 440;
        exit_button.y = getWorldHeight() - 540;

        if (GameApp.isButtonJustPressed(Input.Buttons.LEFT)){
            float mouseX = getMouseX();
            float mouseY = getMouseY();

            //check click on start game button
            if ((mouseX >= start_button.x && mouseX <= start_button.x + start_button.width) && (mouseY >= start_button.y && mouseY <= start_button.y + start_button.height)){
                GameApp.switchScreen("YourGameScreen");
            }else if ((mouseX >= settings_button.x && mouseX <= settings_button.x + settings_button.width) && (mouseY >= settings_button.y && mouseY <= settings_button.y + settings_button.height)){
                GameApp.switchScreen("SettingsScreen");
            }else if ((mouseX >= exit_button.x && mouseX <= exit_button.x + exit_button.width) && (mouseY >= exit_button.y && mouseY <= exit_button.y + exit_button.height)){
                GameApp.quit();
            }
        }

        //going to be replaced by the mouse interaction
        if (GameApp.isKeyPressed(Input.Keys.NUM_1)){
            GameApp.switchScreen("YourGameScreen");
        }else if (GameApp.isKeyPressed(Input.Keys.NUM_2)){
            GameApp.switchScreen("SettingsScreen");
        }else if (GameApp.isKeyPressed(Input.Keys.NUM_3)){
            GameApp.quit();
        }

        GameApp.clearScreen("black");

        GameApp.enableTransparency();

        GameApp.startShapeRenderingFilled();

        GameApp.drawRect(start_button.x, start_button.y, start_button.width, start_button.height, "invisibleColor");
        GameApp.drawRect(settings_button.x, settings_button.y, settings_button.width, settings_button.height, "invisibleColor");
        GameApp.drawRect(exit_button.x, exit_button.y, exit_button.width, exit_button.height, "invisibleColor");

        GameApp.endShapeRendering();

        GameApp.startSpriteRendering();

        GameApp.drawTextCentered("basic", "Shadow of Chakhotka", getWorldWidth()/2, getWorldHeight() - 200, "red-800");
        GameApp.drawTextCentered("basic", "Start game", getWorldWidth()/2,  getWorldHeight() - 300, "white");
        GameApp.drawTextCentered("basic", "Settings", getWorldWidth()/2, getWorldHeight() - 400, "white");
        GameApp.drawTextCentered("basic", "Exit", getWorldWidth()/2, getWorldHeight() - 500, "white");

        GameApp.endSpriteRendering();
    }

    @Override
    public void hide() {
        GameApp.disposeFont("basic");
    }
}

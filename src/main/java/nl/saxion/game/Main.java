package nl.saxion.game;

import nl.saxion.game.ShadowOfChakhotka.YourGameScreen;
import nl.saxion.game.ShadowOfChakhotka.MainMenuScreen;
import nl.saxion.gameapp.GameApp;

public class Main {
    public static void main(String[] args) {
        // Add screens
        GameApp.addScreen("MainMenuScreen", new MainMenuScreen());
        GameApp.addScreen("YourGameScreen", new YourGameScreen());
        GameApp.addScreen("SettingsScreen", new SettingsScreen());

        // Start game loop and show main menu screen
        GameApp.start("Shadow Of Chakhotka", 800, 450, 60, false, "MainMenuScreen");
    }
}

package nl.saxion.game.ShadowOfChakhotka;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import nl.saxion.gameapp.GameApp;

public class InterfaceStatemachine {

}

enum GameState{

    STARTGAME{
        public boolean startGame(){
            if(GameApp.getCurrentScreenName().equals("MainMenuScreen") && GameApp.isKeyJustPressed(Input.Keys.ENTER)){
                GameApp.switchScreen("YourGameScreen");
            }
            return true;
        }
    },

    PAUSEGAME{
        /*public boolean pauseGame(){
            if(GameApp.getCurrentScreenName().equals("YourGameScreen") && GameApp.isButtonPressed){
                GameApp.switchScreen("YourGameScreen");
            }
            return true;
        }*/
        },

    EXITGAME{
        public void exitGame(){
            GameApp.quit();
        }
    },

    EXITTOMENU{
      public boolean exitToMenu(){
          if(GameApp.getCurrentScreenName().equals("YourGameScreen") /* && GameApp.isKeyJustPressed()*/){
              GameApp.switchScreen("YourGameScreen");
          }
          return true;
      }
    },

    TALKTONPC{
        /*public boolean talkToNPC(){
            if(GameApp.getCurrentScreenName().equals("YourGameScreen") && GameApp.isButtonPressed){
                GameApp.switchScreen("YourGameScreen");
            }
            return true;
        }*/
    },

    INSPECTNPCTEMPERATURE{
        /*public boolean InspectNPCTEMPERATURE(){
            if(GameApp.getCurrentScreenName().equals("YourGameScreen") && GameApp.isButtonPressed){
                GameApp.switchScreen("YourGameScreen");
            }
            return true;
        }*/
    },

    INSPECTNPCEYES{
        /*public boolean InspectNPCEyes(){
            if(GameApp.getCurrentScreenName().equals("YourGameScreen") && GameApp.isButtonPressed){
                GameApp.switchScreen("YourGameScreen");
            }
            return true;
        }*/
    },

    INSPECTNPCNECK{
        /*public boolean InspectNPCNECK(){
            if(GameApp.getCurrentScreenName().equals("YourGameScreen") && GameApp.isButtonPressed){
                GameApp.switchScreen("YourGameScreen");
            }
            return true;
        }*/
    },

    CONTINUETONEXTDAY{

    },

    OPENSETTINGS{

    }





}

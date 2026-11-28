package nl.saxion.game.ShadowOfChakhotka.Inspect;

public class BodyInspection extends Inspect{
    public void startBodyInspection(){
        if (openInspectWindow()){
            //the main functionality:
            //show the body of a person or change the window to the inspection
        }else{
            //idk now what we are going to place there
        }
    }
    public void endBodyInspection(){
        if (closeInspectWindow()){
            //the main functionality
            //go back to the main menu, this option becomes unavailable
        }else{
            //idk now what we are going to place there
        }
    }
}

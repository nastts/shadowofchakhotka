package nl.saxion.game.ShadowOfChakhotka.Inspect;

public class EyesInspection extends Inspect{
    public void startEyesInspection(){
        if (openInspectWindow()){
            //the main functionality:
            //show the light reaction of a person or change the window to the inspection
        }else{
            //idk now what we are going to place there
        }
    }
    public void endEyesInspection(){
        if (closeInspectWindow()){
            //the main functionality
            //go back to the main menu, this option becomes unavailable
        }else{
            //idk now what we are going to place there
        }
    }
}

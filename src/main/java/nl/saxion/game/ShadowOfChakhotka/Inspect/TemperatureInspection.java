package nl.saxion.game.ShadowOfChakhotka.Inspect;

public class TemperatureInspection extends Inspect{
    public void startTemperatureInspection(){
        if (openInspectWindow()){
            //the main functionality:
            //show the temperature of a person or change the window to the inspection
        }else{
            //idk now what we are going to place there
        }
    }
    public void endTemperatureInspection(){
        if (closeInspectWindow()){
            //the main functionality
            //go back to the main menu, this option becomes unavailable
        }else{
            //idk now what we are going to place there
        }
    }
}

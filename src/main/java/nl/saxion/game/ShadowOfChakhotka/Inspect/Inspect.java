package nl.saxion.game.ShadowOfChakhotka.Inspect;

public class Inspect {
    public boolean isUsed;
    public boolean isOpen;

    //the function is called when a new person comes and it resets all inspects
    public void resetInspection(){
            isUsed = false;
            isOpen = false;
    }

    public boolean openInspectWindow(){
        if (!isUsed && !isOpen){
            //open window of the inspection
            isOpen = true;
            isUsed = true;
            return true;
        }else{
            //idk change the button to show unavailability
            return false;
        }
    }

    public boolean closeInspectWindow(){
        if (isOpen){
            //open window
            isOpen = false;
            return true;
        }else{
            //idk change the button to show unavailability
            return false;
        }
    }
}


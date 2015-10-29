package shapes;

/**
 * Created by Clayton on 10/15/2015.
 */
public class ShapeController {
    //I totally LOVE Android Studio!
    public enum ORIENTATION{Directional, FrontFacing}
    //Directional means it orients based on the direction it is going. Front facing always faces one direction

    private ShapeController(){}//not to be instantiated

    public static void squareCommands(ORIENTATION o, int actionDuration, byte speed){
        switch(o){
            case Directional:

                break;
            case FrontFacing:

                break;
        }
    }

    public static void triangleCommands(ORIENTATION o, int actionDuration, byte speed){
        switch(o){
            case Directional:

                break;
            case FrontFacing:

                break;
        }
    }

    public static void circleCommands(ORIENTATION o, int actionDuration, byte speed){
        switch(o){
            case Directional:

                break;
            case FrontFacing:

                break;
        }
    }
}

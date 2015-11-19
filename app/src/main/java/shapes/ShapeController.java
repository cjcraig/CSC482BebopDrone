package shapes;

import com.parrot.arsdk.arcontroller.ARDeviceController;

/**
 * Created by Clayton on 10/15/2015.
 */
public class ShapeController {
    //I totally LOVE Android Studio!
    public enum ORIENTATION{Directional, FrontFacing}
    //Directional means it orients based on the direction it is going. Front facing always faces one direction

    private ShapeController(){}//not to be instantiated

    public static void squareCommands(ARDeviceController deviceController, ORIENTATION o, int actionDuration, byte speed){
        switch(o){
            case Directional:
                if (deviceController != null) {

                    //First Side (Origin from current position)
                    deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 50);
                    deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 1);
                    try {
                        Thread.sleep(actionDuration);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 0);
                    deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 0);
                    try {
                        Thread.sleep(100);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte) 90);
                    try {
                        Thread.sleep(actionDuration);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte)0);
                    try {
                        Thread.sleep(100);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //Second Side
                    deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 50);
                    deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 1);
                    try {
                        Thread.sleep(1000);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 0);
                    deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 0);
                    try {
                        Thread.sleep(100);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte)90);
                    try {
                        Thread.sleep(actionDuration);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte)0);
                    try {
                        Thread.sleep(100);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //Third Side
                    deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 50);
                    deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 1);
                    try {
                        Thread.sleep(actionDuration);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 0);
                    deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 0);
                    try {
                        Thread.sleep(100);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte) 90);
                    try {
                        Thread.sleep(1000);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte)0);
                    try {
                        Thread.sleep(100);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //Final Side
                    deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 50);
                    deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 1);
                    try {
                        Thread.sleep(actionDuration);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 0);
                    deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 0);
                    try {
                        Thread.sleep(100);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte) 90);
                    try {
                        Thread.sleep(actionDuration);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte)0);
                    try {
                        Thread.sleep(100);//number of miliseconds to fly forward
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case FrontFacing:

                break;
        }
    }

    public static void triangleCommands(ARDeviceController deviceController, ORIENTATION o, int actionDuration, byte speed){
        switch(o){
            case Directional:
                for(int i=0;i<3;i++){

                    //BEGIN FORWARD MVMENT

                    deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 50);
                    deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte)1);

                    try{
                        Thread.sleep(actionDuration);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 0);
                    deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 0);
                    //END FORWARD MVMENT


                    try{
                        Thread.sleep(250);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }


                    //BEGIN ROTATION
                    deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte) 120);
                    try{
                        Thread.sleep(actionDuration);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte)0);
                    //END ROTATION

                    try{
                        Thread.sleep(250);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                }
                break;
            case FrontFacing:

                break;
        }
    }


    static double sideLength = 60;
    static double radius = sideLength/(2*Math.cos(Math.PI/6));
    public static void nGonCommands(ARDeviceController deviceController, ORIENTATION o, int n, int actionDuration, byte speed){
        double angle = 360/(double)n;
        sideLength = 2*radius*Math.cos(Math.toRadians(angle)/2);
        switch(o){
            case Directional:
                for(int i=0;i<n;i++){

                    //BEGIN FORWARD MVMENT

                    deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) sideLength);
                    deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte)1);

                    try{
                        Thread.sleep(actionDuration);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 0);
                    deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 0);
                    //END FORWARD MVMENT


                    try{
                        Thread.sleep(250);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }


                    //BEGIN ROTATION
                    deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte) angle);
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte)0);
                    //END ROTATION

                    try{
                        Thread.sleep(250);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                }
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

package shapes;

/**
 * Created by Clayton on 10/15/2015.
 */
public class ShapeController {
    //I totally LOVE Android Studio!

/*
    Square - Path View
    Drone needs to travel forward for two seconds, and then pause
    Drone needs to rotate 90 degrees over 1 second, and then pause
    Drone needs to travel forward for two seconds, and then pause
    Drone needs to rotate 90 degrees over 1 second, and then pause
    Drone needs to travel forward for two seconds, and then pause
    Drone needs to rotate 90 degrees over 1 second, and then pause
    Drone needs to travel forward for two seconds, and then pause
    Drone needs to rotate 90 degrees over 1 second, and then pause
    Drone needs to end task
    */
public class SquarePathView(ARDeviceController deviceController){
        //first forward movement
        deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 50);
        deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 1);
        Thread.sleep(2000);
        deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 0);
        deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 0);
        Thread.sleep(100);
        //first rotation
        deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte) 90);
        Thread.sleep(1000);
        deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte) 0);
        Thread.sleep(100);


        //Second forward movement
        deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 50);
        deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 1);
        Thread.sleep(2000);
        deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 0);
        deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 0);
        Thread.sleep(100);
        //Second rotation
        deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte) 90);
        Thread.sleep(1000);
        deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte) 0);
        Thread.sleep(100);


        //Third forward movement
        deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 50);
        deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 1);
        Thread.sleep(2000);
        deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 0);
        deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 0);
        Thread.sleep(100);
        //Third rotation
        deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte) 90);
        Thread.sleep(1000);
        deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte) 0);
        Thread.sleep(100);

        
        //fourth and final forward movement
        deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 50);
        deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 1);
        Thread.sleep(2000);
        deviceController.getFeatureARDrone3().setPilotingPCMDPitch((byte) 0);
        deviceController.getFeatureARDrone3().setPilotingPCMDFlag((byte) 0);
        Thread.sleep(100);
        //fourth and final rotation
        deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte) 90);
        Thread.sleep(1000);
        deviceController.getFeatureARDrone3().setPilotingPCMDYaw((byte) 0);
        Thread.sleep(100);


    }




}




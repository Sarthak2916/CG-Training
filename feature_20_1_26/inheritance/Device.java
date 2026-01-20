package feature_19_1_26.inheritance;

public class Device {

    int deviceId;
    String status;

    Device(){} //why there is a need for parameterless constructor for parent class
    Device(int deviceId, String status){
        this.deviceId=deviceId;
        this.status=status;
    }
}

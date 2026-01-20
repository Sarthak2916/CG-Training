package feature_19_1_26.inheritance;

public class Thermostat extends Device{

    String temperatureSetting;

    Thermostat(String temperatureSetting){
        this.temperatureSetting=temperatureSetting;
    }
    void displayStatus(int id, String status){
        Device device= new Device(id,status);
        System.out.println("Device ID: "+device.deviceId);
        System.out.println("Device Status: "+device.status);
        System.out.println("Temperature Settings: "+temperatureSetting);
    }
}

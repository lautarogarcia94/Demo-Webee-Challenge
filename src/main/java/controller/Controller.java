package controller;

public class Controller {



    public String insertDevice(String date, String macAddress) {
        System.out.println("Registering a device with date: "+date+" and MAC address: "+macAddress);

    }

    public String getListDevice() {
        System.out.println("\n"+"The list of saved devices is:");
    }

    public String getDeviceByMac(String macAddress) {
        System.out.println("Looking for a device with MAC address: "+ macAddress);
    }

    public String getDeviceById(String id) {
        System.out.println("Looking for a device with ID: "+ id);
    }

    public String deleteDeviceById(String id) {
        System.out.println("Deleting a device with ID: "+ id);
    }
}

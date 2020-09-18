package HTTPrequest;

public class RequestDevice {


    public int postDevice(String date, String macAddress) {
        return 1;

    }

    public String getAllDevices() {
        return "The list of saved devices is:";
    }

    public String getDeviceByMac(String macAddress) {
        return "Looking for a device with MAC address: "+ macAddress;
    }

    public String getDeviceById(String id) {
        return "Looking for a device with ID: "+ id;
    }

    public int deleteDeviceById(String id) {
        return 1;
    }


}

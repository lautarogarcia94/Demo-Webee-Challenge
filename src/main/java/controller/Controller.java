package controller;

import HTTPrequest.RequestDevice;

public class Controller {


    private RequestDevice requestDevice;

    public Controller() {
        requestDevice = new RequestDevice();
    }

    public String insertDevice(String date, String macAddress) {
        int requestResponse = requestDevice.postDevice(date, macAddress);
        if (requestResponse == 201)
            return "Device inserted correctly";
        else
            return "An error happened while inserting the device";
    }

    public String getListDevice() {
        return requestDevice.getAllDevices();
    }

    public String getDeviceByMac(String macAddress) {
        return requestDevice.getDeviceByMac(macAddress);
    }

    public String getDeviceById(String id) {
        return requestDevice.getDeviceById(id);
    }

    public String deleteDeviceById(String id) {
        int requestResponse = requestDevice.deleteDeviceById(id);
        if (requestResponse == 200)
            return "Device deleted correctly";
        else
            return "An error happened while deleting the device";
    }
}

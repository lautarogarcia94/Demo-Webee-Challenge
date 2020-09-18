package HTTPrequest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class RequestDevice {

    public int postDevice(String date, String macAdress) {
        HttpResponse<String> response;
        try {
            Unirest.setTimeouts(0, 0);
            response = Unirest.post("http://localhost:8080/devices")
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .body("{\r\n    \"date\": \"" + date + "\",\r\n    \"macAdress\": \"" + macAdress + "\"\r\n}")
                    .asString();
        } catch (Exception e) {
            return -1;
        }
        return response.getStatus();
    }

    public String getAllDevices() {
        HttpResponse<String> response;
        try {
            Unirest.setTimeouts(0, 0);
            response = Unirest.get("http://localhost:8080/devices")
                    .asString();
        } catch (Exception e) {
            return e.getMessage();
        }
        return response.getBody();
    }

    public String getDeviceByMac(String macAdress) {
        HttpResponse<String> response;
        try {
            Unirest.setTimeouts(0, 0);
            response = Unirest.get("http://localhost:8080/devices/"+macAdress)
                    .asString();
        } catch (Exception e) {
            return e.getMessage();
        }
        return response.getBody();
    }

    public String getDeviceById(String id) {
        HttpResponse<String> response;
        try {
            Unirest.setTimeouts(0, 0);
            response = Unirest.get("http://localhost:8080/devices/"+id)
                    .asString();
        } catch (Exception e) {
            return e.getMessage();
        }
        return response.getBody();
    }

    public int deleteDeviceById(String id) {
        HttpResponse<String> response;
        try {
            Unirest.setTimeouts(0, 0);
            response = Unirest.delete("http://localhost:8080/devices/"+id)
                    .asString();
        } catch (Exception e) {
            return -1;
        }
        return response.getStatus();
    }


}
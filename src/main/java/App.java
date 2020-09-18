import controller.Controller;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        Controller controller = new Controller();
        Boolean repetir = true;
        String macAddress;
        String choice;
        String id;

        do {
            System.out.println("What do you want to do? (enter a letter A, B ... E)");
            System.out.println("A. Register a device entity");
            System.out.println("B. Ask for a list of saved devices");
            System.out.println("C. Ask for a device using MAC Address");
            System.out.println("D. Ask for a device using ID");
            System.out.println("E. Delete a device entity");
            System.out.println("F. EXIT PROGRAM");
            choice = myObj.nextLine().toUpperCase();

            switch (choice.toUpperCase()) {
                case "A":
                    System.out.println("\n" + "For register a new device entity, please enter the device date: (Date Format: DDMMYYYY)a");
                    String date = myObj.nextLine().toUpperCase();
                    System.out.println("Enter a MAC address: (MAC address Format: FF:FF:FF:FF:FF:FF)");
                    macAddress = myObj.nextLine().toUpperCase();
                    System.out.println(controller.insertDevice(date, macAddress) + "\n");
                    break;
                case "B":
                    System.out.println("\n" + "The list of saved devices is:");
                    System.out.println(controller.getListDevice() + "\n");
                    break;
                case "C":
                    System.out.println("\n" + "Please enter a MAC address to look for a device:");
                    macAddress = myObj.nextLine().toUpperCase();
                    System.out.println(controller.getDeviceByMac(macAddress) + "\n");
                    break;
                case "D":
                    System.out.println("\n" + "Please enter an ID to look for a device:");
                    id = myObj.nextLine().toUpperCase();
                    System.out.println(controller.getDeviceById(id) + "\n");
                    break;
                case "E":
                    System.out.println("\n" + "Please enter an ID to delete a device:");
                    id = myObj.nextLine().toUpperCase();
                    System.out.println(controller.deleteDeviceById(id) + "\n");
                    break;
                case "F":
                    System.out.println("Shooting down program...");
                    repetir = false;
                    break;
                default:
                    System.out.println("Please enter a valid letter.");
                    break;

            }
        } while (repetir);

    }
}


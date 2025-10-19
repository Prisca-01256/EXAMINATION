/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.questiononepartc;

/**
 *
 * @author VU-STUDENT
 */
import java.util.Scanner;
public class QuestionOnePartC {

    // Define the GymArea class
    static class GymArea {
        private int occupants;
        private boolean[] lights;

        // Constructor to initialize the gym area
        public GymArea() {
            occupants = 0;
            lights = new boolean[3];  // Three lights, all initially OFF
        }

        // Method to add occupants
        public void addOccupants(int n) {
            if (n >= 0) {
                occupants += n;
            }
        }

        // Method to remove occupants
        public void removeOccupants(int n) {
            if (n >= 0 && occupants - n >= 0) {
                occupants -= n;
            } else {
                System.out.println("Error: Cannot have negative occupants.");
            }
        }

        // Method to switch on a light
        public void switchOnLight(int lightNumber) {
            if (lightNumber >= 1 && lightNumber <= 3) {
                lights[lightNumber - 1] = true;
            } else {
                System.out.println("Invalid light number. Please select 1, 2, or 3.");
            }
        }

        // Method to switch off a light
        public void switchOffLight(int lightNumber) {
            if (lightNumber >= 1 && lightNumber <= 3) {
                lights[lightNumber - 1] = false;
            } else {
                System.out.println("Invalid light number. Please select 1, 2, or 3.");
            }
        }

        // Method to report the status of the gym area
        public void reportStatus() {
            System.out.println("Gym Area Status:");
            System.out.println("Occupants: " + occupants);
            System.out.println("Lights: " + (lights[0] ? "On" : "Off") + ", " +
                               (lights[1] ? "On" : "Off") + ", " +
                               (lights[2] ? "On" : "Off"));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GymArea gym = new GymArea();

        boolean running = true;
        while (running) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add Occupants");
            System.out.println("2. Remove Occupants");
            System.out.println("3. Switch On Light (1-3)");
            System.out.println("4. Switch Off Light (1-3)");
            System.out.println("5. Report Status");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Occupants
                    System.out.print("Enter number of occupants to add: ");
                    int addCount = scanner.nextInt();
                    gym.addOccupants(addCount);
                    break;
                case 2:
                    // Remove Occupants
                    System.out.print("Enter number of occupants to remove: ");
                    int removeCount = scanner.nextInt();
                    gym.removeOccupants(removeCount);
                    break;
                case 3:
                    // Switch On Light
                    System.out.print("Enter light number to switch ON (1-3): ");
                    int lightOn = scanner.nextInt();
                    gym.switchOnLight(lightOn);
                    break;
                case 4:
                    // Switch Off Light
                    System.out.print("Enter light number to switch OFF (1-3): ");
                    int lightOff = scanner.nextInt();
                    gym.switchOffLight(lightOff);
                    break;
                case 5:
                    // Report Status
                    gym.reportStatus();
                    break;
                case 6:
                    // Quit
                    running = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }

        scanner.close();
    }
}

    


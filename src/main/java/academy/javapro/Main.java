package academy.javapro;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a new Tesla Model S, 2024
        // TODO: Add your code here
        Tesla myTesla = new Tesla("Model S",2024);


        // Step 2: Display initial status
        System.out.println("Initial Status:");
        // TODO: Display car's initial state

        System.out.println(myTesla.getMake() + " " + myTesla.getModel() + " " + myTesla.getYear());
        System.out.println("Running: " + myTesla.isRunning());
        System.out.println("Autopilot: " + myTesla.isAutopilotEnabled());
        System.out.println("Charging: " + myTesla.isCharging());

        // Step 3: Start the car and test basic vehicle functions
        System.out.println("\nTesting basic vehicle functions:");
        // TODO: Start engine
        myTesla.startEngine();
        // TODO: Accelerate
        myTesla.accelerate();
        // TODO: Brake
        myTesla.brake();

        // Step 4: Test autonomous features
        System.out.println("\nTesting autonomous features:");
        // TODO: Enable autopilot
        myTesla.enableAutopilot();
        // TODO: Check if autopilot is enabled
        System.out.println("Autopilot is currently: " + myTesla.isAutopilotEnabled());
        // TODO: Disable autopilot
        myTesla.disableAutopilot();


        // Step 5: Test electric features
        System.out.println("\nTesting electric features:");
        // TODO: Start charging
        myTesla.charge();
        // TODO: Check charging status
        System.out.println("Charging status: " + myTesla.isCharging());

        // Step 6: Stop the car and display final status
        System.out.println("\nFinal car status:");
        // TODO: Stop engine
        myTesla.stopEngine();
        // TODO: Display final state
        System.out.println("Running: " + myTesla.isRunning());
        System.out.println("Autopilot: " + myTesla.isAutopilotEnabled());
        System.out.println("Charging: " + myTesla.isCharging());
    }
}

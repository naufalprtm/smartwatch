class SmartWatch {
    String modelName;
    String brand;
    boolean touchScreen;
    double price;
    String[] features;
    String operatingSystem;
    int batteryLife;  // in hours
    String[] connectivityOptions;

    public void displayInfo() {
        String reset = "\u001B[0m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[34m";
        String cyan = "\u001B[36m";


        System.out.println(green + "SmartWatch Model: " + modelName + reset);
        System.out.println(cyan + "Brand: " + brand + reset);
        System.out.println(blue + "Operating System: " + operatingSystem + reset);
        System.out.println(blue + "Touch Screen: " + (touchScreen ? "Yes" : "No") + reset);
        System.out.println(green + "Price: $" + price + reset);
        System.out.println(yellow + "Features:" + reset);
        for (String feature : features) {
            System.out.println(blue + "- " + feature + reset);
        }
        System.out.println(green + "Battery Life: " + batteryLife + " hours" + reset);
        System.out.println(green + "Connectivity Options:" + reset);
        for (String option : connectivityOptions) {
            System.out.println(blue + "- " + option + reset);
        }
    }

    public void displayNotifications() {
        System.out.println("Displaying notifications on the SmartWatch.");
    }

    public void makeCall(String contact) {
        System.out.println("Making a call to " + contact + " from the SmartWatch.");
    }
}

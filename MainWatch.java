public class MainWatch {
    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch();

        // Set properties
        smartWatch.modelName = "Galaxy Watch 4";
        smartWatch.brand = "Samsung";
        smartWatch.operatingSystem = "Tizen";
        smartWatch.touchScreen = true;
        smartWatch.price = 299.99;
        smartWatch.features = new String[]{"Heart Rate Monitor", "Fitness Tracker", "Notifications", "Sleep Tracking"};
        smartWatch.batteryLife = 36;  // 36 hours of battery life
        smartWatch.connectivityOptions = new String[]{"Bluetooth", "Wi-Fi", "NFC"};

        // Display information
        smartWatch.displayInfo();

        // Display notifications and make a call
        smartWatch.displayNotifications();
        smartWatch.makeCall("Damara Kartika Sari");
    }
}

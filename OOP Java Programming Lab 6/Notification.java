class NotificationSystem {

    static void sendNotification(String message) {
        System.out.println("Broadcast Alert: " + message);
    }

    static void sendNotification(String message, String email) {
        System.out.println("Email sent to " + email + " -> " + message);
    }

    static void sendNotification(String message, long phoneNumber) {
        System.out.println("SMS sent to +" + phoneNumber + " -> " + message);
    }

    public static void main(String[] args) {
        sendNotification("Server restart in 5 mins.");
        sendNotification("Your OTP is 4432", "user@test.com");
        sendNotification("Package delivered!", 15550199L);
    }
}
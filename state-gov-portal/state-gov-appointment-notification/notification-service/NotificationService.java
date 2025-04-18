@Service
public class NotificationService {
    public void notifyCitizen(String message) {
        System.out.println("[NotificationService] Notification sent: " + message);
        // Add Azure Email/SMS integration here
    }
}
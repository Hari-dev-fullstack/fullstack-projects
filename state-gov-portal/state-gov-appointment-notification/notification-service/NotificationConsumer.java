@Component
public class NotificationConsumer {
    @Autowired private NotificationService notificationService;
    @KafkaListener(topics = {"case-events", "appointment-events"}, groupId = "notification-group")
    public void consume(String message) {
        System.out.println("[NotificationConsumer] Received event: " + message);
        notificationService.notifyCitizen(message);
    }
}
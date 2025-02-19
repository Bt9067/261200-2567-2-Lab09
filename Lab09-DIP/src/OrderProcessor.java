public class OrderProcessor {
    private final NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(Order order) {
        System.out.println("Processing Order: " + order.getOrderId());

        notificationService.notify("Order " + order.getOrderId() + " processed.");
    }
}
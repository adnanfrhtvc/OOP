package org.example.Week8.Task1;


public class MessagingSystem {
    @CanSendMessage
    public void sendMessage(Class<?> sender, String message) {
        int rp;
        if (sender.isAnnotationPresent(RequiresPermission.class)) {
            rp = sender.getAnnotation(RequiresPermission.class).value();
            if (rp == 1) {
                System.out.println("Restricted user.");
            } else if (rp == 2) {
                System.out.println("Sender is: " + sender.getName() + ", and message is: " + message);
            } else {
                System.out.println("Error");
            }
        }
    }
    public static void main(String[] args) {
        User user = new User("Adnan");
        Admin admin = new Admin("Nihad");

        MessagingSystem messagingSystem = new MessagingSystem();


        messagingSystem.sendMessage(user.getClass(), "Hello, Admin!");
        messagingSystem.sendMessage(admin.getClass(), "Important announcement!");

    }
}

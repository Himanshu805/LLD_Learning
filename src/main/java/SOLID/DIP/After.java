package SOLID.DIP;

// Dependency Inversion Principle (DIP)

// It states two things:
// ✅ High-level modules should not depend on low-level modules. Both should depend on abstractions.
// ✅ Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.


// Dependency Injection says that the dependencies of a class should be provided from outside the class
// Don't create dependencies inside the class. Ask for them via constructor, setter or interface.

// Dependency Injection (DIP) Example
// Types of dependency injection:
// 1. Constructor Injection
// 2. Setter Injection
// 3. Interface Injection

public class After {

    public interface MessageService {
        void sendMessage(String message, String recipient);
    }

    public static class EmailService implements MessageService {
        @Override
        public void sendMessage(String message, String recipient) {
            // Logic to send email
            System.out.println("Email sent to " + recipient + " with message: " + message);
        }
    }

    public static class SMSService implements MessageService {
        @Override
        public void sendMessage(String message, String recipient) {
            // Logic to send SMS
            System.out.println("SMS sent to " + recipient + " with message: " + message);
        }
    }

    public static class PushNotificationService implements MessageService {
        @Override
        public void sendMessage(String message, String recipient) {
            // Logic to send push notification
            System.out.println("Push notification sent to " + recipient + " with message: " + message);
        }
    }

    public static class NotificationManager {   //implements MessageInjected {
        private MessageService messageService;

        // Constructor Injection . Rating :  ⭐⭐⭐⭐⭐
        public NotificationManager(MessageService messageService) {
            this.messageService = messageService;
        }
//
//        // Setter Injection. Rating : ⭐⭐⭐
//        public void setMessageService(MessageService service) {
//            this.messageService = service;
//        }

//         Interface Injection.  Rating : ⭐
//        @Override
//        public void injectedMessage(MessageService messageService) {
//                this.messageService = messageService;
//        }



        public void notifyUser(String message, String recipient) {
            messageService.sendMessage(message, recipient);
        }


    }

    // Interface Injection
    public interface MessageInjected{
            void injectedMessage(MessageService messageService);
    }

    public static void main(String[] args) {
        MessageService service = new EmailService(); // Can switch to SMSService
        NotificationManager notifier = new NotificationManager(service);

        notifier.notifyUser("Hello, User!", "Chirag");

        MessageService service2 = new SMSService();
        NotificationManager notifier2 = new NotificationManager(service2);
        notifier2.notifyUser("Hello, User!", "Chirag");

        MessageService service3 = new PushNotificationService();
        NotificationManager notifier3 = new NotificationManager(service3);
        notifier3.notifyUser("Hello, User!", "Chirag");
    }



}

/*1. Constructor Injection (Recommended).   Rating :  ⭐⭐⭐⭐⭐
This is the most common and "safest" type. The dependency is provided at the moment the object is created.

Pros: The object is always in a "ready-to-use" state; the dependency can be made final (immutable).
Cons: Constructors can become cluttered if there are many dependencies.*/


/*
2. Setter Injection.  Rating : ⭐⭐⭐
The dependency is provided through a public "setter" method after the object is instantiated.

Pros: You can change the dependency at runtime (e.g., switching from SQL to Cloud storage while the app is running).
Cons: The object might be in an "incomplete" state if someone forgets to call the setter before calling save().
*/


/*
3. Interface Injection. Rating : ⭐
This is less common in standard Java but used in specific architectural patterns. The class implements an interface that dictates how dependencies should be injected.

Pros: Forces a standard way of injecting dependencies across many different classes.
Cons: Adds extra boilerplate code and complexity.
*/



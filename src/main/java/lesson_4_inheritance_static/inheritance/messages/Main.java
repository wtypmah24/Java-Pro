package lesson_4_inheritance_static.inheritance.messages;

import lesson_4_inheritance_static.inheritance.messages.classes.EmailMessage;
import lesson_4_inheritance_static.inheritance.messages.classes.Message;
import lesson_4_inheritance_static.inheritance.messages.classes.MessengerMessage;
import lesson_4_inheritance_static.inheritance.messages.classes.Status;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Hello", "1", "2");
        MessengerMessage messengerMessage = new MessengerMessage(
                "Hello",
                "+14546456",
                "+2546575",
                Status.NOT_SENT,
                LocalDate.now()
        );
        EmailMessage emailMessage = new EmailMessage(
                "Hello",
                "bb@gmail",
                "uifve@mail",
                Status.NOT_SENT,
                LocalDate.now(),
                "Meeting",
                "",
                null
        );
    }
}

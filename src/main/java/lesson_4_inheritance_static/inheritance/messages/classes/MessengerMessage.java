package lesson_4_inheritance_static.inheritance.messages.classes;

import java.time.LocalDate;

public class MessengerMessage extends Message {
    private Status status;
    private LocalDate date;

    public MessengerMessage(String text, String recipient, String sender, Status status, LocalDate date) {
        super(text, recipient, sender);
        this.status = status;
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDate getDate() {
        return date;
    }
}

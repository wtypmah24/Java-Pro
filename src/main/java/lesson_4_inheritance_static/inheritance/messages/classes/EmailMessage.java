package lesson_4_inheritance_static.inheritance.messages.classes;

import java.time.LocalDate;

public class EmailMessage extends MessengerMessage {

    //    Создайте класс «Сообщение» с полями «текст», «получатель», «отправитель». Создайте несколько наследников:
    //    сообщение мессенджера – содержит дополнительно поле «статус» (отправлено, доставлено) и дату отправки;
    //    сообщение email - содержит дополнительно поля «статус», «дата отправки», «тема», «копия» и «скрытая копия»;
    private final String subject;
    private final String copy;
    private final String hiddenCopy;

    public EmailMessage(String text, String recipient, String sender, Status status, LocalDate date, String subject, String copy, String hiddenCopy) {
        super(text, recipient, sender, status, date);
        this.subject = subject;
        this.copy = copy;
        this.hiddenCopy = hiddenCopy;
    }

    public String getSubject() {
        return subject;
    }

    public String getCopy() {
        return copy;
    }

    public String getHiddenCopy() {
        return hiddenCopy;
    }
}

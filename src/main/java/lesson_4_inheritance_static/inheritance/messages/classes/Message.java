package lesson_4_inheritance_static.inheritance.messages.classes;

public class Message {
    //    Создайте класс «Сообщение» с полями «текст», «получатель», «отправитель». Создайте несколько наследников:
//    сообщение мессенджера – содержит дополнительно поле «статус» (отправлено, доставлено) и дату отправки;
//    сообщение email - содержит дополнительно поля «статус», «дата отправки», «тема», «копия» и «скрытая копия»;
    private String text;
    private String recipient;
    private String sender;

    public String getText() {
        return text;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }

    public Message(String text, String recipient, String sender) {
        this.text = text;
        this.recipient = recipient;
        this.sender = sender;
    }
}


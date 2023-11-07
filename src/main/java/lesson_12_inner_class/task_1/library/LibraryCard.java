package lesson_12_inner_class.task_1.library;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LibraryCard {
    /*
     * 1 Создайте класс библиотечной карточки.
     * В карточке хранятся данные читателя (фамилия, имя, отчество,
     * дата рождения, номер читательского билета, телефон), данные взятых книг
     * (дата, когда книга была взята, название книги, автор, номер экземпляра,
     * ФИО выдавшего книгу сотрудника, отметка о возврате и дата возврата).
     * Используйте вложенные классы Полное имя, Телефон (код страны, номер, добавочный, тип номера).*/

    private FullName reader;
    private LocalDate birthday;
    private Map<Book, IssueRecord> bookToRecord;
    private PhoneNumber phoneNumber;


    public LibraryCard(FullName reader, LocalDate birthday, PhoneNumber phoneNumber) {
        this.reader = reader;
        this.birthday = birthday;
        this.bookToRecord = new HashMap<>();
        this.phoneNumber = phoneNumber;
    }

    public Map<Book, IssueRecord> getBookToRecord() {
        return new HashMap<>(bookToRecord);
    }

    public FullName getReader() {
        return reader;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void addBook (Book book, LocalDate issueDate, FullName employee){
        IssueRecord record = new IssueRecord(issueDate, employee);
        bookToRecord.put(book, record);
    }
    public void returnBook(Book book){
        IssueRecord record = bookToRecord.get(book);
        record.setReturnDate(LocalDate.now());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryCard that = (LibraryCard) o;

        if (!reader.equals(that.reader)) return false;
        if (!birthday.equals(that.birthday)) return false;
        return bookToRecord.equals(that.bookToRecord);
    }

    @Override
    public int hashCode() {
        int result = reader.hashCode();
        result = 31 * result + birthday.hashCode();
        result = 31 * result + bookToRecord.hashCode();
        return result;
    }

    public static final class IssueRecord {
        private final LocalDate issueDate;
        private LocalDate returnDate;
        private final FullName employee;

        public IssueRecord(LocalDate issueDate, FullName employee) {
            this.issueDate = issueDate;
            this.employee = employee;
        }

        public LocalDate getReturnDate() {
            return returnDate;
        }

        public void setReturnDate(LocalDate returnDate) {
            this.returnDate = returnDate;
        }

        public LocalDate issueDate() {
            return issueDate;
        }

        public FullName employee() {
            return employee;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (IssueRecord) obj;
            return Objects.equals(this.issueDate, that.issueDate) &&
                    Objects.equals(this.employee, that.employee);
        }

        @Override
        public int hashCode() {
            return Objects.hash(issueDate, employee);
        }

        @Override
        public String toString() {
            return "IssueRecord[" +
                    "issueDate=" + issueDate + ", " +
                    "employee=" + employee + ']';
        }

        }

    public record FullName(String firstName, String middleName, String lastName) {

        @Override
            public String toString() {
                return String.join(" ", firstName, middleName, lastName).trim().replace("  ", " ");
            }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FullName fullName = (FullName) o;

            if (!firstName.equals(fullName.firstName)) return false;
            if (!middleName.equals(fullName.middleName)) return false;
            return lastName.equals(fullName.lastName);
        }

        @Override
        public int hashCode() {
            int result = firstName.hashCode();
            result = 31 * result + middleName.hashCode();
            result = 31 * result + lastName.hashCode();
            return result;
        }
    }

    public static class PhoneNumber {
        private final String type;
        private final int countryCode;
        private final long number;
        private final Long additionalNumber;

        public PhoneNumber(String type, int countryCode, Long number, long additionalNumber) {
            this.type = type;
            this.countryCode = countryCode;
            this.number = number;
            this.additionalNumber = additionalNumber;
        }

        public String getType() {
            return type;
        }

        public int getCountryCode() {
            return countryCode;
        }

        public long getNumber() {
            return number;
        }

        public Long getAdditionalNumber() {
            return additionalNumber;
        }

        @Override
        public String toString() {
            return type + " +" + countryCode + number + (additionalNumber == null ? "" : "ext" + additionalNumber);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PhoneNumber that = (PhoneNumber) o;

            if (countryCode != that.countryCode) return false;
            if (number != that.number) return false;
            if (!Objects.equals(type, that.type)) return false;
            return additionalNumber.equals(that.additionalNumber);
        }

        @Override
        public int hashCode() {
            int result = type != null ? type.hashCode() : 0;
            result = 31 * result + countryCode;
            result = 31 * result + (int) (number ^ (number >>> 32));
            result = 31 * result + additionalNumber.hashCode();
            return result;
        }
    }
}

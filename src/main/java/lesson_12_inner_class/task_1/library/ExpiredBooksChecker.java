package lesson_12_inner_class.task_1.library;

import java.time.LocalDate;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ExpiredBooksChecker {
    /*
    * 2 В отдельном классе создайте метод, который получает на
     * вход набор библиотечных карточек и выбирает книги, которые не
     * вернули в течение 14 дней после взятия. Используйте локальный класс
     * для просроченных книг. Сформируйте строку по списоку просроченных книг
     * с указанием названия, автора, ФИО и телефона читателя. По данному списку
     * библиотекарь обзвонит читателей и напомнит им, что пора вернуть книгу.
     * При желании можно в локальном классе сгенерировать toString() метод*/

    private ExpiredBooksChecker() {}
    /**
     * Method is for finding expired books
     * @param cards library cards
     * @return String with expired books
     * */
    public static String getExpired (Set<LibraryCard> cards){
        StringBuilder sb = new StringBuilder();
        for (LibraryCard card : cards){
            sb.append(getExpiredCard(card)).append(System.lineSeparator());
        }
        return sb.toString();
    }
    private static String getExpiredCard(LibraryCard card){
        class ExpiredBook{
            final String name;
            final String author;
            final String reader;
            final String phone;

            public ExpiredBook(String name, String author, String reader, String phone) {
                this.name = name;
                this.author = author;
                this.reader = reader;
                this.phone = phone;
            }

            @Override
            public String toString() {
                return String.join(",", reader, phone, name, author);

            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                ExpiredBook that = (ExpiredBook) o;

                if (!Objects.equals(name, that.name)) return false;
                if (!Objects.equals(author, that.author)) return false;
                if (!Objects.equals(reader, that.reader)) return false;
                return Objects.equals(phone, that.phone);
            }

            @Override
            public int hashCode() {
                int result = name != null ? name.hashCode() : 0;
                result = 31 * result + (author != null ? author.hashCode() : 0);
                result = 31 * result + (reader != null ? reader.hashCode() : 0);
                result = 31 * result + (phone != null ? phone.hashCode() : 0);
                return result;
            }
        }
        Set<ExpiredBook> expiredBooks = new HashSet<>();
        for (AbstractMap.Entry<Book, LibraryCard.IssueRecord> pair: card.getBookToRecord().entrySet()){
            if(pair.getValue().issueDate().isAfter(LocalDate.now().minusDays(14))) continue;
            ExpiredBook book = new ExpiredBook(
                    pair.getKey().name(),
                    pair.getKey().author(),
                    card.getReader().toString(),
                    card.getPhoneNumber().toString()
            );
            expiredBooks.add(book);
        }
        return expiredBooks.toString();
    }
}

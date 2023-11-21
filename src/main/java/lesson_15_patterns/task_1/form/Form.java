package lesson_15_patterns.task_1.form;

import lesson_15_patterns.task_1.gender.Gender;
import lombok.ToString;

import java.time.LocalDate;
@ToString
public class Form {
    /* 1 Создайте класс Форма регистрации с 10 полями. Пользователь заполняет в форме только те поля, которые хочет.
    2 Реализуйте паттерн Строитель с помощью внутреннего класса, позволяющий создавать объект формы.
    https://refactoring.guru/ru/design-patterns/builder*/
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String email;
    private Long phone;
    private Boolean isVIP;

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Form{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", isVIP=" + isVIP +
                '}';
    }

    private Form(String firstName,
                 String lastName,
                 String login,
                 String password,
                 LocalDate dateOfBirth,
                 Gender gender,
                 String email,
                 Long phone,
                 Boolean isVIP) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.isVIP = isVIP;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String login;
        private String password;
        private LocalDate dateOfBirth;
        private Gender gender = Gender.UNKNOWN;
        private String email;
        private Long phone;
        private Boolean isVIP = false;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder login(String login){
            this.login = login;
            return this;
        }
        public Builder password(String password){
            this.password = password;
            return this;
        }
        public Builder dateOfBirth (LocalDate dateOfBirth){
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public Builder gender (Gender gender){
            this.gender = gender == null ? Gender.UNKNOWN : gender;
            return this;
        }
        public Builder email (String email){
            this.email = email;
            return this;
        }
        public Builder phone(Long phone){
            this.phone = phone;
            return this;
        }
        public Builder isVIP (Boolean isVIP){
            this.isVIP = isVIP != null && isVIP;
            return this;
        }

        public Form build(){
            return new Form(firstName, lastName, login, password, dateOfBirth, gender, email, phone, isVIP);
        }
    }


}

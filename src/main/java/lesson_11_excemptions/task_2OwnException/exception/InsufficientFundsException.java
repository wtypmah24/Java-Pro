package lesson_11_excemptions.task_2OwnException.exception;

public class InsufficientFundsException extends Exception{
    /*
    * 2 Создайте пакет exception. В пакете создайте два класса исключений:
    checked-исключение InsufficientFundsException (потомок Exception или его потомка).
    unchecked-исключение IncorrectAccountOperationException (потомок RuntimeException или его потомка).
    3 Метод снятия бросает InsufficientFundsException, когда снимаемая сумма больше остатка по счёту.
    Метод пополнения бросает IncorrectAccountOperationException, когда переданная сумма меньше или равна 0.
    * */

    public InsufficientFundsException(String message) {
        super(message);
    }
}

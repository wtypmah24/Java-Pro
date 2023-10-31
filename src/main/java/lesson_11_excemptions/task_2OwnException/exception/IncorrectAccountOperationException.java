package lesson_11_excemptions.task_2OwnException.exception;

public class IncorrectAccountOperationException extends RuntimeException{
    public IncorrectAccountOperationException(String message) {
        super(message);
    }
}

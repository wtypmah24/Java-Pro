package lesson_11_excemptions.task_2OwnException;

import lesson_11_excemptions.task_2OwnException.bankAcc.BankAccount;
import lesson_11_excemptions.task_2OwnException.exception.IncorrectAccountOperationException;
import lesson_11_excemptions.task_2OwnException.exception.InsufficientFundsException;

public class Main {
    /*
    Создайте проект.
    1 Создайте класс BankAccount для банковской программы, который хранит данные о
    балансе счёта и методы для снятия и пополнения счёта.
    2 Создайте пакет exception. В пакете создайте два класса исключений:
    checked-исключение InsufficientFundsException (потомок Exception или его потомка).
    unchecked-исключение IncorrectAccountOperationException (потомок RuntimeException или его потомка).
    3 Метод снятия бросает InsufficientFundsException, когда снимаемая сумма больше остатка по счёту.
    Метод пополнения бросает IncorrectAccountOperationException, когда переданная сумма меньше или равна 0.


    1 В созданном ранее проекте вызовите методы класса BankAccount.
    Отловите исключения в едином блоке try-catch.
    В блоке catch выведите тип и сообщение пойманного исключения.
    В блоке finally выведите сообщение о закрытии транзакции.
    */

    public static void main(String[] args) {
        BankAccount acc =new BankAccount(1500);

        /*acc.deposit(45);
        Thread.sleep(1000);
        System.out.println(acc.getBalance());
        acc.deposit(-1);
        acc.withdraw(10000);*/

        try{
            System.out.println(acc.deposit(500));
            Thread.sleep(1000);
            System.out.println(acc.withdraw(150));
            System.out.println(acc.withdraw(4000));
            throw new InterruptedException("Interrupted exc");
        }
        catch (InsufficientFundsException e){
            System.out.println("Problem with withdraw " + e.getLocalizedMessage());
        } catch (IncorrectAccountOperationException e){
            System.out.println("Problem with top-up " + e.getLocalizedMessage());
        } catch (InterruptedException ignored){
            //Ignoring Exception.
        } catch (Exception e){
            System.out.println("Unknown Exception");
        }
        finally {
            System.out.println("Block Finally performed.");
        }
    }
}
package lesson_25_thread_locks.task_3_context;

import lesson_25_thread_locks.task_3_context.usercontext.UserContext;

public class Main {
    /*
    * Разработайте приложение, моделирующее работу системы авторизации.
    * Используйте ThreadLocal для хранения информации о текущем пользователе
    * в контексте потока. Реализуйте класс UserContext с методами
    * login(String username) и logout(). При успешном входе пользователя,
    * информация о нем должна быть сохранена в ThreadLocal.
    * При выходе пользователя, соответствующая информация должна быть удалена из ThreadLocal.*/
    public static void main(String[] args) {
        UserContext.logIn("John");


        Thread t = new Thread(() -> {
            UserContext.logIn("Alan");
            System.out.println(UserContext.getContext());
            UserContext.logOut();
        });
        t.start();

        UserContext.logOut();
    }
}

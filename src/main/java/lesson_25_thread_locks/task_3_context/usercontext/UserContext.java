package lesson_25_thread_locks.task_3_context.usercontext;

public class UserContext {
    private static ThreadLocal<String> context = new ThreadLocal<>();

    public static void logIn(String userName) {
        context.set(userName);
        System.out.println(userName + " logged in");
    }

    public static void logOut() {
        String userName = context.get();
        System.out.println(userName + " logged out");
        context.remove();
    }

    public static String getContext() {
        return context.get();
    }
}
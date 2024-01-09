package lesson_26_fork_synchronizer.task_1_fork;

import lesson_26_fork_synchronizer.task_1_fork.sales.SaleTask;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    /*
    * Представьте, что у вас есть сеть магазинов, и вы хотите рассчитать
    * общую выручку за определенный период времени. Каждый магазин предоставляет
    * данные о продажах в виде массива. Вам нужно эффективно подсчитать общую сумму продаж
    * для всех магазинов с использованием параллельных вычислений.
    Шаги:
    Создайте класс, расширяющий RecursiveTask<Long>, представляющий задачу подсчета выручки для определенного магазина.
    В конструкторе класса укажите массив продаж и границы массива для текущего магазина.
    В методе compute() вычислите общую сумму продаж для текущего магазина. Если количество
    * продаж невелико, вычислите сумму напрямую.
    Если количество продаж больше порогового значения, разделите задачу на две подзадачи для параллельного выполнения.
    Дождитесь завершения подзадач и объедините их результаты для получения общей выручки.*/
    public static void main(String[] args) {
        List<int[]> sales = Arrays.stream(new Object[3])
                .map(e -> ThreadLocalRandom.current().ints(10_000)
                        .map(Math::abs).toArray()).toList();

        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();

        int [] arrays = sales.stream().flatMapToInt(Arrays::stream).toArray();

        SaleTask saleTask = new SaleTask(0, arrays.length -1, arrays);

        long result = forkJoinPool.invoke(saleTask);
        System.out.println(Arrays.toString(arrays));
        System.out.println(result);
    }
}

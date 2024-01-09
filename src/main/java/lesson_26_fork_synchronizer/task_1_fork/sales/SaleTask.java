package lesson_26_fork_synchronizer.task_1_fork.sales;

import java.util.concurrent.RecursiveTask;

public class SaleTask extends RecursiveTask<Long> {
    private static final int THRESHOLD = 500;
    private final int start;
    private final int end;
    private final int[] sales;

    public SaleTask(int start, int end, int[] sales) {
        this.start = start;
        this.end = end;
        this.sales = sales;
    }

    @Override
    protected Long compute() {
        if ((end - start) < THRESHOLD) {
            long sum = 0;
            for (int i = start; i <= end; i++) {
                sum += sales[i];
            }
            return sum;
        } else {
            int mid = (start + end) / 2;
            SaleTask leftTask = new SaleTask(start, mid, sales);
            SaleTask rightTask = new SaleTask(mid + 1, end, sales);

            leftTask.fork();
            long rightResult = rightTask.compute();
            long leftResult = leftTask.join();
            return leftResult + rightResult;
        }
    }
}

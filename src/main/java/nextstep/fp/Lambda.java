package nextstep.fp;

import java.util.List;

public class Lambda {
    public static void printAllOld(List<Integer> numbers) {
        System.out.println("printAllOld");

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printAllLambda(List<Integer> numbers) {
        System.out.println("printAllLambda");

        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        }).start();
    }

    public static int sumAllEven(List<Integer> numbers, Conditional condition) {
        return sumAll(numbers, condition);
    }

    public static int sumAllOverThree(List<Integer> numbers, Conditional condition) {
        return sumAll(numbers, condition);
    }

    public static int sumAll(List<Integer> numbers, Conditional condition) {
        int total = 0;
        for (int number : numbers) {
            total = validateSumCondition(number, total, condition);
        }
        return total;
    }

    private static int validateSumCondition(int number, int total, Conditional condition) {
        if(condition.test(number)){
            total += number;
        }
        return total;
    }

}

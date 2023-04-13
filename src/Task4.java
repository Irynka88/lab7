import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        int randomNum1, randomNum2, randomNum3, inputNum1, inputNum2, inputNum3, count;
        count = 0;
        inputNum1 = 0;
        inputNum2 = 0;
        inputNum3 = 0;
        randomNum1 = 0;

        do {
            count++;
            System.out.println("Введіть три цілих числа на проміжку від 1 до 3(у вас залишилось 2 спроби):");
            Scanner scanner = new Scanner(System.in);
            randomNum1 = (int) (Math.random() * 3 + 1);
            randomNum2 = (int) (Math.random() * 3 + 1);
            randomNum3 = (int) (Math.random() * 3 + 1);

            if (scanner.hasNextInt()) {
                inputNum1 = scanner.nextInt();
                inputNum2 = scanner.nextInt();
                inputNum3 = scanner.nextInt();
                if (randomNum1 == inputNum1 && randomNum2 == inputNum2 && randomNum3 == inputNum3) {
                    System.out.println("Ви відгадали всі три числа");
                } else {
                    System.out.println("На жаль вам не вдалося відгадати спробуйте ще раз(залишилась 1 спроба):");
                    randomNum1 = (int) (Math.random() * 3 + 1);
                    randomNum2 = (int) (Math.random() * 3 + 1);
                    randomNum3 = (int) (Math.random() * 3 + 1);
                    if (scanner.hasNextInt()) {
                        inputNum1 = scanner.nextInt();
                        inputNum2 = scanner.nextInt();
                        inputNum3 = scanner.nextInt();
                        if (randomNum1 == inputNum1 && randomNum2 == inputNum2 && randomNum3 == inputNum3) {
                            System.out.println("Ви відгадали всі три числа");
                        } else {
                            System.out.println("На жаль ви використали всі спроби і не відгадали три числа");


                        }
                    }
                    else {
                        System.out.println("Ви ввели не ціле число(");
                    }
                }
            }
            else {
                System.out.println("Ви ввели не ціле число(");
            }
        }
        while (count != 1) ;

    }
}

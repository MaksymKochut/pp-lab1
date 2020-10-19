package core;
import java.util.Scanner;
import parts.Interval;
import parts.Fibonacci;

public class oop_file {
	public static void main(String[] args) {
		Scanner input_reader = new Scanner(System.in);

		int int1;
		int int2;

		// Зчитування інтервалу з аргументів командного рядка, якщо вони дані
		if (args.length == 2) {
			int1 = Integer.parseInt(args[0]);
			int2 = Integer.parseInt(args[1]);
		}

		// Ручне введення інтервалу, якщо немає аргументів ком.рядка
		else {
			System.out.print("Enter first int: ");
			int1 = input_reader.nextInt();
			System.out.print("Enter second int: ");
			int2 = input_reader.nextInt();
		}

		// Перевірка правильності інтервалу
		if (int1 >= int2){
			System.out.println(String.format("Wrong interval (%d >= %d)", int1, int2));
			return;
		}

		Interval interval = new Interval(int1, int2);		// Створення інтервалу
		System.out.println("Your interval: [" + interval.start() + ", " + interval.end() + "]");

		int even_sum = 0;	// Сума парних чисел
		// Вивидення на екран парних чисел та підрахунок їх суми
		System.out.print("\n\tEven numbers: ");
		for (int i = interval.start(); i < interval.end(); i++){
			if (i % 2 == 0){
				System.out.print(i + " ");
				even_sum += i;
			}
		}
		System.out.println("\nSum of even numbers: " + even_sum);

		int odd_sum = 0; // Сума непарних чисел
		// Вивидення на екран непарних чисел та підрахунок їх суми
		System.out.print("\n\tOdd numbers: ");
		for (int i = interval.end(); i > interval.start(); i--){
			if (i % 2 == 1){
				System.out.print(i + " ");
				odd_sum += i;
			}
		}
		System.out.println("\nSum of odd numbers: " + odd_sum);


		// Створення ряду Фібоначчі
		Fibonacci fibonacci_seq = new Fibonacci();
		fibonacci_seq.set_numbers(interval.end() - 1, interval.end());

		System.out.print("\nCreating fibonacci sequence. Enter len: ");
		int fibonacci_len = input_reader.nextInt();				// Кількість чисел в ряді Фібоначчі

		System.out.print(String.format("\nFibonacci sequence:\n%d %d ",
						fibonacci_seq.get_numbers()[0], fibonacci_seq.get_numbers()[1]));

		// Друк чисел з ряду, та підрахунок кількості парних чисел серед них
		int even_fibonacci = 1;
		for (int i = 0; i < fibonacci_len - 2; i++){
			System.out.print(fibonacci_seq.iterate()[1] + " ");
			if (fibonacci_seq.get_numbers()[1] % 2 == 0) even_fibonacci += 1;
		}

		// Друк відсотків парних та непарних чисел серед отриманого інтервалу
		System.out.println("\nPercentage of even numbers in this fibonacci sequence: " +  (((double)even_fibonacci * 100) / fibonacci_len) + "%");
		System.out.println("Percentage of odd numbers in this fibonacci sequence: " + (100 - (((double)even_fibonacci * 100) / fibonacci_len)) + "%");

		input_reader.close();
    }
}

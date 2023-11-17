import java.util.Scanner; 
public class New
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in, "ibm866");
		// Ввод первого, второго и третьего числа
		System.out.print("Введите первое целое число: ");
       		int numOne = in.nextInt(); 
       		System.out.print("Введите второе целое число: ");
        	int numTwo = in.nextInt();
        	System.out.print("Введите третье целое число: ");
        	int numTree = in.nextInt();
        
       		// Вычисление
        	int sum = numOne + numTwo + numTree;
        	int product = numOne * numTwo * numTree;
        	double average = (double) sum / 3; 
        
        	// Вывод суммы, произведения, ср арифметического
        	System.out.println("Сумма: " + sum);
        	System.out.println("Произведение: " + product);
        	System.out.println("Среднее арифметическое: " + average);
	}
}
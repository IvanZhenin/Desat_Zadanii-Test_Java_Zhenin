import java.util.Scanner;
public class New
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in, "ibm866");
		// Ввод числа
		System.out.print("Введите число: ");
        	int num = in.nextInt(); 
        
        	// Вычисление
        	int numOne = num * num;
		int numTwo = numOne * numOne;
		int numTree = numTwo  * numTwo ;
		num = numTree*numOne;       
		
		// Вывод результата
       		System.out.println("Результат: " + num);  
	}
}
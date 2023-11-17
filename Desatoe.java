import java.util.Scanner;
public class New
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in, "ibm866");
		// Ввод чисел
		System.out.print("Введите первое натуральное число (n): ");
        	int chisloNo = in.nextInt(); 
        	System.out.print("Введите второе натуральное число (m): ");
       		int chisloMo = in.nextInt();
        
        	// Вычисление с условием   
       		if (chisloNo % chisloMo == 0 || chisloMo % chisloNo == 0) 
		{
        	  // Вывод в первом случае
           	  System.out.println("1"); 
        	} 
       		else 
		{
        	  // Вывод во втором случае
          	  System.out.println("888"); 
		}
	}
}
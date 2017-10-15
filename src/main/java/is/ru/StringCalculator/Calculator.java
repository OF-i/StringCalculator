package is.ru.StringCalculator;
import java.util.ArrayList;

public class Calculator{

  public static int add(String numbers)
 {
   if(numbers.equals(""))
   {
     return 0;
   }
   else
   {
     if(numbers.contains(",") || numbers.contains("\n"))
     {
       String[] arguments = numbers.split(",|\n");
       int sum = sum(arguments);
       return sum;
     }
     return parse(numbers);
   }
 }
 private static int parse(String num)
 {
   return Integer.parseInt(num);
 }

 private static int sum(String[] arguments)
	 {
	   int sum = 0;
	   ArrayList<Integer> negatives = new ArrayList<Integer>();
	   for(String i : arguments)
	   {
		   	int num = parse(i);
		     if(num < 0)
		     {
		       negatives.add(num);
		     }
		     sum += num;
	   }
	   if(negatives.size() > 0)
	   {
		   throw new IllegalArgumentException("Negatives not allowed: " + negatives);
	   }
	   return sum;
	 }
}

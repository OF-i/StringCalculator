package is.ru.StringCalculator;
import java.util.ArrayList;

public class Calculator{

	public static int add(String numbers)
	 {
	   if(numbers.equals(""))
	   {
	     return 0;
	   }
	   if(numbers.contains(",") || numbers.contains("\n") || numbers.startsWith("//"))
	   {
		 String delimiter = ",|\n";
		 if(numbers.startsWith("//"))
		 {
			 String[] getDel = numbers.split("\n", 2);
			 numbers = getDel[1];
			 int delBegin = getDel[0].indexOf("//") + 2;
			 String newDelim = getDel[0].substring(delBegin);
			 delimiter += "|" + newDelim;
		 }
			   String[] arguments = numbers.split(delimiter);
		       int sum = sum(arguments);
		       return sum;
	   }
	   return parse(numbers);
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
		     else if(num > 1000)
		     {
		    	 continue;
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

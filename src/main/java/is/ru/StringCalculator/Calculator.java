package is.ru.StringCalculator;

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
   for(String i : arguments)
   {
     sum += parse(i);
   }
   return sum;
 }
}

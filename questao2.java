// Questão 2:
public class Main
{
	public static void main(String[] args) {
	    int value = 34;
	    int x = 0;
	    int y = 1;
	    int res = 0;
	   
	   while (value > res)
	   {
	       res = x + y;
	       x = y;
	       y = res;
	   }
	   
	   if (value == res) 
	    System.out.println(value + " pertence a sequência Fibonacci");
	   else 
	    System.out.println(value + " não pertence a sequência Fibonacci");
	   
	}
}
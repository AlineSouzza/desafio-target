//Questão 5:
public class Main
{
	public static void main(String[] args) {
	   String leitor = "target sistemas";
	   String novaPalavra = "";
	   String[] array = leitor.split("");
	   
	   for (int i = leitor.length() - 1; i >= 0; i--) {
	       novaPalavra = novaPalavra + array[i];
	   }
	   
	   System.out.println(novaPalavra);
	}
}
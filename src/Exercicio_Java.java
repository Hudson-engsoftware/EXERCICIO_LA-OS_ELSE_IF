import java.util.Scanner;
public class Exercicio_Java {

	public static void main(String[] args) {
		
		Scanner tc =  new Scanner (System.in);
		
	
		double n1,n2,n3,n4;
		double nMaior = 0,nMenor = 0;
		double media;
			
		System.out.println("Insira um numero :");
		n1 = tc.nextDouble();
		System.out.println("Insira um numero :");
		n2 = tc.nextDouble();
		System.out.println("Insira um numero :");
		n3 = tc.nextDouble();
		System.out.println("Insira um numero :");
		n4 = tc.nextDouble();
		
		tc.close();
		
		System.out.println("O primeiro nº e: "+n1);
		System.out.println("O Segundo  nº e: "+n2);
		System.out.println("O Terceiro nº e: "+n3);
		System.out.println("O Quarto   nº e: "+n4);

		if (n1>n2 && n1 >n3 && n1 >n4){ 
			
			nMaior = n1;
			}
		else if (n2 >n1 && n2 > n3 && n2 >n4) {
			
			nMaior = n2;
		}
		else if (n3>n1 && n3 > n2 && n3 > n4) {
			nMaior = n3;
		}
		else if (n4>n1 && n4 > n2 && n4 > n3) {
			nMaior = n4;
		}
		
		System.out.println("\nO Maior numero inserido e :" + nMaior);
		
		if(n1 <n2 && n1 < n3 && n1 < n4) {
			nMenor = n1;
		}
		else if (n2 < n1 && n2 < n3 && n2 < n4) {
			nMenor = n2;
		}
		else if (n3 < n1 && n3 < n2 && n3 < n4) {
			nMenor = n3;
		}
		else if (n4 < n1 && n4 < n2 && n4 < n3) {
			nMenor = n4;
		}
		
		
		System.out.println("\nO Menor numero inserido e :" + nMenor);
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("\nA Media entre os numeros e: " + media);
}
}
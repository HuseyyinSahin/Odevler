import java.util.Scanner;

public class Denklembulma {

	public static void main(String[] args) {
			
		    Scanner scan = new Scanner(System.in);
			int  a,b,c;
			System.out.println("�kinci Dereceden Denklem Bulma Program�na Ho�geldiniz");
			System.out.print("a say�s�n� giriniz : ");
			a = scan.nextInt();
			System.out.print("b say�s�n� giriniz : ");
			b = scan.nextInt();
			System.out.print("c say�s�n� giriniz : ");
			c = scan.nextInt();
			int delta = (b*b)-(4*a*c);
			int b�lme = (-1*b)/(2*a);
			if(delta == 0) {
				System.out.println("x1 = " + b�lme);
				System.out.println("x2 = " + b�lme);
				
			}if (delta > 0){
				System.out.println("x1 = " + ((-1*b)+Math.sqrt(delta))/(2*a));
				System.out.println("x2 = " + ((-1*b)-Math.sqrt(delta))/(2*a));

			}else if(delta < 0){
				System.out.println("Denklemin Ger�ek K�k� Yok");
			}
		}
		
		
	}



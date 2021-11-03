import java.util.Scanner;

public class Denklembulma {

	public static void main(String[] args) {
			
		    Scanner scan = new Scanner(System.in);
			int  a,b,c;
			System.out.println("Ýkinci Dereceden Denklem Bulma Programýna Hoþgeldiniz");
			System.out.print("a sayýsýný giriniz : ");
			a = scan.nextInt();
			System.out.print("b sayýsýný giriniz : ");
			b = scan.nextInt();
			System.out.print("c sayýsýný giriniz : ");
			c = scan.nextInt();
			int delta = (b*b)-(4*a*c);
			int bölme = (-1*b)/(2*a);
			if(delta == 0) {
				System.out.println("x1 = " + bölme);
				System.out.println("x2 = " + bölme);
				
			}if (delta > 0){
				System.out.println("x1 = " + ((-1*b)+Math.sqrt(delta))/(2*a));
				System.out.println("x2 = " + ((-1*b)-Math.sqrt(delta))/(2*a));

			}else if(delta < 0){
				System.out.println("Denklemin Gerçek Kökü Yok");
			}
		}
		
		
	}



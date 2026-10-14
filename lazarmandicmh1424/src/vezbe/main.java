package vezbe;

import java.util.Scanner;

public class main {
 //deklarisanje i inicijalizacija
	public static void prvavezba() {
	 int broj;
	 //inicializovanje
	 broj = 10;
	 broj = 69;
	 broj = 67;
	 
	 double majmun = 67.77;
	 String tekst = "Moj prvi put";
	 System.out.println("Decimalni broj koji imamo je:" + majmun);
	 System.out.println(tekst);
	 
 }
	public static void drugavezba() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("unesite broj:");
		int broj = scanner.nextInt();
		
		//operator koji se zove moduo koji sluzi za racuanje ostataka pri deljenju
		if(broj % 2 == 0) {
			System.out.println("Broj "  + broj + " je paran");
			
		}else {
			System.out.println("Broj "  + broj + " je neparan");
		}
		
	}
	public static void trecavezba() {
		
		System.out.println("Unesite broj:");
		Scanner scanner = new Scanner (System.in);
		int broj = scanner.nextInt();
		
		
		for(int brojac = 0;brojac <= broj; brojac++);{
		System.out.println(brojac);
		
		
		
	}
		int brojac = 0;
	while (brojac <= broj) {
		System.out.println(brojac);
		brojac ++;
	}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       prvavezba();
       drugavezba();
       trecavezba();
	}

}

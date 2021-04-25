package day03;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {
	
	
	// kullanicin girdigi sayi kadar int array olusturan 
	// ve array elemanlarini kullanicidan alan
	// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	// java programi yazin
	
	
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Kac elemanli bir array olusturmak istiyorsunuz?");
			
			int size = scan.nextInt();
			
			int sayilar[] = new int[size]; // Array olusturmanin 2. yolu
			
			
			for(int i = 0; i<sayilar.length; i++){
				
				
				System.out.println("Lutfen Array'in " + (i+1) + ".ci elemanini giriniz"); 
				
				// i+0'i kullanici 0.eleman ne demesin diye yazdik
				
				sayilar[i] = scan.nextInt(); // bu satirda da kulllanici dongu bitene kadar eleman girer
			}
			
			
			
			
			System.out.println(Arrays.toString(sayilar)); // Array'i String'e cevirip yazdirdik.
			
			Arrays.sort(sayilar); // Array'i siraladik.
			
			
			System.out.println(Arrays.toString(sayilar));
			
			System.out.println(sayilar[size-1] - sayilar[0]); // size-1 ==> son index tir
	
			scan.close();
	
	}
	
}









package day04;

import java.util.ArrayList;
import java.util.List;

public class ManavProjesi {
	
	/*
     * Basit bir manav alisveris programi yaziniz.
     *
     * 1. Adim : Ürün listesinden ürün seçtir ve kaç kilo oldugunu sor.
     * 2. Adim : Baska bir ürün almak isteyip istemedigini sor.
     * 			 Istemiyorsa toplam miktari göster, istiyorsa tekrar ürün seçtir.
     * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Muster her ürün seçtiginde, aldigi ürünün fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam ödemesi gereken tutari göster.
     *
     * */

	static List<String> urunIsimleri= new ArrayList<>();
	static List<Double> urunFiyatlari= new ArrayList<>();
	
	public static void main(String[] args) {


		
		urunIsimleri.add("Domates - Urun Kodu : 0");
		urunIsimleri.add("Patlican - Urun Kodu : 1");
		urunIsimleri.add("Karpuz - Urun Kodu : 2");
		urunIsimleri.add("Biber - Urun Kodu : 3");
		urunIsimleri.add("Erik - Urun Kodu : 4");
		urunIsimleri.add("Armut - Urun Kodu : 5");
		
		urunFiyatlari.add(4.5);
		urunFiyatlari.add(5.40);
		urunFiyatlari.add(1.25);
		urunFiyatlari.add(1.75);
		urunFiyatlari.add(6.56);
		urunFiyatlari.add(3.78);
		
		System.out.println(urunIsimleri + "\n"+ urunFiyatlari);


	}

}

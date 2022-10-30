package javaHelloWorld;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel. ";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6);
		System.out.println(toplam);

	}
	
	public static void ekle() {
		System.out.println("eklendi ");
	}
	
	public static void sil() {
		System.out.println("silindi ");
	}
	
	public static void guncelle() {
		System.out.println("g�ncellendi ");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) { // ... variable argument denir.
		int toplam =0;                         //3 nokta ile fazla say�da int g�nderebilirsin
		for(int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
		
	}
	
	public static String sehirVer() {
		return "ankara";
	}

}

//void olan operasyonlar� bir de�i�kene atayamay�z
package javaHelloWorld;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int [] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMý = false;
		
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
				varMý = true;
				break;
			}
		}
		
		if (varMý) {
			mesajVar("sayý mevcuttur: " + aranacak);
		}else {
			mesajVar("sayý mevcut deðildir: " + aranacak);
		}
	}
	
	public static void mesajVar(String mesaj) {
		System.out.println(mesaj);
	}

}

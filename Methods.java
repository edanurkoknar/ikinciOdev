package javaHelloWorld;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int [] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varM� = false;
		
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
				varM� = true;
				break;
			}
		}
		
		if (varM�) {
			mesajVar("say� mevcuttur: " + aranacak);
		}else {
			mesajVar("say� mevcut de�ildir: " + aranacak);
		}
	}
	
	public static void mesajVar(String mesaj) {
		System.out.println(mesaj);
	}

}

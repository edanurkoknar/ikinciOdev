package javaHelloWorld;

public class Main4 {

	public static void main(String[] args) {
		DortIslem dortýslem = new DortIslem();
		int sonuc = dortýslem.Topla(3, 4);
		System.out.println(sonuc);
		
		Product product = new Product();
		product.setName ("laptop");
		product.setId(1);
		product.setDescription ("asus laptop");
		product.setPrice (5000);
		product.setStockAmount (3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		

	}

}

package javaHelloWorld;

public class Product {
	
	public Product (int id,String name, String description,double price, int stockAmount,String renk){
		System.out.println("yap�c� blok �al��t�");
		this.Id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
		this.renk=renk;
	}
	
	public Product() {
		
	}
	
	// attribiute or field
	private int Id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	public String getKod() {
		return this.name.substring(0,1) + Id;
	}

}

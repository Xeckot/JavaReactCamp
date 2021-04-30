package oopIntro;

public class Main {
	// CLASSLAR REFERANS T�PT�R.
	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo V14", 15000, "8 GB Ram", 10); // �rnek olu�turma, Referans olu�urma,
																				// intance creation

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);

		System.out.println("�ndirimli Fiyat: " + product1.getUnitPriceAfterDiscount());
		System.out.println("�ndirimli Fiyat: " + product2.getUnitPriceAfterDiscount());

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);

		Category category1 = new Category();
		category1.setId(1);
		category1.setName("��ecek");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");

		System.out.println(category1.getName());
		System.out.println(category2.getName());

	}

}

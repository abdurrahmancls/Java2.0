package classesWithAttributes;


public class Main {

	public static void main(String[] args) {
		Product product= new Product(2,"Laptop","Asus",20000,3,"Siyah");
//		Product product = new Product();
//		product.setId(2);
//		product.setName("Laptop");
//		product.setDescription("Dell Xps");
//		product.setPrice(20000);
//		product.setStockAmount(23);
		
		
		ProductManager pmanager= new ProductManager();
		pmanager.Add(product);
		
		System.out.println(product.getName()  +  product.getDescription());
		System.out.println(product.getGetCode());
	
	}

}

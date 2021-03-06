package dao;

import java.util.*;
import dto.Product;

public class ProductRepository {
	private List<Product> products = new ArrayList<>();
	
	//make one instance and reuse it (Single turn)
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
	}
	
	
	public ProductRepository() {
		Product phone = new Product("P1234", "iphone 11", 950000);
		phone.setDescription("4.7-inch, 1334X750 Retina HD display, ....");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("P1235", "LG PC Gram", 1550000);
		notebook.setDescription("4.7-inch, 1334X750 Retina HD display, ....");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG"); 
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refublished");
		
		Product tablet = new Product("P1236", "Galaxy Tab S", 950000);
		tablet.setDescription("4.7-inch, 1334X750 Retina HD display, ....");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		
		
		products.add(phone);
		products.add(notebook);
		products.add(tablet);		
	}
	
	//Bring every products
	public List<Product> getAllProducts() {
		return products;
	}
	
	//find item using product Id (using stream + lamda)
	public Product getProductById(String productId) {
		return products.stream()
				.filter((product) -> product.getProductId().equals(productId))
				.findFirst()
				.get();
	}
	
	//add items
	public void addProduct(Product product) {
		products.add(product);
	}
}

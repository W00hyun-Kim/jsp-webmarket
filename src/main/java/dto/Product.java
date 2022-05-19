package dto;

import java.io.Serializable;

//Model Class
//JSP : JavaBeans(Getter/Setter, default constructor, serializable)
public class Product implements Serializable{

	private static final long serialVersionUID = 2867748905925104542L;
	private String productId;
	private String name;
	private int unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInStock;
	private String condition;
	
	//dafault constructor
	public Product() {};
	
	//constructor
	public Product(String productId, String name, int unitPrice) {
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
	}
		
	//Getter Setter
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}

//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", name=" + name + ", unitPrice=" + unitPrice + ", description="
//				+ description + ", manufacturer=" + manufacturer + ", category=" + category + ", unitsInStock="
//				+ unitsInStock + ", condition=" + condition + "]";
//	} 
	
	
	
	
}

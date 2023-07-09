package Model;

public class Product {
private int productId;
private String productName;
private int minSellQuantity;
private int price;
private int quantity;

public int getProductId() {
return productId;
}
public void setProductId(int productId) {
this.productId = productId;
}
public String getProductName() {
return productName;
}
public void setProductName(String productName) {
this.productName = productName;
}
public int getMinSellQuantity() {
return minSellQuantity;
}
public void setMinSellQuantity(int minSellQuantity) {
this.minSellQuantity = minSellQuantity;
}
public int getPrice() {
return price;
}
public void setPrice(int price) {
this.price = price;
}
public int getQuantity() {
return quantity;
}
public void setQuantity(int quantity) {
this.quantity = quantity;
}
}

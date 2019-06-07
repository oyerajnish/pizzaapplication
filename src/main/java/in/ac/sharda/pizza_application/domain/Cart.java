package in.ac.sharda.pizza_application.domain;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class Cart {
	// private List<Product> products = new ArrayList<>();
	
	private Set<Product> itmes = new TreeSet<>();

	
	/*public void addProduct(Product product) {
		this.products.add(product);
	}*/
	
	
	
	public Set<Product> additems() {
		for(int i = 1; i<20; i++) {
			itmes.add(new Product(i, i*10, "Nme "+i, "Desc "+i));
		}
	return itmes;
	
	}
	
	public Cart(Set<Product> itmes) {
		this.itmes = itmes;
	}

	public void removeProduct() {
		for(int i = 1; i<20; i++) {
			itmes.remove(new Product(i, i*10, "Nme "+i, "Desc "+i));
		}
		System.out.println("All items removed");
	}
	}
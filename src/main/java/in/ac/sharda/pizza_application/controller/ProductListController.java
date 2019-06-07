package in.ac.sharda.pizza_application.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.pizza_application.domain.Product;

@RestController

public class ProductListController {
	
	@GetMapping("/product/list")
	public List<Product> products(){
		List<Product> products = new ArrayList<>();
		for(int i = 1; i<20; i++) {
			products.add(new Product(i, i*10, "Name "+i, "Description "+i));
		}
		return products;
	}
}

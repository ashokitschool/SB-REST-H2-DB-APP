package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepository;

@RestController
public class ProductRestController {
	
	@Autowired
	private ProductRepository repo;
	
	@PostMapping(value = "/product", consumes  = "application/json")
	public ResponseEntity<String> addProduct(@RequestBody Product product){
		int i = 10;
		int j = 20;
		repo.save(product);
		return new ResponseEntity<>("Product Saved", HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/products", produces = "application/json")
	public ResponseEntity<List<Product>> products(){
		List<Product> products = repo.findAll();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
}

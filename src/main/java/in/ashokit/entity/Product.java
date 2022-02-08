package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	private Integer pid;
	private String pname;
	private Double price;

}

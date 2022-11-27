package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {

	@Id
	private Integer pid;
	private String pname;
	private Double price;
	private String brand;
	private boolean stockPresent;
	private String mfgDate;
	private String name;
	private int i;


	
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}

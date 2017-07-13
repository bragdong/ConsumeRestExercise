package hello;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class ZipCode  {

//	private static final long serialVersionUID = 1L;
	
	private String country;
	private String name;
	private String abbr;
	
	public ZipCode() {
		super();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbr() {
		return abbr;
	}

	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}

	@Override
	public String toString() {
		return "ZipCode [country=" + country + ", name=" + name + ", abbr="
				+ abbr + "]";
	}
	
	
}

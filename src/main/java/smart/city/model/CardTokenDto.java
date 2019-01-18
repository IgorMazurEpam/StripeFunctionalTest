package smart.city.model;

public class CardTokenDto {

	private String clientIP;
	private Long created;
	private String id;
	private String object;
	private String type;
	private String zip;
	private String brand;
	private String country;
	private String cvcChecked;
	private Integer expMonth;
	private Integer expYear;
	
	// Getters & Setters
	public String getClientIP() {
		return clientIP;
	}
	
	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}
	
	public Long getCreated() {
		return created;
	}
	
	public void setCreated(Long created) {
		this.created = created;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getObject() {
		return object;
	}
	
	public void setObject(String object) {
		this.object = object;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCvcChecked() {
		return cvcChecked;
	}
	
	public void setCvcChecked(String cvcChecked) {
		this.cvcChecked = cvcChecked;
	}
	
	public Integer getExpMonth() {
		return expMonth;
	}
	
	public void setExpMonth(Integer expMonth) {
		this.expMonth = expMonth;
	}
	
	public Integer getExpYear() {
		return expYear;
	}
	
	public void setExpYear(Integer expYear) {
		this.expYear = expYear;
	}

	@Override
	public String toString() {
		return "CardTokenDto [clientIP=" + clientIP + ", created=" + created + ", id=" + id + ", object=" + object
				+ ", type=" + type + ", zip=" + zip + ", brand=" + brand + ", country=" + country + ", cvcChecked="
				+ cvcChecked + ", expMonth=" + expMonth + ", expYear=" + expYear + "]";
	}	
	
	
}

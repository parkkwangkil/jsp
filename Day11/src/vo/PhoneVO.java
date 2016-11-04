package vo;

public class PhoneVO {
	private int phoneId;
	private String model;
	private String manufacturer;
	private int price;
	private String year;

	
	public PhoneVO(){
		
	}
	
	public PhoneVO(int phoneId){
		this.phoneId = phoneId;
	}
	public PhoneVO(String model, String manufacturer, int price,String year) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
		this.year = year;
		
	}

	public PhoneVO(int phoneId, String model, String manufacturer, int price, String year) {
		this.phoneId =phoneId;
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
		this.year = year;
	
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	
}
	
	
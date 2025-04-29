package self.bank;

public class Address {
	private int zipCode;
	private String region;
	private String city;
	
	private static final int ZIP_CODE=000;
	private static final String REGION="기본도";
	private static final String CITY="기본시";
	public Address() {
		this(ZIP_CODE,REGION,CITY);
	}

	public Address(int zipCode, String region, String city) {
		this.zipCode = zipCode;
		this.region = region;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [zipCode=" + zipCode + ", region=" + region + ", city=" + city + "]";
	}

}

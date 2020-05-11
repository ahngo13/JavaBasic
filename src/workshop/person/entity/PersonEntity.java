package workshop.person.entity;

public class PersonEntity {
	private String name;
	private char gender;
	private String ssn;
	private String address;
	private String phone;
	
	public PersonEntity()
	{
		
	}
	
	public PersonEntity(String name, String ssn, String address, String phone) {
		super();
		setName(name);
		setSsn(ssn);
		setAddress(address);
		setPhone(phone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
		char num = ssn.charAt(6);
		if(num=='1'|| num=='3')
			setGender('��');
		else if(num=='2'|| num=='4')
			setGender('��');
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}	
}

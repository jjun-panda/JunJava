package phonebookDB;

public class PhoneBookDTO {
    private int no;
	private String name;
	private String phone;
	private String email;
	private String region;

	public PhoneBookDTO() {
		this(0, "", "", "", "");
	}

	public PhoneBookDTO(int no, String name, String phone, String email, String region) {
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.region = region;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

    @Override
    public String toString() {
		return "PhoneBookDTO [no=" + no + ", name=" + name + ", phone=" + phone + ", emaill=" + email + ", region=" + region + "]";
	}
}

package wicketpractice;

public class Input {
    private String fn;
    private String ln;
    private String email;
    private String phone;
    private String age;
    private String ge;
    private String country;
    private String state1;
    private String fruitDropDown;
    
    
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGe() {
		return ge;
	}
	public void setGe(String ge) {
		this.ge = ge;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getState1() {
		return state1;
	}
	public void setState1(String state1) {
		this.state1 = state1;
	}
	public String getFruitDropDown() {
		return fruitDropDown;
	}
	public void setFruitDropDown(String fruitDropDown) {
		this.fruitDropDown = fruitDropDown;
	}
	@Override
	public String toString() {
		return "Input [fn=" + fn + ", ln=" + ln + ", email=" + email + ", phone=" + phone + ", age=" + age + ", ge="
				+ ge + ", country=" + country + ", state=" + state1 + ", fruitDropDown=" + fruitDropDown + "]";
	}
   
    
    

    
}
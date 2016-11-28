package vo;

public class MemberVO {
	private String id;
	private String password;
	private String email;

	public MemberVO() {
	}

	public MemberVO(String id, String password, String email) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "LoginVO [id=" + id + ", password=" + password + ", email=" + email + "]";
	}

}

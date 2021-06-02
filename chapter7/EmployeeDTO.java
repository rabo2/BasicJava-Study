package chapter7;

public class EmployeeDTO {
	private String id;
	private String name;
	private String email;
	private String hpNubmer;

	public EmployeeDTO(String id, String name, String email, String hpNumber) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.hpNubmer = hpNubmer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHpNubmer() {
		return hpNubmer;
	}

	public void setHpNubmer(String hpNubmer) {
		this.hpNubmer = hpNubmer;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", email=" + email + ", hpNubmer=" + hpNubmer + "]";
	}

}

package chapter7;

public class EmployeesVo {
	private int departmentId;
	private String departmentName;
	private String employeeId;
	private String empName;

	public EmployeesVo(int departmentId, String departmentName, String employeeId, String empName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employeeId = employeeId;
		this.empName = empName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "EmployeesVo [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employeeId="
				+ employeeId + ", empName=" + empName + "]";
	}

}

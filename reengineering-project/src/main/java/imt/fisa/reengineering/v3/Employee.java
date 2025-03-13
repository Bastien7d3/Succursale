package imt.fisa.reengineering.v3;


public class Employee implements CompanyItem {

	public enum EmployeeType {
		STAFF, ADMINISTRATIVE, TECHNICAL
	}

	protected long wage;
	protected EmployeeType employeeType;

	public Employee(long wage, EmployeeType employeeType) {
		this.wage = wage;
		this.employeeType = employeeType;
	}

	public long getWage() {
		return wage;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setWage(long wage) {
		this.wage = wage;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public boolean isStaffEmployee() {
		return employeeType == EmployeeType.STAFF;
	}

	public boolean isAdministrativeEmployee() {
		return employeeType == EmployeeType.ADMINISTRATIVE;
	}

	public long getNumberEmployees() {
		return 1;
	}
	public long getNumberSubsidiaries() {
		return 0;
	}
	public long getNumberNodes() {
		return 1;
	}
	public long getNumberStaffEmployees() {
		return isStaffEmployee() ? 1:0;
	}
	public long getNumberAdministrativeEmployees() {
		return isAdministrativeEmployee() ? 1:0;
	}

}
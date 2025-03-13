package imt.fisa.reengineering.v4;


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
	
	public void accept(CompanyVisitor visitor) {
		visitor.visit(this);
	}


}
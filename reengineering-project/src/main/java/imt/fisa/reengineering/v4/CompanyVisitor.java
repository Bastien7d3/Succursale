package imt.fisa.reengineering.v4;

public interface CompanyVisitor {

	public void visit(Subsidiary subsidiary); 
	public void visit(Employee employee);
	public void visit(Company company);

}

class TotalWageVisitor implements CompanyVisitor {
	protected long totalWage;

	public long getWage(CompanyItem item) {
		totalWage = 0;
		item.accept(this);
		return totalWage;
	}

	@Override
	public void visit(Subsidiary subsidiary) {

	}

	@Override
	public void visit(Employee employee) {
		totalWage = totalWage + employee.getWage();
	}

	@Override
	public void visit(Company company) {
		
	}
}

class NumberEmployeesVisitor implements CompanyVisitor {
	protected long numberEmployees;

	public long getNumberEmployees(CompanyItem item) {
		numberEmployees = 0;
		item.accept(this);
		return numberEmployees;
	}

	@Override
	public void visit(Subsidiary subsidiary) {
	}

	@Override
	public void visit(Employee employee) {
		numberEmployees = numberEmployees + 1;
	}

	@Override
	public void visit(Company company) {
		// TODO Auto-generated method stub
		
	}
}

class NumberSubsidiariesVisitor implements CompanyVisitor {
	protected long numberSubsidiaries;

	public long getNumberSubsidiaries(CompanyItem item) {
		numberSubsidiaries = 0;
		item.accept(this);
		return numberSubsidiaries;
	}

	@Override
	public void visit(Subsidiary subsidiary) {
		numberSubsidiaries = numberSubsidiaries + 1;
	}

	@Override
	public void visit(Employee employee) {
	}

	@Override
	public void visit(Company company) {
		
	}
}

class NumberNodesVisitor implements CompanyVisitor {
	protected long numberNodes;

	public long getNumberNodes(CompanyItem item) {
		numberNodes = 0;
		item.accept(this);
		return numberNodes;
	}

	@Override
	public void visit(Subsidiary subsidiary) {
		numberNodes = numberNodes + 1;
	}

	@Override
	public void visit(Employee employee) {
		numberNodes = numberNodes + 1;
	}

	@Override
	public void visit(Company company) {
		numberNodes = numberNodes + 1;
	}
}

class NumberStaffEmployeesVisitor implements CompanyVisitor {
	protected long numberStaffEmployees;

	public long getNumberStaffEmployees(CompanyItem item) {
		numberStaffEmployees = 0;
		item.accept(this);
		return numberStaffEmployees;
	}

	@Override
	public void visit(Subsidiary subsidiary) {
	}

	@Override
	public void visit(Employee employee) {
		if (employee.isStaffEmployee())
			numberStaffEmployees = numberStaffEmployees + 1;
	}

	@Override
	public void visit(Company company) {
		
	}
}

class NumberAdministrativeEmployeesVisitor implements CompanyVisitor {
	protected long numberAdministrativeEmployees;

	public long getNumberAdministrativeEmployees(CompanyItem item)	{
		numberAdministrativeEmployees = 0;
		item.accept(this);
		return numberAdministrativeEmployees;
	}

	@Override
	public void visit(Subsidiary subsidiary) {
	}

	@Override
	public void visit(Employee employee) {
		if (employee.isAdministrativeEmployee())
			numberAdministrativeEmployees = 
                     numberAdministrativeEmployees + 1;
	}

	@Override
	public void visit(Company company) {
		
	}
}
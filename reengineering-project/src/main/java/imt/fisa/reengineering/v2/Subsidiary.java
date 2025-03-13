package imt.fisa.reengineering.v2;

import java.util.ArrayList;
import java.util.List;

public class Subsidiary {

	protected List<Employee> employees = new ArrayList<Employee>();
	
	public long getWage() {
		long result = 0;

		for (Employee employee : employees)
			result = result + employee.getWage();
		return result;
	}

	public long getNumberEmployees() {
		long result = employees.size();
		return result;
	}


	public long getNumberNodes() {
		long result = employees.size() + 1;
		return result;
	}

	public long getNumberStaffEmployees() {
		long result = 0;
		for (Employee employee : employees)
			if (employee.isStaffEmployee())
				result = result + 1;
		return result;
	}

	public long getNumberAdministrativeEmployees() {
		long result = 0;
		for (Employee employee : employees)
			if (employee.isAdministrativeEmployee())
				result = result + 1;
		return result;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
}


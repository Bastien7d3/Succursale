package imt.fisa.reengineering.v2;

import java.util.ArrayList;
import java.util.List;

// rename as BigCompany
public class Company extends Subsidiary {
	protected List<Subsidiary> subsidiaries = new ArrayList<Subsidiary>();

	public long getWage() {
		long result = 0;
		result = super.getWage();
		for (Subsidiary subsidiary : subsidiaries)
			result = result + subsidiary.getWage();
		return result;
	}

	public long getNumberEmployees() {
		long result = super.getNumberEmployees();
		for (Subsidiary subsidiary : subsidiaries)
			result = result + subsidiary.getNumberEmployees();
		return result;
	}

	public long getNumberSubsidiaries() {
		long result = subsidiaries.size();
		return result;	
	}

	public long getNumberNodes() {
		long result = super.getNumberNodes();
		for (Subsidiary subsidiary : subsidiaries)
			result = result + subsidiary.getNumberNodes();
		return result;
	}

	public long getNumberStaffEmployees() {
		long result = 0;
		result = super.getNumberStaffEmployees();
		for (Subsidiary subsidiary : subsidiaries)
			result = result + subsidiary.getNumberStaffEmployees();
		return result;
	}

	public long getNumberAdministrativeEmployees() {
		long result = 0;
		result = super.getNumberAdministrativeEmployees();
		for (Subsidiary subsidiary : subsidiaries)
			result = result + subsidiary.getNumberAdministrativeEmployees();
		return result;
	}

	public void addSubsidiary(Subsidiary subsidiary) {
		subsidiaries.add(subsidiary);
	}

	public void removeSubsidiary(Subsidiary subsidiary) {
		subsidiaries.remove(subsidiary);
	}
}

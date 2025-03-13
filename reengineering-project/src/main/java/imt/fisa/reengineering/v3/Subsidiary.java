package imt.fisa.reengineering.v3;

import java.util.ArrayList;
import java.util.List;

public class Subsidiary implements CompanyComposite {
	
	protected List<CompanyItem> items = new ArrayList<CompanyItem>();

	public long getWage() {
		long result = 0;
		for (CompanyItem item : items)
			result = result + item.getWage();
		return result;
	}

	public long getNumberEmployees() {
		long result = 0;
		for (CompanyItem item : items) {
			result = result + item.getNumberEmployees();
		}
		return result;
	}

	public long getNumberSubsidiaries() {
		return 1;
	}

	public long getNumberNodes() {
		long result = 1;
		for (CompanyItem item : items) {
			result = result + item.getNumberNodes();
		}
		return result;
	}

	public long getNumberStaffEmployees() {
		long result = 0;
		for (CompanyItem item : items) {
			result = result + item.getNumberStaffEmployees();
		}
		return result;
	}

	public long getNumberAdministrativeEmployees() {
		long result = 0;
		for (CompanyItem item : items) {
			result = result + item.getNumberAdministrativeEmployees();
		}
		return result;
	}

	public void addItem(CompanyItem item) {
		items.add(item);
	}
	
	public void removeItem(CompanyItem item) {
		items.remove(item);
	}
}

package imt.fisa.reengineering.v3;

public class Company extends Subsidiary {

	public long getNumberSubsidiaries() {
		long result = 0;
		for (CompanyItem item : items) {
			result = result + item.getNumberSubsidiaries();
		}
		return result;	
	}
}

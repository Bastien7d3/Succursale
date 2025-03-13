package imt.fisa.reengineering.v3;

public interface CompanyComposite extends CompanyItem {
	
	public void addItem(CompanyItem item);
	public void removeItem(CompanyItem item);
	
}

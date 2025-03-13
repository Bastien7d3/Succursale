package imt.fisa.reengineering.v4;

import java.util.ArrayList;
import java.util.List;

public class Subsidiary implements CompanyComposite {
	
	protected List<CompanyItem> items = new ArrayList<CompanyItem>();
	
	public void addItem(CompanyItem item) {
		items.add(item);
	}
	
	public void removeItem(CompanyItem item) {
		items.remove(item);
	}
	
	public void accept(CompanyVisitor visitor) {
		visitor.visit(this);
		for (CompanyItem item : items)
			item.accept(visitor);
	}
}

package imt.fisa.reengineering.v4;

public class Company extends Subsidiary {

	public void accept(CompanyVisitor visitor) {
		visitor.visit(this);
		for (CompanyItem item : items)
			item.accept(visitor);
	}
}

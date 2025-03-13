package imt.fisa.reengineering.v4;

/**
 * Interface CompanyVisitor qui définit le contrat pour les visiteurs d'éléments d'entreprise.
 * Implémente le pattern Visitor permettant d'ajouter de nouvelles opérations aux objets sans les modifier.
 */
public interface CompanyVisitor {

	/**
	 * Visite une filiale.
	 * @param subsidiary La filiale à visiter
	 */
	public void visit(Subsidiary subsidiary); 
	
	/**
	 * Visite un employé.
	 * @param employee L'employé à visiter
	 */
	public void visit(Employee employee);
	
	/**
	 * Visite une entreprise.
	 * @param company L'entreprise à visiter
	 */
	public void visit(Company company);

}

/**
 * Visiteur qui calcule la masse salariale totale d'une structure d'entreprise.
 */
class TotalWageVisitor implements CompanyVisitor {
	/** Stocke la somme des salaires calculée. */
	protected long totalWage;

	/**
	 * Calcule le salaire total pour un élément d'entreprise et ses enfants.
	 * @param item L'élément sur lequel effectuer le calcul
	 * @return La somme des salaires
	 */
	public long getWage(CompanyItem item) {
		totalWage = 0;
		item.accept(this);
		return totalWage;
	}

	@Override
	public void visit(Subsidiary subsidiary) {
		// La filiale elle-même n'a pas de salaire, donc pas d'action spécifique
	}

	@Override
	public void visit(Employee employee) {
		totalWage = totalWage + employee.getWage();
	}

	@Override
	public void visit(Company company) {
		// L'entreprise elle-même n'a pas de salaire, donc pas d'action spécifique
	}
}

/**
 * Visiteur qui compte le nombre total d'employés dans une structure d'entreprise.
 */
class NumberEmployeesVisitor implements CompanyVisitor {
	/** Stocke le nombre d'employés comptés. */
	protected long numberEmployees;

	/**
	 * Compte le nombre total d'employés pour un élément d'entreprise et ses enfants.
	 * @param item L'élément sur lequel effectuer le comptage
	 * @return Le nombre total d'employés
	 */
	public long getNumberEmployees(CompanyItem item) {
		numberEmployees = 0;
		item.accept(this);
		return numberEmployees;
	}

	@Override
	public void visit(Subsidiary subsidiary) {
		// Une filiale n'est pas un employé, donc pas d'incrémentation
	}

	@Override
	public void visit(Employee employee) {
		numberEmployees = numberEmployees + 1;
	}

	@Override
	public void visit(Company company) {
		// Une entreprise n'est pas un employé, donc pas d'incrémentation
	}
}

/**
 * Visiteur qui compte le nombre de filiales dans une structure d'entreprise.
 */
class NumberSubsidiariesVisitor implements CompanyVisitor {
	/** Stocke le nombre de filiales comptées. */
	protected long numberSubsidiaries;

	/**
	 * Compte le nombre de filiales pour un élément d'entreprise et ses enfants.
	 * @param item L'élément sur lequel effectuer le comptage
	 * @return Le nombre total de filiales
	 */
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
		// Un employé n'est pas une filiale, donc pas d'incrémentation
	}

	@Override
	public void visit(Company company) {
		// L'entreprise principale n'est pas comptée comme filiale
	}
}

/**
 * Visiteur qui compte le nombre total de nœuds (entreprises, filiales et employés) dans la structure.
 */
class NumberNodesVisitor implements CompanyVisitor {
	/** Stocke le nombre de nœuds comptés. */
	protected long numberNodes;

	/**
	 * Compte le nombre total de nœuds pour un élément d'entreprise et ses enfants.
	 * @param item L'élément sur lequel effectuer le comptage
	 * @return Le nombre total de nœuds
	 */
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

/**
 * Visiteur qui compte le nombre d'employés de type STAFF dans une structure d'entreprise.
 */
class NumberStaffEmployeesVisitor implements CompanyVisitor {
	/** Stocke le nombre d'employés de type STAFF comptés. */
	protected long numberStaffEmployees;

	/**
	 * Compte le nombre d'employés de type STAFF pour un élément d'entreprise et ses enfants.
	 * @param item L'élément sur lequel effectuer le comptage
	 * @return Le nombre total d'employés de type STAFF
	 */
	public long getNumberStaffEmployees(CompanyItem item) {
		numberStaffEmployees = 0;
		item.accept(this);
		return numberStaffEmployees;
	}

	@Override
	public void visit(Subsidiary subsidiary) {
		// Une filiale n'est pas un employé, donc pas d'incrémentation
	}

	@Override
	public void visit(Employee employee) {
		if (employee.isStaffEmployee())
			numberStaffEmployees = numberStaffEmployees + 1;
	}

	@Override
	public void visit(Company company) {
		// Une entreprise n'est pas un employé, donc pas d'incrémentation
	}
}

/**
 * Visiteur qui compte le nombre d'employés administratifs dans une structure d'entreprise.
 */
class NumberAdministrativeEmployeesVisitor implements CompanyVisitor {
	/** Stocke le nombre d'employés administratifs comptés. */
	protected long numberAdministrativeEmployees;

	/**
	 * Compte le nombre d'employés administratifs pour un élément d'entreprise et ses enfants.
	 * @param item L'élément sur lequel effectuer le comptage
	 * @return Le nombre total d'employés administratifs
	 */
	public long getNumberAdministrativeEmployees(CompanyItem item)	{
		numberAdministrativeEmployees = 0;
		item.accept(this);
		return numberAdministrativeEmployees;
	}

	@Override
	public void visit(Subsidiary subsidiary) {
		// Une filiale n'est pas un employé, donc pas d'incrémentation
	}

	@Override
	public void visit(Employee employee) {
		if (employee.isAdministrativeEmployee())
			numberAdministrativeEmployees = 
                     numberAdministrativeEmployees + 1;
	}

	@Override
	public void visit(Company company) {
		// Une entreprise n'est pas un employé, donc pas d'incrémentation
	}
}
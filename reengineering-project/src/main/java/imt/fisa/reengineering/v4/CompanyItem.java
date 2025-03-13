package imt.fisa.reengineering.v4;

/**
 * Interface CompanyItem qui représente un élément générique dans la structure d'entreprise.
 * Cette interface est la base du pattern Visitor, permettant aux visiteurs d'effectuer
 * des opérations sur les éléments de l'entreprise sans modifier leur structure.
 */
public interface CompanyItem {

	/**
	 * Accepte un visiteur qui va effectuer une opération sur cet élément.
	 * Implémente le pattern Visitor.
	 * 
	 * @param visitor Le visiteur à accepter
	 */
	public void accept(CompanyVisitor visitor); 
}

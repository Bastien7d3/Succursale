package imt.fisa.reengineering.v4;

/**
 * Interface CompanyComposite qui représente un élément composite dans la structure d'entreprise.
 * Cette interface étend CompanyItem et permet de gérer une collection d'éléments d'entreprise.
 * Implémente le pattern Composite pour créer une structure hiérarchique d'objets.
 */
public interface CompanyComposite extends CompanyItem {
	
	/**
	 * Ajoute un élément d'entreprise à ce composite.
	 * @param item L'élément à ajouter
	 */
	public void addItem(CompanyItem item);
	
	/**
	 * Supprime un élément d'entreprise de ce composite.
	 * @param item L'élément à supprimer
	 */
	public void removeItem(CompanyItem item);
	
}

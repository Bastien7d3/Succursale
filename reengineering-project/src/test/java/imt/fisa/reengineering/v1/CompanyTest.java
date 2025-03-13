package imt.fisa.reengineering.v1;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import imt.fisa.reengineering.v1.Employee.EmployeeType;

/**
 * Classe de test pour vérifier les fonctionnalités de la classe Company.
 * Contient des tests pour valider le bon fonctionnement de différentes méthodes.
 */
public class CompanyTest {
	
	/**
	 * Instance de Company utilisée pour les tests
	 */
	Company company;

	/**
	 * Méthode d'initialisation exécutée avant chaque test.
	 * Crée une entreprise avec 4 employés de différents types.
	 */
	@Before
	public void setUp() throws Exception {
		company = new Company();
		company.addEmployee(new Employee(10, EmployeeType.STAFF));        // Ajout d'un employé STAFF avec salaire 10
		company.addEmployee(new Employee(20, EmployeeType.STAFF));        // Ajout d'un employé STAFF avec salaire 20
		company.addEmployee(new Employee(30, EmployeeType.ADMINISTRATIVE)); // Ajout d'un employé ADMINISTRATIVE avec salaire 30
		company.addEmployee(new Employee(40, EmployeeType.TECHNICAL));      // Ajout d'un employé TECHNICAL avec salaire 40
	}
	
	/**
	 * Test vérifiant que le nombre total d'employés est correct.
	 * On s'attend à avoir 4 employés au total.
	 */
	@Test
    public void testEmployees() {
        Assert.assertEquals(4, company.getNumberEmployees());
    }
	
	/**
	 * Test vérifiant le nombre total de nœuds dans l'entreprise.
	 * On s'attend à avoir 5 nœuds (1 entreprise + 4 employés).
	 */
	@Test
    public void testNodes() {
        Assert.assertEquals(5, company.getNumberNodes());
    }
	
	/**
	 * Test vérifiant le nombre d'employés administratifs.
	 * On s'attend à avoir 1 employé de type ADMINISTRATIVE.
	 */
	@Test
    public void testAdministrativeEmployees() {
        Assert.assertEquals(1, company.getNumberAdministrativeEmployees());
    }
	
	/**
	 * Test vérifiant le nombre d'employés réguliers.
	 * On s'attend à avoir 2 employés de type STAFF.
	 */
	@Test
    public void testStaffEmployees() {
        Assert.assertEquals(2, company.getNumberStaffEmployees());
    }
	
	/**
	 * Test vérifiant la masse salariale totale de l'entreprise.
	 * On s'attend à un total de 100 (10+20+30+40).
	 */
	@Test
    public void testWage() {
        Assert.assertEquals(100, company.getWage());
    }
}

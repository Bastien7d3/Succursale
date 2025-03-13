package imt.fisa.reengineering.v3;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import imt.fisa.reengineering.v3.Employee.EmployeeType;

public class CompanyTest {
	
	Company company;

	@Before
	public void setUp() throws Exception {
		company = new Company();
		company.addItem(new Employee(10, EmployeeType.STAFF));
		company.addItem(new Employee(20, EmployeeType.STAFF));
		company.addItem(new Employee(30, EmployeeType.ADMINISTRATIVE));
	
		company.addItem(new Employee(40, EmployeeType.TECHNICAL));
	    Subsidiary subsidiary = new Subsidiary();
	    subsidiary.addItem(new Employee(1000, EmployeeType.STAFF));
	    subsidiary.addItem(new Employee(2000, EmployeeType.STAFF));
	    subsidiary.addItem(new Employee(3000, EmployeeType.ADMINISTRATIVE));
	    subsidiary.addItem(new Employee(4000,EmployeeType.TECHNICAL));
	    company.addItem(subsidiary);
	}
	
	@Test 
	public void testSubsidiaries() {
        Assert.assertEquals(1, company.getNumberSubsidiaries());
    }
	
	@Test
    public void testEmployees() {
        Assert.assertEquals(8, company.getNumberEmployees());
    }
	
	@Test
    public void testNodes() {
        Assert.assertEquals(10, company.getNumberNodes());
    }
	
	@Test
    public void testAdministrativeEmployees() {
        Assert.assertEquals(2, company.getNumberAdministrativeEmployees());
    }
	
	@Test
    public void testStaffEmployees() {
        Assert.assertEquals(4, company.getNumberStaffEmployees());
    }
	
	@Test
    public void testWage() {
        Assert.assertEquals(10100, company.getWage());
    }
}

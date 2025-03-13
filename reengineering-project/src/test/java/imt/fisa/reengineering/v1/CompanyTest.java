package imt.fisa.reengineering.v1;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import imt.fisa.reengineering.v1.Employee.EmployeeType;

public class CompanyTest {
	
	Company company;

	@Before
	public void setUp() throws Exception {
		company = new Company();
		company.addEmployee(new Employee(10, EmployeeType.STAFF));
		company.addEmployee(new Employee(20, EmployeeType.STAFF));
		company.addEmployee(new Employee(30, EmployeeType.ADMINISTRATIVE));
		company.addEmployee(new Employee(40, EmployeeType.TECHNICAL));
	}
	
	@Test
    public void testEmployees() {
        Assert.assertEquals(4, company.getNumberEmployees());
    }
	
	@Test
    public void testNodes() {
        Assert.assertEquals(5, company.getNumberNodes());
    }
	
	@Test
    public void testAdministrativeEmployees() {
        Assert.assertEquals(1, company.getNumberAdministrativeEmployees());
    }
	
	@Test
    public void testStaffEmployees() {
        Assert.assertEquals(2, company.getNumberStaffEmployees());
    }
	
	@Test
    public void testWage() {
        Assert.assertEquals(100, company.getWage());
    }
}
